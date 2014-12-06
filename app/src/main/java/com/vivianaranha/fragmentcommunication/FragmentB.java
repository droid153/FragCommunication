package com.vivianaranha.fragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vivianaranha on 8/12/14.
 */
public class FragmentB extends Fragment {

    TextView tv;
    String data;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        if(savedInstanceState != null) {
            data = savedInstanceState.getString("text");
            TextView textView = (TextView) view.findViewById(R.id.textView);
            textView.setText(data);
        }
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tv = (TextView) getActivity().findViewById(R.id.textView);
    }

//    @Override
//    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putString("text", data);
//    }

    public void changeText(String data) {
        this.data = data;
        tv.setText(data);
    }
}
