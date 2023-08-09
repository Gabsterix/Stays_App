package com.example.stays;

import static android.app.PendingIntent.getActivity;
import static androidx.core.content.ContentProviderCompat.requireContext;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.stays.Fragments.HomeMasterFragment;
import com.example.stays.Models.Property;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PropertyDataAdapter extends RecyclerView.Adapter<PropertyDataAdapter.ViewHolder> {

    private Context context;

    private ArrayList<Property> propertyDataModels;

    public PropertyDataAdapter(Context context, ArrayList<Property> propertyDataModels) {
        this.context = context;
        this.propertyDataModels = propertyDataModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.property_card_row, parent, false);

        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.addressText.setText(String.valueOf(propertyDataModels.get(position).getAddress()));
        holder.ratingText.setText(String.valueOf(propertyDataModels.get(position).getStar_rating()));
        holder.mileageText.setText(String.valueOf(propertyDataModels.get(position).getMileage()) + " miles from city");
        holder.priceText.setText("£" + String.valueOf(propertyDataModels.get(position).getRate_per_night()));
//        Bitmap bitmap = BitmapFactory.decodeResource(context.getResource(), propertyDataModels.get(position).getImage_uri());
//        holder.imageView.setImageBitmap(bitmap);
//        Picasso.get().load(String.valueOf(propertyDataModels.get(position).getImage_uri()));
//        String url = "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link";
//        String myurl = "https://www.dropbox.com/scl/fi/v3be9qonxj3qloj4z2sqp/beach01.webp?rlkey=ppcb34y2iy9wrkkmxbfs3ykoc&dl=0";
//        holder.imageView.setImageResource(propertyDataModels.get(position).getImage_uri());
        Picasso.get().load(propertyDataModels.get(position).getImage_uri())
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(holder.imageView);

//        Picasso.get().load(url)
//                .placeholder(R.drawable.placeholder)
//                .error(R.drawable.placeholder)
//                .resize(100,60)
//                .into(holder.imageView);
//        Glide.with(context)
//                .load(propertyDataModels.get(position).getImage_uri())
//                .placeholder(R.drawable.placeholder)
//                .centerCrop()
//                .into(holder.imageView);

//        Glide.with(context)
//                .load(myurl)
//                .placeholder(R.drawable.placeholder)
//                .centerCrop()
//                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return propertyDataModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        Declare your variable objects
        ImageView imageView;
        TextView addressText, ratingText, mileageText, priceText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.propertyImage);
            addressText = (TextView) itemView.findViewById(R.id.tvAddressLine);
            ratingText = (TextView) itemView.findViewById(R.id.tvRating);
            mileageText = (TextView) itemView.findViewById(R.id.tvMileage);
            priceText = (TextView) itemView.findViewById(R.id.tvPrice);
        }
    }
}
