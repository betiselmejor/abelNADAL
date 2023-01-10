package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner genreSpinner;

    EditText nameET;
    EditText surNameET;

    Button passButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }


    public void init(){

        passButton= (Button) findViewById(R.id.button);
        nameET = (EditText) findViewById(R.id.nameET);
        surNameET = (EditText) findViewById(R.id.surnameET);

        genreSpinner =(Spinner) findViewById(R.id.spinnerGenere);

        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.generes_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        genreSpinner.setAdapter(adapter);

    }

    public void goNext(View v){
        Intent change = new Intent(MainActivity.this, cvs.class);

        change.putExtra("nom",String.valueOf(nameET.getText()));
        change.putExtra("cognom",String.valueOf(surNameET.getText()));
        change.putExtra("genere", String.valueOf(genreSpinner.getSelectedItem()));

        startActivity(change);

    }
}