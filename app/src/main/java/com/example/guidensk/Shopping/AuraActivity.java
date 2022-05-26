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

public class AuraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aura);
        ImageView snowflake = findViewById(R.id.Snowflake);
        snowflake.animate().rotation(snowflake.getRotation() + 36000).scaleX((snowflake.getScaleX())).scaleY((snowflake.getScaleY())).setDuration(250000);
    }

    public void onClickHelp(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AuraActivity.this, Help.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onCLickBack(View view) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(AuraActivity.this, ShoppingActivity.class);
                startActivity(i);
                finish();
            }
        }, 0);
    }

    public void onClickWeb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://aura.planeta-mall.ru/"));
        startActivity(intent);
    }

    public void onClickPhone(View view) {
        Intent intent  = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:83832303040"));
        startActivity(intent);
    }

    public void onClickRoute(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.ru/maps/place/%D0%A2%D0%A0%D0%A6+%D0%90%D1%83%D1%80%D0%B0/@55.026132,82.9118125,15z/data=!4m9!1m2!2m1!1z0LDRg9GA0LA!3m5!1s0x42dfe42d21f47585:0xa0e527e67af11f9a!8m2!3d55.0292088!4d82.936714!15sCgjQsNGD0YDQsFoKIgjQsNGD0YDQsJIBD3Nob3BwaW5nX2NlbnRlcpoBJENoZERTVWhOTUc5blMwVkpRMEZuU1VSWk1FcERkamhuUlJBQg?hl=ru"));
        startActivity(intent);
    }
}