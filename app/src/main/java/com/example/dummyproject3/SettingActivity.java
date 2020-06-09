package com.example.dummyproject3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SettingActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        textView1 = (TextView)findViewById(R.id.text_Theme);
        textView2 = (TextView)findViewById(R.id.text_Subscription);
        textView3 = (TextView)findViewById(R.id.text_Sound);
        textView4 = (TextView)findViewById(R.id.text_Reminder);
        textView5 = (TextView)findViewById(R.id.text_Location);
        textView6 = (TextView)findViewById(R.id.text_Contact);
        textView7 = (TextView)findViewById(R.id.text_Logout);
        textView8 = (TextView)findViewById(R.id.text_About);
        textView9 = (TextView)findViewById(R.id.text_Support);
        textView10= (TextView)findViewById(R.id.text_Licenses);


        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "Theme", Toast.LENGTH_SHORT).show();
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "Subscription", Toast.LENGTH_SHORT).show();
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "Sound", Toast.LENGTH_SHORT).show();
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "Reminder", Toast.LENGTH_SHORT).show();
            }
        });

        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "Location", Toast.LENGTH_SHORT).show();
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "Contact us", Toast.LENGTH_SHORT).show();
            }
        });

        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "Logout", Toast.LENGTH_SHORT).show();
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "About App", Toast.LENGTH_SHORT).show();
            }
        });

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "Support(24 x 7)", Toast.LENGTH_SHORT).show();
            }
        });

        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SettingActivity.this, "Open Source License", Toast.LENGTH_SHORT).show();
            }
        });

    }
}