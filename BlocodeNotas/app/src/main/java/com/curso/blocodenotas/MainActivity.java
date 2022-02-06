package com.curso.blocodenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private AnotacaoPreferencias preferencias;
    private EditText editAnotacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fbSalvar = findViewById(R.id.fb_salvar);
        editAnotacao = findViewById(R.id.editAnotacao);

        preferencias = new AnotacaoPreferencias(getApplicationContext( ));

            fbSalvar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                String textoRecuperado = editAnotacao.getText().toString();
                
                if (textoRecuperado.equals("")) {
                    Toast.makeText(getApplicationContext(), "Preencha a Anotação!", Toast.LENGTH_SHORT).show();
                }else {
                    preferencias.salvarAnotacao(textoRecuperado);
                    Toast.makeText(getApplicationContext(), "Anotação Salva!", Toast.LENGTH_SHORT).show();
                }
                }
            });

        // Recuperar Anotação
        String anotacao = preferencias.recuperarAnotacao();

        if(!anotacao.equals("")){
            editAnotacao.setText(anotacao);
        }
    }
}