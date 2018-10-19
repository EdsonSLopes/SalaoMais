package com.mais.salao.salaomais.Activity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.mais.salao.salaomais.R;

public class HistoricoActivity extends AppCompatActivity {

    private Button btnSair;
    private Button btnAbriProcedimento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);



        btnSair = (Button) findViewById(R.id.btnSair);
        btnAbriProcedimento =(Button) findViewById(R.id.btnAbriProcedimento);

        btnAbriProcedimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                entrarProcedimento();

            }
        });

        btnSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sairHistorico();

            }
        });


    }

    public void sairHistorico(){
        Intent intent = new Intent(HistoricoActivity.this, LoginActivity.class);
        startActivity(intent);
       finish();
    }


    public void entrarProcedimento(){
        Intent intent = new Intent(HistoricoActivity.this, ProcedimentosActivity.class);
        startActivity(intent);

    }

}
