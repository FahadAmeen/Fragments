package com.example.fahdamin.lab4_activity5;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by FaHD Amin on 20-Sep-17.
 */

public class Fragment_B extends Fragment {
    TextView tv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_b,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
    public void changeText(int i){
        String[] description=getResources().getStringArray(R.array.string_array_description);
        tv=(TextView) getActivity().findViewById(R.id.textView);
        tv.setText(description[i]);
    }

}
