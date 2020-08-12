package com.igti.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.txtHello)

        textView.setText("Bruno");

        Button btnIniciar = (Button)findViewById(R.id.btnIniciar);

        btnIniciar.setOnClickListener();



    }
}