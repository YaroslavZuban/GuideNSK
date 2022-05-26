package com.example.guidensk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    public void onClickPolice(View view){
        String number = "tel:02";
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(number));
        startActivity(callIntent);
    }

    public void onClickAmbulance(View view){
        String number = "tel:03";
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(number));
        startActivity(callIntent);
    }

    public void onClickFirefighters(View view){
        String number = "tel:01";
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(number));
        startActivity(callIntent);
    }

    public void onClickEmbassy(View view){
        String number = "tel:+74999187282";
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse(number));
        startActivity(callIntent);
    }

    public void onClickMenu(View view){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(Help.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }


}