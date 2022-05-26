package com.example.guidensk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.guidensk.Hotel.Domina;
import com.example.guidensk.Hotel.MarinsPark;
import com.example.guidensk.Hotel.Marriott;

public class WhereToSayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_where_to_say);

        ImageView snowflake=findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation()+36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);

    }

    public void onClickHelp(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(WhereToSayActivity.this,Help.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(WhereToSayActivity.this,HomeActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onCLickMarins(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(WhereToSayActivity.this, MarinsPark.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onCLickMarriott(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(WhereToSayActivity.this, Marriott.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onCLickDomina(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(WhereToSayActivity.this, Domina.class);
                startActivity(i);
                finish();
            }
        },0);
    }
}