package com.example.guidensk.Entertainment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.guidensk.Help;
import com.example.guidensk.R;
import com.example.guidensk.ShoppingActivity;

public class AcademicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AcademicActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AcademicActivity.this, ShoppingActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }


    public void onClickRoute(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/maps/place/%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B8%D0%B9+%D0%90%D0%BA%D0%B0%D0%B4%D0%B5%D0%BC%D0%B3%D0%BE%D1%80%D0%BE%D0%B4%D0%BE%D0%BA,+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA,+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA%D0%B0%D1%8F+%D0%BE%D0%B1%D0%BB.,+630090/@54.8475003,83.1007422,15z/data=!3m1!4b1!4m5!3m4!1s0x42dfc68144026f7b:0x8ac3c636898d2617!8m2!3d54.8475011!4d83.109497?hl=ru"));
        startActivity(intent);
    }
}