package com.last4.android3.yangonbusguide.Categories;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.last4.android3.yangonbusguide.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NorthFragment extends Fragment {


    public NorthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_north, container, false);
    }

}
