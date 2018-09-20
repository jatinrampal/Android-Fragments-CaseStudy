package com.example.jatin.casestudy2;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

// import all classes
public class ListFrag extends ListFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String[] values = new String[] { "Daredevil", "Jessica Jones", "Luke Cage", "Iron Fist", "Punisher"};
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
}
        @Override
        public void onListItemClick(ListView l, View v, int position, long id) {
            String item = (String) getListAdapter().getItem(position);
            DetailFrag frag = (DetailFrag)
                    getFragmentManager().findFragmentById(R.id.frag_capt);
            if (frag != null && frag.isInLayout()) {
                frag.setText(getCapt(item));
            }

        }
        private String getCapt(String ship) {
            if (ship.toLowerCase().contains("daredevil")) {
                return "Matt Murdock";
            }
            if (ship.toLowerCase().contains("jessica jones")) {
                return "Jessica Jones";
            }
            if (ship.toLowerCase().contains("luke cage")) {
                return "Luke Cage";
            }
            if (ship.toLowerCase().contains("iron fist")) {
                return "Danny Rand";
            }
            if (ship.toLowerCase().contains("punisher")) {
                return "Frank Castle";
            }
            return "???";
        }
    }
