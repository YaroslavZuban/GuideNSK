package com.example.guidensk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(HomeActivity.this,Help.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onClickHotels(View view){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(HomeActivity.this,WhereToSayActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onClickMaps(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/maps/place/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA,+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB./@54.969655,82.6692266,10z/data=!3m1!4b1!4m5!3m4!1s0x42dfe5e190cc4d97:0x9b3a0673e1d3e985!8m2!3d54.9832693!4d82.8963831?hl=ru"));
        startActivity(intent);
    }


    public void onClickFood(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(HomeActivity.this,FoodActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onClickExit(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            finishAffinity();
        } else {
            finish();
        }
        System.exit(0);
    }

    public void onClickShopping(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(HomeActivity.this,ShoppingActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onClicEntertainment(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(HomeActivity.this,EntertainmentActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }
}