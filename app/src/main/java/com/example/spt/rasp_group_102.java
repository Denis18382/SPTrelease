package com.example.spt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rasp_group_102 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rasp_group102);
    }
    public void back(View v) {
        Intent intent = new Intent(this, rasspOne.class);
        startActivity(intent);
    }
}