//package com.example.stays;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.bumptech.glide.Glide;
//import com.example.stays.Fragments.HomeMasterFragment;
//import com.example.stays.Models.Property;
//import com.squareup.picasso.Picasso;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class PropertyRecyclerAdapter extends RecyclerView.Adapter<PropertyRecyclerAdapter.ViewHolder> {
//
//    private Context context;
//
//    private List<Property> propertyList;
//
//    private ArrayList prop_id, property_code, country, location, property_name, building_no,
//            address, postcode, rental_type, child_friendly, disability_friendly,
//            no_rooms, no_bathroom, no_toilets, property_type, star_rating, rate_per_night, mileage, image_uri, description;
//
//    public PropertyRecyclerAdapter(Context context,  ArrayList address, ArrayList star_rating, ArrayList rate_per_night, ArrayList mileage, ArrayList image_uri) {
//        this.context = context;
////        this.building_no = building_no;
//        this.address = address;
//        this.star_rating = star_rating;
//        this.rate_per_night = rate_per_night;
//        this.mileage = mileage;
//        this.image_uri = image_uri;
//
//        // Set propertyList using the provided data
//        propertyList = new ArrayList<>();
//        for (int i = 0; i < building_no.size(); i++) {
//            Property property = new Property();
//            // Set property data here based on the ArrayLists
//            propertyList.add(property);
//        }
//    }
//
////    public PropertyRecyclerAdapter(Context context, ArrayList prop_id, ArrayList property_code, ArrayList country, ArrayList location, ArrayList property_name, ArrayList building_no, ArrayList address, ArrayList postcode, ArrayList rental_type, ArrayList child_friendly, ArrayList disability_friendly, ArrayList no_rooms, ArrayList no_bathroom, ArrayList no_toilets, ArrayList property_type, ArrayList star_rating, ArrayList rate_per_night, ArrayList mileage, ArrayList image_uri, ArrayList description) {
////        this.context = context;
////        this.prop_id = prop_id;
////        this.property_code = property_code;
////        this.country = country;
////        this.location = location;
////        this.property_name = property_name;
////        this.building_no = building_no;
////        this.address = address;
////        this.postcode = postcode;
////        this.rental_type = rental_type;
////        this.child_friendly = child_friendly;
////        this.disability_friendly = disability_friendly;
////        this.no_rooms = no_rooms;
////        this.no_bathroom = no_bathroom;
////        this.no_toilets = no_toilets;
////        this.property_type = property_type;
////        this.star_rating = star_rating;
////        this.rate_per_night = rate_per_night;
////        this.mileage = mileage;
////        this.image_uri = image_uri;
////        this.description = description;
////
////        // Set propertyList using the provided data
////        propertyList = new ArrayList<>();
////        for (int i = 0; i < building_no.size(); i++) {
////            Property property = new Property();
////            // Set property data here based on the ArrayLists
////            propertyList.add(property);
////        }
////    }
//
//    public PropertyRecyclerAdapter(List<Property> propertyList) {
//        this.context = null;
//        if (propertyList == null) {
//            this.propertyList = new ArrayList<>(); // Initialize with an empty list
//        } else {
//            this.propertyList = propertyList;
//        }
//    }
//
//
//    @NonNull
//    @Override
//    public PropertyRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
////        View view = LayoutInflater.from(context).inflate(R.layout.property_card_row,parent,false);
////        return new ViewHolder(view);
//
//        LayoutInflater inflater = LayoutInflater.from(context); // Make sure 'context' is not null
//        View view = inflater.inflate(R.layout.property_card_row, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull PropertyRecyclerAdapter.ViewHolder holder, int position) {
//
////        holder.building_No.setText(String.valueOf(building_no.get(position)));
//        holder.address.setText(String.valueOf(address.get(position)));
//        holder.ratings.setText(String.valueOf(star_rating.get(position)));
//        holder.mileage.setText(String.valueOf(mileage.get(position)));
//        holder.price.setText(String.valueOf(rate_per_night.get(position)));
////        holder.imagePath.setText(String.valueOf(image_uri.get(position)));
////        holder.imagePath.setText(String.valueOf(image_uri.get(position)));
////        String imagePath = String.valueOf(image_uri.get(position));
//        Glide.with(context)
//                .load(String.valueOf(image_uri.get(position)))
//                .placeholder(R.drawable.beach_1)
//                .into(holder.imageView);
////        Picasso.get()
////                .load(String.valueOf(holder.imagePath))
////                .into(holder.imageView);
////        Picasso.get().load(String.valueOf(holder.imagePath)).into(holder.imageView);
//
////        Picasso.get().load(imagePath).into(holder.imageView);
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return 16;
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder {
//
//        TextView building_No, address, ratings, mileage, price, imagePath;
//
//        ImageView imageView;
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//
//            address = (TextView) itemView.findViewById(R.id.tvAddressLine);
////            building_No = itemView.findViewById(R.id.tvAddressLine);
////            address = itemView.findViewById(R.id.tvAddressLine2);
//            ratings = (TextView) itemView.findViewById(R.id.tvRating);
//            mileage = (TextView) itemView.findViewById(R.id.tvMileage);
//            price = (TextView) itemView.findViewById(R.id.tvPrice);
////            imagePath = itemView.findViewById(R.id.tvImagePath);
//            imageView = (ImageView) itemView.findViewById(R.id.propertyImage);
////            image_uri = itemView.findViewById(R.id.tvImagePath);
//
//        }
//    }
//}
