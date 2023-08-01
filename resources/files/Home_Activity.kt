package com.example.stays

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Room
import androidx.room.RoomDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class HomeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cardAdapter: CardAdapter
    private lateinit var cardDao: CardDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val appDatabase = AppDatabase.getInstance(this)
        cardDao = appDatabase.cardDao()

        recyclerView = findViewById(R.id.recyclerViewCards)
        recyclerView.layoutManager = LinearLayoutManager(this)
        cardAdapter = CardAdapter()
        recyclerView.adapter = cardAdapter

        populateCardsFromDatabase()
    }

    private fun populateCardsFromDatabase() {
        GlobalScope.launch(Dispatchers.Main) {
            val cardsList = withContext(Dispatchers.IO) { cardDao.getAllCards() }

            if (cardsList.isEmpty()) {
                val sampleCardData = getSampleCardData()
                cardDao.insertCard(sampleCardData)
                cardAdapter.setCards(listOf(sampleCardData))
            } else {
                cardAdapter.setCards(cardsList)
            }
        }
    }

    private fun getSampleCardData(): CardData {
        return CardData(
            photoResourceId = R.drawable.photo,
            address = "Sample Address",
            addressLine2 = "Sample 2nd Address Line",
            rating = 4.0,
            availableDate = "Avail: Sample Date",
            pricePerNight = "£69/night",
            distanceFromLocation = "1.0 miles"
        )
    }

    @Entity(tableName = "card_data")
    data class CardData(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        val photoResourceId: Int,
        val address: String,
        val addressLine2: String,
        val rating: Double,
        val availableDate: String,
        val pricePerNight: String,
        val distanceFromLocation: String
    )

    @Dao
    interface CardDao {
        @Insert(onConflict = OnConflictStrategy.REPLACE)
        suspend fun insertCard(cardData: CardData)

        @androidx.room.Query("SELECT * FROM card_data")
        suspend fun getAllCards(): List<CardData>
    }

    @Database(entities = [CardData::class], version = 1, exportSchema = false)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun cardDao(): CardDao

        companion object {
            @Volatile
            private var instance: AppDatabase? = null

            fun getInstance(context: Context): AppDatabase =
                instance ?: synchronized(this) {
                    instance ?: buildDatabase(context).also { instance = it }
                }

            private fun buildDatabase(context: Context) =
                Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "stays_db"
                ).build()
        }
    }

    class CardAdapter : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {
        private val cardsList = mutableListOf<CardData>()

        fun setCards(cards: List<CardData>) {
            cardsList.clear()
            cardsList.addAll(cards)
            notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
            return CardViewHolder(view)
        }

        override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
            val cardData = cardsList[position]
            holder.bindData(cardData)
        }

        override fun getItemCount(): Int {
            return cardsList.size
        }

        class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val imageView: ImageView = itemView.findViewById(R.id.image)
            private val textAddress: TextView = itemView.findViewById(R.id.text_address)
            private val textAddressLine2: TextView = itemView.findViewById(R.id.text_address_line2)
            private val textRating: TextView = itemView.findViewById(R.id.text_rating)
            private val textAvailDate: TextView = itemView.findViewById(R.id.text_avail_date)
            private val textPrice: TextView = itemView.findViewById(R.id.text_price)
            private val textDistance: TextView = itemView.findViewById(R.id.text_distance)

            fun bindData(cardData: CardData) {
                imageView.setImageResource(cardData.photoResourceId)
                textAddress.text = cardData.address
                textAddressLine2.text = cardData.addressLine2
                textRating.text = "${cardData.rating} Rating"
                textAvailDate.text = cardData.availableDate
                textPrice.text = cardData.pricePerNight
                textDistance.text = cardData.distanceFromLocation
            }
        }
    }
}
