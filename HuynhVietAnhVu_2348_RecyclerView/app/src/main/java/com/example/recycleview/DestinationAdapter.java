package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class DestinationAdapter extends RecyclerView.Adapter<DestinationAdapter.ViewHolder> {

    private List<Destination> destinations;

    public DestinationAdapter(List<Destination> destinations) {
        this.destinations = destinations;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_destination, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Destination destination = destinations.get(position);

        holder.textName.setText(destination.getName());
        holder.textLocation.setText(destination.getLocation());
        holder.textDuration.setText(destination.getDuration());
        holder.textActivities.setText(destination.getActivities());
        holder.textPrice.setText(destination.getPrice());
        holder.textRating.setText(String.valueOf(destination.getRating()));
        holder.imageDestination.setImageResource(destination.getImageResource());

        // Click event cho từng item
        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(),
                    "Selected: " + destination.getName(),
                    Toast.LENGTH_SHORT).show();
        });

        // Long click event
        holder.itemView.setOnLongClickListener(v -> {
            Toast.makeText(v.getContext(),
                    "Booking " + destination.getName() + " for " + destination.getPrice(),
                    Toast.LENGTH_LONG).show();
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return destinations.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageDestination;
        TextView textName, textLocation, textDuration, textActivities, textPrice, textRating;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageDestination = itemView.findViewById(R.id.imageDestination);
            textName = itemView.findViewById(R.id.textDestinationName);
            textLocation = itemView.findViewById(R.id.textLocation);
            textDuration = itemView.findViewById(R.id.textDuration);
            textActivities = itemView.findViewById(R.id.textActivities);
            textPrice = itemView.findViewById(R.id.textPrice);
            textRating = itemView.findViewById(R.id.textRating);
        }
    }
}