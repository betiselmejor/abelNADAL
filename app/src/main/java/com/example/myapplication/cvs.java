package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myapplication.Recicler.AdapterCvs;
import com.example.myapplication.Recicler.cvss;

import java.util.ArrayList;
import java.util.List;

public class cvs extends AppCompatActivity {


    String nom;
    String cognom;
    String sexe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvs);

            Bundle b = getIntent().getExtras();

            nom = b.getString("nom");
            cognom = b.getString("cognom");
            sexe = b.getString("genere");

        ArrayList<cvss> cvs= new ArrayList<>();
        cvs.add(new cvss("ocho","bon nadal"));
        cvs.add(new cvss("siete","es broma"));
        cvs.add(new cvss("siete","que si "));
        cvs.add(new cvss("siete","que no"));

        AdapterCvs ac = new AdapterCvs(cvs, this);

        RecyclerView RV = findViewById(R.id.listaRecyclerView);
        RV.setHasFixedSize(true);
        RV.setLayoutManager(new LinearLayoutManager(this));
        RV.setAdapter(ac);

    }


}