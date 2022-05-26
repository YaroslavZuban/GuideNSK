package com.example.guidensk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.guidensk.Shopping.AuraActivity;
import com.example.guidensk.Shopping.GalleryActivity;
import com.example.guidensk.Shopping.MegaActivity;
import com.example.guidensk.Shopping.RoyalActivity;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ShoppingActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ShoppingActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickAura(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ShoppingActivity.this, AuraActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickRoyal(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ShoppingActivity.this, RoyalActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickMega(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ShoppingActivity.this, MegaActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickGallery(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ShoppingActivity.this, GalleryActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }
}