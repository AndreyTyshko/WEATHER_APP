package com.example.weather.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weather.R;

import static android.content.ContentValues.TAG;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FlagFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FlagFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView mImageView;


    public FlagFragment() {
        // Required empty public constructor


    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FlagFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FlagFragment newInstance(String param1, String param2) {
        FlagFragment fragment = new FlagFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View  v  = inflater.inflate(R.layout.fragment_flag, container, false);
        mImageView = (ImageView) v.findViewById(R.id.flag);

       /* try {
            View v = inflater.inflate(R.layout.fragment_flag, container,false);
            return v;
        } catch (Exception e) {
            Log.e(TAG, "onCreateView", e);
            throw e;
        }*/

    /*    public void setText(String item) {
            TextView view = (TextView) getView().findViewById(R.id.detailsText);
            view.setText(item);

    }*/;
            return v;

}
}