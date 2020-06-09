package com.example.dummyproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";
    private TextView mDisplayDate;
    Button btn_start, btn_signout;
    private DatePickerDialog.OnDateSetListener mDateSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mDisplayDate = (TextView) findViewById(R.id.textView4);
    btn_start =(Button)findViewById(R.id.btn_setting);
    btn_signout=(Button)findViewById(R.id.button2);

    btn_signout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Signed Out Successfully", Toast.LENGTH_SHORT).show();
        }
    });
    btn_start.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, SettingActivity.class);
            startActivity(intent);
        }
    });
    mDisplayDate.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Calendar cal = Calendar.getInstance();
            int year = cal.get(Calendar.YEAR);
            int month= cal.get(Calendar.MONTH);
            int day =cal.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(

                    MainActivity.this,
                    android.R.style.Theme_Holo_Dialog_MinWidth,
                    mDateSetListener,
                    year,month,day);

            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.show();
        }
    });

     mDateSetListener = new DatePickerDialog.OnDateSetListener() {
         @Override
         public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
             month = month +1;
             Log.d(TAG, "onDateSet: mm/dd/yyy: " +year + "/" + month + "/" +year);

             String date = month + "/" +dayOfMonth + "/" + year;
             mDisplayDate.setText(date);

         }

     };


    }
}