package com.example.fahdamin.lab4_activity5;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by FaHD Amin on 20-Sep-17.
 */

public class Fragment_A extends Fragment implements AdapterView.OnItemClickListener {
    ListView list;
    Communicator comm;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm= (Communicator) getActivity();
        list=(ListView) getActivity().findViewById(R.id.listView);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(),R.array.string_array_list_names,android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        comm.respond(i);
    }
}
