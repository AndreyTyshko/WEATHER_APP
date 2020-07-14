package com.example.weather.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.weather.R;
import com.example.weather.adapter.State;

import static android.content.ContentValues.TAG;
import static com.example.weather.MainActivity.EXTRA_STATE;


public class Fragment_Activity extends FragmentActivity {
    Fragment mFragment1 = new FlagFragment();
    Fragment mFragment2 = new Fragment_Country();
    // com.example.weather.adapter.State state;
    FragmentTransaction mFragmentTransaction;
    private static final String ARG_FLAG_ID = "flag_ig";
    private Button mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            setContentView(R.layout.fragment_activity);
        } catch (Exception e) {
            Log.d(TAG, "onCreate", e);
            throw e;
        }

        mButton1 = findViewById(R.id.button3);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createFragmentFlag();
                createFragmentCountry();
            }
        });


        //CreateFragment();

        //ImageView  imageView = findViewById (R.id.flag);
        //TextView textViewState = findViewById (R.id.capital);


        Intent intent = getIntent();

        State state = (State) intent.getSerializableExtra(EXTRA_STATE);
        if (state != null) {
            Toast.makeText(this, state.getName(), Toast.LENGTH_SHORT).show();
        }

        //imageView.setImageResource(state.getFlagResource());
        //textViewState.setText(state.getName());
        //textViewCapital.setText(state.getCapital());
        /*Fragment  frag1 = new Fragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_f, frag1);


        frag1 = getSupportFragmentManager().findFragmentById(R.id.fragment_f);*/


        //mFragmentTransaction = getSupportFragmentManager().beginTransaction();

        //mFragmentTransaction.add(R.id.fragment_f, mFragment1);
//        ((ImageView) mFragment1.getView().findViewById(R.id.flag)).setImageResource(state.getFlagResource());

        // mFragmentTransaction.add(R.id.fragment_c, mFragment2);


//Bundle bundle = new Bundle();


    }

    public void createFragmentFlag() {

        State fragID = (State) getIntent().getSerializableExtra(EXTRA_STATE);


        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_f);

        if (fragment == null) {
            fragment = FlagFragment.newInstance(fragID);

        }

        fm.beginTransaction()
                .add(R.id.fragment_f, fragment)
                .commit();
    }

    public void createFragmentCountry() {


        State countryID = (State) getIntent().getSerializableExtra(EXTRA_STATE);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragmentCountry = fm.findFragmentById(R.id.fragment_c);
        if (fragmentCountry == null) {
            fragmentCountry = Fragment_Country.newInstance(countryID);
        }
        fm.beginTransaction()
                .add(R.id.fragment_c, fragmentCountry)
                .commit();
    }


}
