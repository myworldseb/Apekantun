package com.example.apekantun.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.apekantun.R;

public class RegistrarEmpresaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_empresa);
        showToolbar(getResources().getString(R.string.toolbar_tittle_reg_empresa),true);
    }
    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

    public void goresgistrarempresados(View view){
        Intent intent = new Intent(this,RegistarEmpresaDosActivity.class );
        startActivity(intent);

    }
}
