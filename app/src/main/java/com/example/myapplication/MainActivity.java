package com.example.myapplication;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activityClick(View view) {
        Intent testintent=new Intent();
        testintent.setClass(MainActivity.this, ActivityTest.class);
        testintent.putExtra("url","https://www.mi.com");
        MainActivity.this.startActivity(testintent);
    }
}
