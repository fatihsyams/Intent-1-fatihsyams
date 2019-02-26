package com.example.intent2fatihsyams.FragmentKetiga;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.intent2fatihsyams.R;

class KetigaAdapter extends RecyclerView.Adapter<KetigaAdapter.ViewHolder> {
    Context context;
    int[] LogoClub = {R.drawable.arsenal, R.drawable.barcelona, R.drawable.juventus, R.drawable.lazio, R.drawable.monaco, R.drawable.napoli, R.drawable.roma, R.drawable.sevilla, R.drawable.valencia, R.drawable.villarreal};

    public KetigaAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.fragment_layout_ketiga, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.logoCLub.setImageResource(LogoClub[i]);
    }

    @Override
    public int getItemCount() {
        return LogoClub.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoCLub;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoCLub = itemView.findViewById(R.id.img_LogoKetiga);
        }
    }
}
