package com.example.fahdamin.lab4_activity5;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {
    Fragment_B frag_b;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(int i) {

        int ii=i;
        manager = getFragmentManager();
        frag_b= (Fragment_B) manager.findFragmentById(R.id.fragment2);

        if(frag_b!=null && frag_b.isVisible()){
                frag_b.changeText(ii);
        }
        else{
            Intent intent=new Intent(this,ActivityFragment_B.class);
            intent.putExtra("index",ii);
            startActivity(intent);
        }

    }
}
