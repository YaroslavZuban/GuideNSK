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

public class PuppenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puppen);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(PuppenActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(PuppenActivity.this, FoodActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://puppenhaus.bitrix24.shop/"));
        startActivity(intent);
    }

    public void onClickPhone(View view) {
        Intent intent  = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8383 251 03 03"));
        startActivity(intent);
    }

    public void onClickRoute(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/maps/place/PuppenHaus/@55.0261324,82.9183786,17z/data=!4m13!1m7!3m6!1s0x42dfe5d1297ba67f:0x3fbc1f197b1f6f59!2z0YPQuy4g0KfQsNC_0LvRi9Cz0LjQvdCwLCA2NS8xLCDQndC-0LLQvtGB0LjQsdC40YDRgdC6LCDQndC-0LLQvtGB0LjQsdC40YDRgdC60LDRjyDQvtCx0LsuLCA2MzAwOTk!3b1!8m2!3d55.0261324!4d82.9205673!3m4!1s0x42dfe5d12c0150a7:0x2f802a71b2c1ec20!8m2!3d55.0261368!4d82.9205541?hl=ru"));
        startActivity(intent);
    }
}