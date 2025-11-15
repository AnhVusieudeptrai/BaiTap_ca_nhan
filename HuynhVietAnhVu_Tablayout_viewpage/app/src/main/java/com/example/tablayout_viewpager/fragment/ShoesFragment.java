package com.example.tablayout_viewpager.fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablayout_viewpager.R;
import com.example.tablayout_viewpager.adapter.ShoesAdapter;
import com.example.tablayout_viewpager.model.Product;

import java.util.ArrayList;

public class ShoesFragment extends Fragment {

    RecyclerView rv;
    ArrayList<Product> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shoes, container, false);

        rv = view.findViewById(R.id.rvShoes);
        rv.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();
        list.add(new Product(R.drawable.shoes1, "Giày Yonex 65Z4", "3.200.000đ"));
        list.add(new Product(R.drawable.shoes2, "Giày Yonex Comfort", "3.000.000đ"));
        list.add(new Product(R.drawable.shoes1, "Giày Yonex 65Z4", "3.200.000đ"));
        list.add(new Product(R.drawable.shoes1, "Giày Yonex 65Z4", "3.200.000đ"));
        list.add(new Product(R.drawable.shoes1, "Giày Yonex 65Z4", "3.200.000đ"));
        list.add(new Product(R.drawable.shoes1, "Giày Yonex 65Z4", "3.200.000đ"));
        list.add(new Product(R.drawable.shoes1, "Giày Yonex 65Z4", "3.200.000đ"));
        list.add(new Product(R.drawable.shoes1, "Giày Yonex 65Z4", "3.200.000đ"));
        list.add(new Product(R.drawable.shoes1, "Giày Yonex 65Z4", "3.200.000đ"));
        list.add(new Product(R.drawable.shoes1, "Giày Yonex 65Z4", "3.200.000đ"));

        ShoesAdapter adapter = new ShoesAdapter(list);
        rv.setAdapter(adapter);

        return view;
    }
}
