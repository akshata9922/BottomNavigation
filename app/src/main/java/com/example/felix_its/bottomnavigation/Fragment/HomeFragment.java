package com.example.felix_its.bottomnavigation.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.felix_its.bottomnavigation.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    Spinner spnarea;
    Button btnsave;
    String area[]={"Vimannagar","Hadpasar","Vishrantwadi","Deccan","M.G. Road","Swarget","Pune Station"};


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        spnarea=view.findViewById(R.id.spnarea);
        ArrayAdapter AreaAdapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,area);
        spnarea.setAdapter(AreaAdapter);
        return view;

    }

}
