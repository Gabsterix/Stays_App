package com.example.stays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stays.Models.PropertyDataModel;

import java.util.ArrayList;

public class PropertyDataAdapter extends RecyclerView.Adapter<PropertyDataAdapter.ViewHolder> {

    private Context context;
    private ArrayList<PropertyDataModel> propertyDataModels;

    public PropertyDataAdapter(Context context, ArrayList<PropertyDataModel> propertyDataModels) {
        this.context = context;
        this.propertyDataModels = propertyDataModels;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.property_card_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PropertyDataModel propertyData = propertyDataModels.get(position);

        holder.addressText.setText(String.valueOf(propertyData.getAddress()));
        holder.ratingText.setText(String.valueOf(propertyData.getRating()));
        holder.mileageText.setText(propertyData.getMileage() + " miles from city");
        holder.priceText.setText(propertyData.getPrice());

        int imageResource = getImageResource(position);
        holder.imageView.setImageResource(imageResource);
    }

    @Override
    public int getItemCount() {
        return propertyDataModels.size();
    }

    private int getImageResource(int position) {
        int[] imageResources = {
                R.drawable.beach_1, R.drawable.beach_2, R.drawable.beach_3, R.drawable.beach_4,
                R.drawable.cabin_1, R.drawable.cabin_2, R.drawable.cabin_3, R.drawable.cabin_4,
                R.drawable.camp_1, R.drawable.camp_2, R.drawable.camp_5, R.drawable.camp_4,
                R.drawable.hotel_1, R.drawable.hotel_2, R.drawable.hotel_3, R.drawable.hotel_4
        };

        if (position >= 0 && position < imageResources.length) {
            return imageResources[position];
        } else {
            return R.drawable.placeholder;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView addressText, ratingText, mileageText, priceText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.propertyImage);
            addressText = itemView.findViewById(R.id.tvAddressLine);
            ratingText = itemView.findViewById(R.id.tvRating);
            mileageText = itemView.findViewById(R.id.tvMileage);
            priceText = itemView.findViewById(R.id.tvPrice);
        }
    }
}
