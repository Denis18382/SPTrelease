package com.example.spt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rasspOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rassp_one);
    }

    public void back(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void rasspG1(View v) {
        Intent intent = new Intent (this,rasp_group_101.class);
                startActivity(intent);
    }
    public void rasspG2(View v) {
        Intent intent = new Intent (this, rasp_group_102.class);
         startActivity(intent);
    }
    public void rasspG3(View v) {
        Intent intent = new Intent(this, rasp_group_103.class);
        startActivity(intent);
    }
    public void rasspG4(View v) {
        Intent intent = new Intent(this, rasp_group_113.class);
        startActivity(intent);

    }

}