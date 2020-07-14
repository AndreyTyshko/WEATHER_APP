package com.example.weather.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.weather.R;
import com.example.weather.adapter.State;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FlagFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FlagFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String EXTRA_STATE = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private int flagResource;
    private String mParam2;
    private ImageView mImageView;
    private com.example.weather.adapter.State state;
    private static final String ARG_CRIME_ID = "crime_id";


    public FlagFragment() {
        // Required empty public constructor


    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * <p>
     * //* @param param1 Parameter 1.
     * // * @param param2 Parameter 2.
     *
     * @return A new instance of fragment FlagFragment.
     */
    // TODO: Rename and change types and number of parameters
  /*  public static FlagFragment newInstance(String param1, String param2) {
        FlagFragment fragment = new FlagFragment();
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_STATE, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;


    }*/
    public static FlagFragment newInstance(State flagId) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_STATE, flagId);
        FlagFragment flagFragment = new FlagFragment();
        flagFragment.setArguments(args);
        return flagFragment;
  }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            State fragID = (State) getArguments().getSerializable(EXTRA_STATE);
            flagResource = fragID.getFlagResource();

        //    mParam1 = Integer.parseInt(getArguments().getString(EXTRA_STATE));
        //    mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_flag, container, false);
        mImageView = v.findViewById(R.id.flag);
        mImageView.setImageResource(flagResource);





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