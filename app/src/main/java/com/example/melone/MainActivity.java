package com.example.melone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.Bottom_Nav);
//        bottomNavigationView.setOnNavigationItemSelectedListener(onNav);


    }

//    private BottomNavigationView.OnNavigationItemSelectedListener onNav = new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//            Fragment selected = null;
//            switch (item.getItemId()) {
//                case R.id.profile_bottom:
//                    selected = new HomeFragment();
//                    break;
//            }
//
//            Fragment selected = null;
//            switch (item.getItemId()) {
//                case R.id.home_bottom:
//                    selected = new HomeFragment();
//                    break;
//            }
//
//            Fragment selected = null;
//            switch (item.getItemId()) {
//                case R.id.profile_bottom:
//                    selected = new HomeFragment();
//                    break;
//            }
//            return true;
//        }
    }
}