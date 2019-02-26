package com.example.intent2fatihsyams;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.intent2fatihsyams.FragmentKedua.layout_kedua;
import com.example.intent2fatihsyams.FragmentKetiga.layout_ketiga;
import com.example.intent2fatihsyams.FragmentPertama.layout;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.sp_Home);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setOnItemSelectedListener(this);
        spinner.setAdapter(adapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        FragmentManager fragmentManager;
        fragmentManager = getSupportFragmentManager();

        switch (position) {
            case 0:
                fragmentManager.beginTransaction()
                        .add(R.id.untukWadah, new layout())
                        .addToBackStack("any")
                        .commit();
                break;

            case 1:
                fragmentManager.beginTransaction()
                        .replace(R.id.untukWadah, new layout_kedua())
                        .addToBackStack("any")
                        .commit();
                break;

            case 2:
                fragmentManager.beginTransaction()
                        .replace(R.id.untukWadah, new layout_ketiga())
                        .addToBackStack("any")
                        .commit();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
