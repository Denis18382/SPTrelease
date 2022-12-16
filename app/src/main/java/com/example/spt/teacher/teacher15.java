package com.example.spt.teacher;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.spt.R;
import com.example.spt.teachers;

public class teacher15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher15);
    }
    public void back(View v) {
        Intent intent = new Intent(this, teachers.class);
        startActivity(intent);
    }
}