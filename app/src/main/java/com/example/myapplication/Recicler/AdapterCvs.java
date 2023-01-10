package com.example.myapplication.Recicler;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.cvs;

import java.util.ArrayList;
import java.util.List;

public class AdapterCvs extends RecyclerView.Adapter<AdapterCvs.ViewHolder> {

    ArrayList<cvss> cvs;
    private LayoutInflater inflater;
    private Context context;

    public AdapterCvs(ArrayList<cvss> cvs, Context context){
        this.inflater = LayoutInflater.from(context);
        this.context=context;
        this.cvs=cvs;
    }



    @Override
    public AdapterCvs.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list_element, null);
        return new AdapterCvs.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final AdapterCvs.ViewHolder holder, final int pos) {
        holder.bindData(cvs.get(pos));

    }

    @Override
    public int getItemCount() {
        return cvs.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fondo;
        TextView message;
        FrameLayout cover;

        ViewHolder(View itemView){
            super (itemView);
            fondo = itemView.findViewById(R.id.foto);
            message=itemView.findViewById(R.id.textNADAL);
            cover = itemView.findViewById(R.id.cover);
        }
        void bindData(final cvss cv){
            int random = (int) Math.round(Math.random()*10);

            if (random==1){
                fondo.setImageResource(R.mipmap.uno);
            }
            if (random==2){
                fondo.setImageResource(R.mipmap.dos);
            }
            if (random==3){
                fondo.setImageResource(R.mipmap.tres);
            }
            if (random==4){
                fondo.setImageResource(R.mipmap.cuatro);
            }
            if (random==5){
                fondo.setImageResource(R.drawable.cinco);
            }
            if (random==6){
                fondo.setImageResource(R.mipmap.seis);
            }
            if (random==7){
                fondo.setImageResource(R.mipmap.siete);
            }
            if (random==8){
                fondo.setImageResource(R.mipmap.ocho);
            }
            if (random==9){
                fondo.setImageResource(R.mipmap.nueve);
            }
            if (random==10){
                fondo.setImageResource(R.mipmap.diez);
            }

            cover.setBackgroundColor(Color.parseColor("#CCFFFFFF"));
            message.setText(cv.getMissatge());
        }
    }
}
