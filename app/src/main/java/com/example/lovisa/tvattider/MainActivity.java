package com.example.lovisa.tvattider;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.text.InputType;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;

import android.view.View.OnClickListener;
import android.widget.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends Activity implements OnClickListener {

    private Calendar calendar;
    private DatePicker datePicker;
    private int year, month, day;
    private EditText chosenDate;
    private SimpleDateFormat dateFormatter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.chosenDate);
        chosenDate.setInputType(InputType.TYPE_NULL);
        chosenDate.requestFocus();

        setDateTimeField();



    }


    private void setDateTimeField(){
        chosenDate.setOnClickListener((View.OnClickListener) this);

        calendar = Calendar.getInstance();

        datePicker = new DatePickerDialog(this, new OnDateSetListener(){
            public void onDateSet(DatePicker View, int year, int month, int day){
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, month, day);
                chosenDate.setText(dateFormatter.format(newDate.getTime()));

            }

        });
    }

    @Override
    public void onClick(View v) {

    }
}
