package com.example.guidensk.Food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.guidensk.FoodActivity;
import com.example.guidensk.Help;
import com.example.guidensk.R;
import com.example.guidensk.WhereToSayActivity;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(RestaurantActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(RestaurantActivity.this, FoodActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sibirsibir.ru/"));
        startActivity(intent);
    }

    public void onClickPhone(View view) {
        Intent intent  = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8383209 12 09"));
        startActivity(intent);
    }

    public void onClickRoute(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/maps/place/AZIMUT+%D0%9E%D1%82%D0%B5%D0%BB%D1%8C+%D0%A1%D0%B8%D0%B1%D0%B8%D1%80%D1%8C/@55.0295484,82.9027937,17z/data=!3m1!4b1!4m8!3m7!1s0x42dfe54cdeb0c345:0xed423c0c3d97b3e6!5m2!4m1!1i2!8m2!3d55.0295484!4d82.9049824?hl=ru"));
        startActivity(intent);
    }
}