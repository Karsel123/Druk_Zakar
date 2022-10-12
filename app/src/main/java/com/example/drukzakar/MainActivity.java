package com.example.drukzakar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout) findViewById(R.id.mainTab);
        viewPager=(ViewPager) findViewById(R.id.vPager);
        tabLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter=new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new zakar(),"zakar");
        vpAdapter.addFragment(new calendar(),"calendar");
        vpAdapter.addFragment(new datho_frag(),"datho");
        vpAdapter.addFragment(new aboutUsFrag(),"About Us");
        vpAdapter.addFragment(new contactUsFrag(),"Contact Us");
        viewPager.setAdapter(vpAdapter);
    }
    public void onZakarCall(View view) {
    }
    public void calendarCall(View view) {
        replaceMainFragment(new calendar());
    }
    public void starCall(View view) {
    }
    public void onInfoCall(View view) {
    }
    public void onContactCall(View view) {
    }
    private void replaceMainFragment(Fragment f1){
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
       // fragmentTransaction.replace(R.id.frameLayout,f1);
        fragmentTransaction.commit();
    }
}