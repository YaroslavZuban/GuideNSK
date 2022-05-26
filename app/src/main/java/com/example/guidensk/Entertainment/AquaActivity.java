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

public class AquaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aqua);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AquaActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AquaActivity.this, ShoppingActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://akvaparknsk.ru/"));
        startActivity(intent);
    }

    public void onClickPhone(View view) {
        Intent intent  = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:83833160000"));
        startActivity(intent);
    }

    public void onClickRoute(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/maps/place/%D0%90%D0%BA%D0%B2%D0%B0%D0%BF%D0%B0%D1%80%D0%BA+%D0%90%D0%BA%D0%B2%D0%B0%D0%BC%D0%B8%D1%80/@55.0201575,82.8510656,13z/data=!4m9!1m2!2m1!1z0LDQutCy0LDQv9Cw0YDQug!3m5!1s0x42dfe420eb62c38f:0x3555167ce1253c71!8m2!3d55.0201575!4d82.8860845!15sChDQsNC60LLQsNC_0LDRgNC6WhIiENCw0LrQstCw0L_QsNGA0LqSAQ5hcXVhdGljX2NlbnRlcpoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VSSmRIQnlTM2xCUlJBQg?hl=ru"));
        startActivity(intent);
    }
}