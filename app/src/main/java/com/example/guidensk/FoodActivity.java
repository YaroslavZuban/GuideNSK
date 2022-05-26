package com.example.guidensk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import com.example.guidensk.Food.AziatishActivity;
import com.example.guidensk.Food.PuppenActivity;
import com.example.guidensk.Food.RestaurantActivity;
import com.example.guidensk.Food.SparksActivity;
import com.example.guidensk.Hotel.Marriott;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(FoodActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(FoodActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }


    public void onClickRestaurant(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(FoodActivity.this, RestaurantActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onClickPuppen(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(FoodActivity.this, PuppenActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onClickSparks(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(FoodActivity.this, SparksActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }

    public void onClickAziatish(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(FoodActivity.this, AziatishActivity.class);
                startActivity(i);
                finish();
            }
        },0);
    }
}