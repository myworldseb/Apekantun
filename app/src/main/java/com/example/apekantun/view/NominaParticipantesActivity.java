package com.example.apekantun.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.apekantun.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class NominaParticipantesActivity extends AppCompatActivity {
private FloatingActionButton floatingActionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomina_participantes);
        showToolbar(getResources().getString(R.string.toolbar_tittle_nomina),true);
        floatingActionButton=findViewById(R.id.agregar);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(NominaParticipantesActivity.this,DialogoParticipanteActivity.class);
                startActivity(intent);
            }
        });
    }
    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

}
