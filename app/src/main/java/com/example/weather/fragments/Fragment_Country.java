package com.example.weather.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.weather.R;
import com.example.weather.adapter.State;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Country#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Country extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String EXTRA_STATE = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TextView  countryTextView;
    private TextView  stateTextView;

    private com.example.weather.adapter.State state;
    private String countryName;


    public Fragment_Country() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
    // * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Country.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Country newInstance(State   param1) {

        Bundle args = new Bundle();
        args.putSerializable(EXTRA_STATE, param1);
        Fragment_Country fragment_country = new Fragment_Country();
        //args.putString(ARG_PARAM2, param2);
        fragment_country.setArguments(args);
        return fragment_country;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        if (getArguments() != null) {
            State param1 = (State) getArguments().getSerializable(EXTRA_STATE);
            countryName = param1.getCapital();



        }
        setRetainInstance(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


       View v  = inflater.inflate(R.layout.fragment_country, container,false);
       countryTextView = v.findViewById(R.id.capital);
       countryTextView.setText(countryName);

       return v;

    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("saveCountry", countryName);
    }
}
