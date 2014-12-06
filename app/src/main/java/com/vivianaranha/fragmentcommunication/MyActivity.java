package com.vivianaranha.fragmentcommunication;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MyActivity extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public void respond(String data) {
        FragmentB f2 = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        f2.changeText(data);
    }
}
