package com.example.android.lollyasriwidyastri_1202150273_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Description extends AppCompatActivity {

    TextView tv_restoran, tv_menu, tv_porsi, tv_harga;
    String restoran, menu;
    int porsi, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        tv_restoran = (TextView) findViewById(R.id.tv_restoran);
        tv_menu = (TextView) findViewById(R.id.tv_menu);
        tv_porsi = (TextView) findViewById(R.id.tv_porsi);
        tv_harga = (TextView) findViewById(R.id.tv_harga);

        Intent intent = getIntent();
        restoran = intent.getStringExtra("restoran");
        menu = intent.getStringExtra("menu");
        porsi = intent.getIntExtra("porsi", 0);
        harga = intent.getIntExtra("harga", 0);

        tv_restoran.setText(restoran); //kiri komponen, kanan variabel, setText utk mengisi komponen dgn data
        tv_menu.setText(menu);
        tv_porsi.setText("" + porsi);
        tv_harga.setText("Rp." + harga);

        Toast toast = null;
        if (harga > 65000) {
            toast = Toast.makeText(getApplicationContext(), "Jangan makan disini, uang kamu tidak cukup", Toast.LENGTH_SHORT); //getAppCon dimana kita berada
        }else{
            toast = Toast.makeText(getApplicationContext(), "Makan disini aja", Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
