package com.example.guidensk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.guidensk.Entertainment.AcademicActivity;
import com.example.guidensk.Entertainment.AquaActivity;
import com.example.guidensk.Entertainment.CircusActivity;
import com.example.guidensk.Entertainment.TheaterActivity;
import com.example.guidensk.Shopping.AuraActivity;
import com.example.guidensk.Shopping.GalleryActivity;
import com.example.guidensk.Shopping.MegaActivity;
import com.example.guidensk.Shopping.RoyalActivity;

public class EntertainmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(EntertainmentActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(EntertainmentActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickTheater(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(EntertainmentActivity.this, TheaterActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickCircus(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(EntertainmentActivity.this, CircusActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickAqua(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(EntertainmentActivity.this, AquaActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickAcademic(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(EntertainmentActivity.this, AcademicActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }
}