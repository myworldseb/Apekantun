package com.example.apekantun.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.apekantun.R;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class RegistrarPagoActivity extends AppCompatActivity {
EditText etfp;

    private int mYearIni, mMonthIni, mDayIni,AñoSin, MesSin, DiaSin;
    static final int DATE_ID = 0;
    Calendar C = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_pago);
        showToolbar(getResources().getString(R.string.toolbar_tittle_reg_pago),true);
        AñoSin = C.get(Calendar.YEAR);
        MesSin = C.get(Calendar.MONTH);
        DiaSin = C.get(Calendar.DAY_OF_MONTH);
        etfp = (EditText) findViewById(R.id.fecha_pago);
        etfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog(DATE_ID);
            }
        });

    }
    private void colocar_fecha(){
        etfp.setText( mYearIni+ "-" +  (mMonthIni + 1)+ "-" + mDayIni +" ");
    }
    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    mYearIni = year;
                    mMonthIni = monthOfYear;
                    mDayIni = dayOfMonth;
                    colocar_fecha();
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
