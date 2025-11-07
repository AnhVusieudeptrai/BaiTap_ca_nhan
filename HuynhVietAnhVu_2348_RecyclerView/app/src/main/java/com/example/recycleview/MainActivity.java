package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.app.Activity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private RecyclerView recyclerView;
    private DestinationAdapter adapter;
    private List<Destination> destinations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // Khởi tạo dữ liệu
        destinations = new ArrayList<>();
        destinations.add(new Destination(
                "Bali Paradise",
                "Bali, Indonesia",
                "7 Days",
                "15+ Activities",
                "$1,299",
                4.8,
                R.drawable.bali
        ));

        destinations.add(new Destination(
                "Tokyo Adventure",
                "Tokyo, Japan",
                "5 Days",
                "20+ Activities",
                "$1,899",
                4.9,
                R.drawable.tokyo
        ));

        destinations.add(new Destination(
                "Paris Romance",
                "Paris, France",
                "6 Days",
                "12+ Activities",
                "$2,199",
                4.7,
                R.drawable.paris
        ));

        destinations.add(new Destination(
                "Dubai Luxury",
                "Dubai, UAE",
                "4 Days",
                "18+ Activities",
                "$2,499",
                4.9,
                R.drawable.dubai
        ));

        destinations.add(new Destination(
                "Maldives Escape",
                "Maldives",
                "8 Days",
                "10+ Activities",
                "$3,299",
                5.0,
                R.drawable.maldives
        ));

        destinations.add(new Destination(
                "New York City",
                "New York, USA",
                "5 Days",
                "25+ Activities",
                "$1,799",
                4.6,
                R.drawable.newyorkcity
        ));

        // Set adapter
        adapter = new DestinationAdapter(destinations);
        recyclerView.setAdapter(adapter);
    }
}