package com.example.tablayout_viewpager.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablayout_viewpager.R;
import com.example.tablayout_viewpager.adapter.ShuttlecockAdapter;
import com.example.tablayout_viewpager.model.Product;

import java.util.ArrayList;

public class ShuttlecockFragment extends Fragment {

    RecyclerView rv;
    ArrayList<Product> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shuttlecock, container, false);

        rv = view.findViewById(R.id.rvShuttle);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();
        list.add(new Product(R.drawable.shuttle1, "Cầu Yonex AS-30", "450.000đ"));
        list.add(new Product(R.drawable.shuttile2, "Cầu Yonex A+300", "380.000đ"));
        list.add(new Product(R.drawable.shuttile2, "Cầu Yonex A+300", "380.000đ"));
        list.add(new Product(R.drawable.shuttile2, "Cầu Yonex A+300", "380.000đ"));
        list.add(new Product(R.drawable.shuttile2, "Cầu Yonex A+300", "380.000đ"));
        list.add(new Product(R.drawable.shuttile2, "Cầu Yonex A+300", "380.000đ"));
        list.add(new Product(R.drawable.shuttile2, "Cầu Yonex A+300", "380.000đ"));
        list.add(new Product(R.drawable.shuttile2, "Cầu Yonex A+300", "380.000đ"));
        list.add(new Product(R.drawable.shuttile2, "Cầu Yonex A+300", "380.000đ"));
        list.add(new Product(R.drawable.shuttile2, "Cầu Yonex A+300", "380.000đ"));

        ShuttlecockAdapter adapter = new ShuttlecockAdapter(list);
        rv.setAdapter(adapter);

        return view;
    }
}
