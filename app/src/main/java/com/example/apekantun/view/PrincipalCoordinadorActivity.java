package com.example.apekantun.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.apekantun.R;

public class PrincipalCoordinadorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_coordinador);
        showToolbar(getResources().getString(R.string.toolbar_tittle_menu_coordinador),false);
    }
    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
    public void goFichaGeneral(View view){
        Intent intent = new Intent(this,FichaGeneralActivity.class );
        startActivity(intent);

    }
    public void goNomina(View view){
        Intent intent = new Intent(this,NominaParticipantesActivity.class );
        startActivity(intent);

    }
    public void goGasto(View view){
        Intent intent = new Intent(this,PrincipalGastosActivity.class);
        startActivity(intent);
    }
    public void goCrearEmpresa(View view){
        Intent intent = new Intent(this,RegistrarEmpresaActivity.class );
        startActivity(intent);

    }

}
