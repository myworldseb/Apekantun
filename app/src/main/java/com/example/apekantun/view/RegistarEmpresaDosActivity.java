package com.example.apekantun.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.apekantun.R;
import android.os.Bundle;

public class RegistarEmpresaDosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar_empresa_dos);
        showToolbar(getResources().getString(R.string.toolbar_tittle_reg_empresa),true);
    }
    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
}
