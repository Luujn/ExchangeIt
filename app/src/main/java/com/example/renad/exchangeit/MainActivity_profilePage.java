package com.example.renad.exchangeit;

import android.app.Fragment;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
public class MainActivity_profilePage extends AppCompatActivity {
private BottomNavigationView navigation;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main_profile_page);
        navigation  = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    BottomNavigationView.OnNavigationItemSelectedListener  mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            fragment_profile fragment = new fragment_profile();
            fragment_seartch fragment_seartch = new fragment_seartch();
            fragment_sitting fragment_sitting = new fragment_sitting();
            fragment_reqest fragment_reqest = new fragment_reqest();
            switch (item.getItemId()) {
                case R.id.search:
                    loadFragment(fragment);
                 return true;
                 //-------------------------------------------------------------
                case R.id.profile:
                    loadFragment(fragment_seartch);
                    return true;
                 //------------------------------------------------------
                case R.id.sitting:
                    loadFragment(fragment_sitting);
                    return true;
                 //---------------------------------------------------
                case R.id.requests:
                    loadFragment(fragment_reqest);
                    return true;

            }
            return false;
        }
    };

    private void loadFragment(fragment_reqest fragment_reqest) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment_reqest);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void loadFragment(fragment_sitting fragment_sitting) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment_sitting);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void loadFragment(fragment_seartch fragment_seartch) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment_seartch);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void loadFragment(fragment_profile fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


}
