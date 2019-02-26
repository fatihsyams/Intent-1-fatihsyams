package com.example.intent2fatihsyams.FragmentKetiga;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intent2fatihsyams.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class untuk_ketiga extends Fragment {
    KetigaAdapter adapter;
    RecyclerView rvKetiga;
    public untuk_ketiga() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_untuk_ketiga, container, false);
        rvKetiga = v.findViewById(R.id.rv_ketiga);
        rvKetiga.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        adapter = new KetigaAdapter(getActivity());
        rvKetiga.setAdapter(adapter);
        return v;
    }

}
