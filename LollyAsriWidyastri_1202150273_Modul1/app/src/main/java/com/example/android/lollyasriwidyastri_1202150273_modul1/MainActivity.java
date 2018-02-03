package com.example.android.lollyasriwidyastri_1202150273_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_food, et_porsi;
    Intent intent;
    String restoran, menu;
    int porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //method yg pertama dijalankan ketika activity dibuat
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_food = (EditText)findViewById(R.id.et_food);
        et_porsi = (EditText)findViewById(R.id.et_porsi);
        intent = new Intent(this,Description.class);
    }

    public void onEatbus(View view) {
        menu = et_food.getText().toString();
        restoran = "Eatbus";
        porsi = Integer.parseInt(et_porsi.getText().toString());
        int total = 50000 * porsi;
        Log.d( "TOTAL HARGA", "Rp."+total); //menampilkan data di logcat android studio
        intent.putExtra("restoran", restoran);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", total);
        startActivity(intent);

    }

    public void onAbnormal(View view) {
        menu = et_food.getText().toString();
        restoran = "Abnormal";
        porsi = Integer.parseInt(et_porsi.getText().toString());
        int total = 30000 * porsi;
        Log.d( "TOTAL HARGA", "Rp."+total); //menampilkan data di logcat android studio
        intent.putExtra("restoran", restoran);
        intent.putExtra("menu", menu);
        intent.putExtra("porsi", porsi);
        intent.putExtra("harga", total);
        startActivity(intent);
    }
}
