package com.example.guidensk.Hotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.guidensk.Help;
import com.example.guidensk.HomeActivity;
import com.example.guidensk.R;
import com.example.guidensk.WhereToSayActivity;

public class MarinsPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marins_park);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MarinsPark.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MarinsPark.this, WhereToSayActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://marinsparkhotels.ru/novosib/rooms"));
        startActivity(intent);
    }

    public void onClickPhone(View view) {
        Intent intent  = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:88006008888"));
        startActivity(intent);
    }

    public void onClickRoute(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/maps/place/Marins+Park+Hotel+Novosibirsk/@55.035621,82.8983333,17z/data=!3m1!4b1!4m8!3m7!1s0x42dfe4332068c26f:0x9b7f6a60ff53548d!5m2!4m1!1i2!8m2!3d55.035621!4d82.900522?hl=ru"));
        startActivity(intent);
    }
}