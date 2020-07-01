package com.example.weather.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weather.R;
import com.example.weather.adapter.State;

import static android.content.ContentValues.TAG;
import static com.example.weather.MainActivity.EXTRA_STATE;


public class Fragment_Activity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.fragment_activity);
        }catch (Exception e){
            Log.d(TAG, "onCreate", e);
                    throw e;
        }

        ImageView  imageView = findViewById (R.id.flag);
        TextView textViewState = findViewById (R.id.capital);


        Intent intent = getIntent();

        State state = (State) intent.getSerializableExtra(EXTRA_STATE);
        if (state != null) {
            Toast.makeText(this, state.getName(), Toast.LENGTH_SHORT).show();
        }

        //imageView.setImageResource(state.getFlagResource());
        textViewState.setText(state.getName());
        //textViewCapital.setText(state.getCapital());



        Fragment  frag1 = new Fragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fragment_f, frag1);
        

        frag1 = getSupportFragmentManager().findFragmentById(R.id.fragment_f);

       ((ImageView) frag1.getView().findViewById(R.id.flag)).setImageResource(state.getFlagResource());







    }
}
