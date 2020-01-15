package com.example.apekantun.view;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DatePickerDialog;
import android.os.Bundle;
import com.example.apekantun.R;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.sql.Date;
import java.util.Calendar;

public class CrearViajeActivity extends AppCompatActivity {
EditText etfs;
EditText etfr;
private int code;
private int mYearIni, mMonthIni, mDayIni,AñoSin, MesSin, DiaSin;
    static final int DATE_ID = 0;
Calendar C = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_crear_viaje);
        showToolbar(getResources().getString(R.string.toolbar_tittle_crear_viaje),false);
        AñoSin = C.get(Calendar.YEAR);
        MesSin = C.get(Calendar.MONTH);
        DiaSin = C.get(Calendar.DAY_OF_MONTH);
        etfr = (EditText) findViewById(R.id.fecha_realizar);
        etfs = (EditText) findViewById(R.id.fecha_solicitud);
        etfr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_ID);
                code = 0;
            }
        });
        etfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_ID);
                code = 1;
            }
        });
    }


    private void colocar_fecha(){
        etfs.setText( mYearIni+ "-" +  (mMonthIni + 1)+ "-" + mDayIni +" ");
    }
    private void colocar_fechita(){
        etfr.setText(mYearIni+ "-" +  (mMonthIni + 1)+ "-" + mDayIni +" ");
    }

    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    mYearIni = year;
                    mMonthIni = monthOfYear;
                    mDayIni = dayOfMonth;

                    if(code == 0){
                        colocar_fechita();
                    }else{
                        colocar_fecha();
                    }


                }

            };


@Override
protected Dialog onCreateDialog(int id){
    switch (id){
        case DATE_ID:
            return new DatePickerDialog(this, mDateSetListener,AñoSin, MesSin, DiaSin);
    }
    return null;
        }


    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

}

