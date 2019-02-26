package com.example.intent2fatihsyams.FragmentKedua;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intent2fatihsyams.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class layout_kedua extends Fragment {
    RecyclerView recyclerView;
    AdapterKedua adapter;

    public layout_kedua() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_rv_kedua, container, false);
        recyclerView = v.findViewById(R.id.rv_kedua);
        adapter = new AdapterKedua(getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));

        recyclerView.setAdapter(adapter);
        return v;
    }
}
