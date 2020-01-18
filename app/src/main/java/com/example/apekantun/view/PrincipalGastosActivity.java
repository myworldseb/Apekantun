package com.example.apekantun.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.apekantun.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalGastosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_gastos);
        showToolbar(getResources().getString(R.string.toolbar_gastos),true);
    }
    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
    public void goregistrargasto(View view){
        Intent intent = new Intent(this,RegistarGastoActivity.class );
        startActivity(intent);

    }


    public void goregistropago(View view){
        Intent intent = new Intent(this,RegistrarPagoActivity.class );
        startActivity(intent);

    }
}
