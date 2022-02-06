package com.curso.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int valor1 = 10;
        int valor2 = 20;

        int soma = valor1    + valor2;
        System.out.println("Resultado:" + soma);

    }
}