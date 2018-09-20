package com.example.jatin.casestudy2;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFrag extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment, container, false);
        return view;
    }
    public void setText(String item) {
        TextView view = (TextView) getView().findViewById(R.id.captain);
        view.setText(item);
    }

    public void setImage(String item) {
        ImageView view = (ImageView) getView().findViewById(R.id.imageView);
        view.setImageResource(0);
    }
}
