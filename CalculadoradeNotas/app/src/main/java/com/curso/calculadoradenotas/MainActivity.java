package com.curso.calculadoradenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // criando/instanciando os objetos
    private EditText n1,n2,n3,n4,numeroFaltas;
    private Button btcalcular;
    private TextView txt_resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Recuperando os id's
        n1 = findViewById(R.id.Nota1);
        n2 = findViewById(R.id.Nota2);
        n3 = findViewById(R.id.Nota3);
        n4 = findViewById(R.id.Nota4);
        numeroFaltas = findViewById(R.id.numeroFaltas);
        btcalcular = findViewById(R.id.calcular);
        txt_resultado = findViewById(R.id.txt_resultado);

        // Criação do reconhecimento de click do Botão
        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int nota1 = Integer.parseInt(n1.getText().toString());
                int nota2 = Integer.parseInt(n2.getText().toString());
                int nota3 = Integer.parseInt(n3.getText().toString());
                int nota4 = Integer.parseInt(n4.getText().toString());
                int numero_Faltas = Integer.parseInt(numeroFaltas.getText().toString());
                // Criando a variável média que irá fazer o cálculo da média
                int media = (nota1 + nota2 + nota3 + nota4) /4;


                if (media >=5  && numero_Faltas <=20){
                    txt_resultado.setText("Aluno foi aprovado! \n " + "Média Final: " + media);
                    txt_resultado.setTextColor(getColor(R.color.green));

                }else if (numero_Faltas > 20){
                    txt_resultado.setText("Aluno foi Reprovado por Faltas! \n" + "Média Final: " + media);
                    txt_resultado.setTextColor(getColor(R.color.red));

                }else if (media <5){
                    txt_resultado.setText("Aluno foi Reprovado Por Nota \n" + "Número de Faltas: " + numero_Faltas);
                    txt_resultado.setTextColor(getColor(R.color.red));
                }
            }
        });

    }
}