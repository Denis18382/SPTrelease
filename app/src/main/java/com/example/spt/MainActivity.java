package com.example.spt;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;

    boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                     final ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);

                     imageButton.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             if (flag)
                                 imageButton.setImageResource(R.drawable.link_in_tg);
                             else
                                 imageButton.setImageResource(R.drawable.spt_logo1);
                             flag = !flag;
                         }
                     });
    }
    public void o_spt (View v)  {
        Intent intent = new Intent ( this, O_SPT.class);
        startActivity(intent);
    }

    public void contact (View v)  {
        Intent intent = new Intent ( this, Contacts.class);
        startActivity(intent);
    }

    public void teachers (View v) {
        Intent intent = new Intent (this, teachers.class);
        startActivity(intent);
    }
    public void rasspone (View v) {
        Intent intent = new Intent(this,rasspOne.class);
        startActivity(intent);
    }
    public void spets (View v) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

}

