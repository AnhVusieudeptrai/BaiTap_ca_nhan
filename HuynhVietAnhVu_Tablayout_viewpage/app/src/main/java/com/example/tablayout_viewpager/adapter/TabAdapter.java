package com.example.tablayout_viewpager.adapter;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.tablayout_viewpager.fragment.RacketFragment;
import com.example.tablayout_viewpager.fragment.ShoesFragment;
import com.example.tablayout_viewpager.fragment.ShuttlecockFragment;

public class TabAdapter extends FragmentStateAdapter {

    public TabAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new RacketFragment();
            case 1: return new ShoesFragment();
            default: return new ShuttlecockFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
