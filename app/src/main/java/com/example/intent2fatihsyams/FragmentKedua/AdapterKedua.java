package com.example.intent2fatihsyams.FragmentKedua;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.intent2fatihsyams.R;

class AdapterKedua extends RecyclerView.Adapter<AdapterKedua.MyViewHolder> {
    String[] NamaClub = {"Arsenal", "Barcelona", "Juventus", "Lazio", "Monaco", "Napoli", "Roma", "Sevilla", "Valencia", "Villareal"};
    int[] LogoClub = {R.drawable.arsenal, R.drawable.barcelona, R.drawable.juventus, R.drawable.lazio, R.drawable.monaco, R.drawable.napoli, R.drawable.roma, R.drawable.sevilla, R.drawable.valencia, R.drawable.villarreal};
    String[] AsalClub = {"England", "Spain", "Italia", "Italia", "Italia", "Italia", "Italia", "Spain", "Spain", "spain"};
    String[] EmailClub = {"Arsenal@any.com", "Barcelona@any.com", "Juventus@any.com", "Lazio@any.com", "Monaco@any.com", "Napoli@any.com", "Roma@any.com", "Sevilla@any.com", "Valencia@any.com", "Villareal@any.com"};
    int[] NoHp = {1234, 4234, 1234, 4234, 1234, 4234, 1234, 4234, 1234, 4234,};
    Context context;
    public AdapterKedua(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.fragment_layout_kedua, null);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        myViewHolder.AsalClub.setText(AsalClub[i]);
        myViewHolder.NamaClub.setText(NamaClub[i]);
        myViewHolder.LogoClub.setImageResource(LogoClub[i]);
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent( context, DetailKeduaActivity.class );
                pindah.putExtra("EmailClub", EmailClub[i]);
                pindah.putExtra("NoHp", NoHp[i]);
                pindah.putExtra("NamaClub", NamaClub[i]);
                pindah.putExtra("image",LogoClub[i]);
                pindah.putExtra("position",i);

                context.startActivity(pindah);


            }
        });
    }

    @Override
    public int getItemCount() {
        return NamaClub.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView LogoClub;
        TextView NamaClub;
        TextView AsalClub;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            LogoClub = itemView.findViewById(R.id.img_logoKedua);
            NamaClub = itemView.findViewById(R.id.txt_NamaKedua);
            AsalClub = itemView.findViewById(R.id.txt_RegKedua);
        }
    }
}
