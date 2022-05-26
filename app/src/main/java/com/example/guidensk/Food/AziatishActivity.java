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
import com.example.guidensk.Hotel.Domina;
import com.example.guidensk.R;
import com.example.guidensk.WhereToSayActivity;

public class AziatishActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aziatish);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AziatishActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AziatishActivity.this, FoodActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://denisivanov.ru/concepts/aziatish/"));
        startActivity(intent);
    }

    public void onClickPhone(View view) {
        Intent intent  = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8383 382 88 88"));
        startActivity(intent);
    }

    public void onClickRoute(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/maps/place/%D0%90%D0%B7%D0%B8%D0%B0%D1%82%D0%B8%D1%88/@55.0295484,82.9027937,17z/data=!4m15!1m9!3m8!1s0x42dfe54cdeb0c345:0xed423c0c3d97b3e6!2zQVpJTVVUINCe0YLQtdC70Ywg0KHQuNCx0LjRgNGM!5m2!4m1!1i2!8m2!3d55.0295484!4d82.9049824!3m4!1s0x42dfe531cdd77955:0x5a3ff41e2689e8a2!8m2!3d55.0293885!4d82.9051215?hl=ru"));
        startActivity(intent);
    }
}