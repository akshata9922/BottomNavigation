package com.example.felix_its.bottomnavigation.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.felix_its.bottomnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RatingFragment extends Fragment {
    RatingBar ratingBar;
    Button btnselect;


    public RatingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_rating, container, false);
        // Inflate the layout for this fragment
        ratingBar=view.findViewById(R.id.ratingBar);
        btnselect=view.findViewById(R.id.btnselect);



       btnselect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Rating=String.valueOf(ratingBar.getRating());
                Toast.makeText(getActivity(),Rating,Toast.LENGTH_LONG).show();
            }
        });
        return view;


    }
}
