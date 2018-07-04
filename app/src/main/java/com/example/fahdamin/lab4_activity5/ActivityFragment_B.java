package com.example.fahdamin.lab4_activity5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityFragment_B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment__b);

        Intent intent=getIntent();

        int index = intent.getIntExtra("index",0);
        Fragment_B frag_b=(Fragment_B) getFragmentManager().findFragmentById(R.id.fragment2);
        frag_b.changeText(index);
    }
}
