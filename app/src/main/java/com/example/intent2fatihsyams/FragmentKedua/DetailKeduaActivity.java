package com.example.intent2fatihsyams.FragmentKedua;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.intent2fatihsyams.R;

public class DetailKeduaActivity extends AppCompatActivity {

    TextView NamaClub, EmailClub, NoHpClub;
    ImageView logoDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kedua);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NamaClub = findViewById(R.id.txt_NamaClub);
        EmailClub = findViewById(R.id.txt_EmailClub);
        NoHpClub = findViewById(R.id.NoHpClub);
        logoDetail = findViewById(R.id.img_logoDetailKedua);

        final int position = getIntent().getIntExtra( "position",1 );
         EmailClub.setText(getIntent().getStringExtra("EmailClub"));
       NoHpClub.setText(String.valueOf(getIntent().getIntExtra("NoHp", 0)));
         NamaClub.setText(getIntent().getStringExtra("NamaClub"));
         logoDetail.setImageResource(getIntent().getIntExtra("image",0));

         NoHpClub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+ getIntent().getStringExtra("NoHp"))));
             }
         });
         EmailClub.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(Intent.ACTION_SEND, Uri.fromParts("mailto", "EmailClub", null)));
             }
         });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
