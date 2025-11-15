package com.example.tablayout_viewpager.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tablayout_viewpager.R;
import com.example.tablayout_viewpager.adapter.RacketAdapter;
import com.example.tablayout_viewpager.model.Product;

import java.util.ArrayList;

public class RacketFragment extends Fragment {

    RecyclerView rv;
    ArrayList<Product> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_racket, container, false);

        rv = view.findViewById(R.id.rvRacket);
        rv.setLayoutManager(new GridLayoutManager(getContext(), 2));

        list = new ArrayList<>();
        list.add(new Product(R.drawable.racket1, "Vợt Yonex 1000z", "6.500.000đ"));
        list.add(new Product(R.drawable.racket1, "Vợt Yonex 1000z", "6.500.000đ"));
        list.add(new Product(R.drawable.racket1, "Vợt Yonex 1000z", "6.500.000đ"));
        list.add(new Product(R.drawable.racket1, "Vợt Yonex 1000z", "6.500.000đ"));
        list.add(new Product(R.drawable.racket1, "Vợt Yonex 1000z", "6.500.000đ"));
        list.add(new Product(R.drawable.racket2, "Vợt Yonex 100zz Navy", "5.800.000đ"));

        RacketAdapter adapter = new RacketAdapter(list);
        rv.setAdapter(adapter);

        return view;
    }
}
