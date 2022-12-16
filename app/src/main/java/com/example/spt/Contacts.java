package com.example.spt;





import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Contacts extends AppCompatActivity implements View.OnClickListener{
    ImageButton btncall1;
    ImageButton btncall2;
    ImageButton btncall3;
    ImageButton btncall4;
    ImageButton btncall5;
    ImageButton btncall6;
    ImageButton btncall7;
    ImageButton btncall8;
    ImageButton btncall9;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        btncall1 = (ImageButton) findViewById(R.id.btncall1);
        btncall2 = (ImageButton) findViewById(R.id.btncall2);
        btncall3 = (ImageButton) findViewById(R.id.btncall3);
        btncall4 = (ImageButton) findViewById(R.id.btncall4);
        btncall5 = (ImageButton) findViewById(R.id.btncall5);
        btncall6 = (ImageButton) findViewById(R.id.btncall6);
        btncall7 = (ImageButton) findViewById(R.id.btncall7);
        btncall9 = (ImageButton) findViewById(R.id.btncall9);



        btncall1.setOnClickListener (this);
        btncall2.setOnClickListener (this);
        btncall3.setOnClickListener (this);
        btncall4.setOnClickListener (this);
        btncall5.setOnClickListener (this);
        btncall6.setOnClickListener (this);
        btncall7.setOnClickListener (this);
        btncall9.setOnClickListener (this);


    }

    public void back(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }


    @SuppressLint({"NonConstantResourceId", "IntentReset"})
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btncall1:
            case R.id.btncall5:
            case R.id.btncall7:

                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+7(8342)47–33–95"));
                startActivity(intent);
                break;
            case R.id.btncall2:
            case R.id.btncall4:

                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+7(8342)47–40–41"));
                startActivity(intent);
                break;
            case R.id.btncall3:
                intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+7(8342)23–20–35"));
                startActivity(intent);
                break;
            case R.id.btncall6:
                intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:54.182431,45.189193"));
                startActivity(intent);
                break;
            case R.id.btncall9:
              Intent mailIntent = new Intent(Intent.ACTION_VIEW);
                mailIntent.setData(Uri.parse(getString(R.string.mail)));

               startActivity(mailIntent);
                break;
        }
    }
}