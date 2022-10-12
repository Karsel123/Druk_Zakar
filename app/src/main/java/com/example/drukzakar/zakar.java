package com.example.drukzakar;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

public class zakar extends Fragment {

    private TabLayout tab;
    private ViewPager vp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_zakar, container, false);

            tab=view.findViewById(R.id.tabLayout);
            vp=view.findViewById(R.id.vPager1);
            tab.setupWithViewPager(vp);

        FvppAdapter vpAdapter=new FvppAdapter(getActivity().getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new zakar_selectDate(),"Select Date");
        vpAdapter.addFragment(new zakar_dzongkha(),"Dzongkha");
        vpAdapter.addFragment(new zakar_english(),"English");
        vpAdapter.addFragment(new zakar_audio(),"Audio");
        vp.setAdapter(vpAdapter);


        return view;
    }
}