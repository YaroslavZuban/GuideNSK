package com.example.guidensk.Shopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.guidensk.Food.RestaurantActivity;
import com.example.guidensk.FoodActivity;
import com.example.guidensk.Help;
import com.example.guidensk.R;
import com.example.guidensk.ShoppingActivity;

public class MegaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mega);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MegaActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MegaActivity.this, ShoppingActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mega.ru/novosibirsk/"));
        startActivity(intent);
    }


    public void onClickRoute(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/maps/place/%D0%9C%D0%95%D0%93%D0%90+%D0%9D%D0%BE%D0%B2%D0%BE%D1%81%D0%B8%D0%B1%D0%B8%D1%80%D1%81%D0%BA/@54.963459,82.926514,15z/data=!4m9!1m2!2m1!1z0LzQtdCz0LA!3m5!1s0x42dfe7a5a196d275:0xd47204620bce1930!8m2!3d54.963459!4d82.9352687!15sCgjQvNC10LPQsCIDiAEBWgoiCNC80LXQs9CwkgEPc2hvcHBpbmdfY2VudGVymgEjQ2haRFNVaE5NRzluUzBWSlEwRm5TVU5IYjJONlExVlJFQUU?hl=ru"));
        startActivity(intent);
    }
}