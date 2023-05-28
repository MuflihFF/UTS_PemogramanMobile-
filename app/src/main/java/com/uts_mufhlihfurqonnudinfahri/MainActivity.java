package com.uts_mufhlihfurqonnudinfahri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] iconList = new int[]{
            R.drawable.menu, R.drawable.menuu, R.drawable.menuuu, R.drawable.menuuuu, R.drawable.menuuuuuu,
            R.drawable.menu, R.drawable.menuu, R.drawable.menuuu, R.drawable.menuuuu, R.drawable.menuuuuuu,
            R.drawable.menu, R.drawable.menuu, R.drawable.menuuu, R.drawable.menuuuu, R.drawable.menuuuuuu,
            R.drawable.menu, R.drawable.menuu, R.drawable.menuuu, R.drawable.menuuuu, R.drawable.menuuuuuu,
            R.drawable.menu, R.drawable.menuu, R.drawable.menuuu, R.drawable.menuuuu, R.drawable.menuuuuuu,


    };

    String[] Headline = {"Harga 15.000", "Harga 15.000", "Harga 15.000", "Harga 15.000",
            "Harga 15.000", "Harga 25.000", "Harga 35.000", "Harga 45.000",
            "Harga 85.000", "Harga 55.000", "Harga 65.000", "Harga 75.000",
            "Harga 95.000", "Harga 105.000", "Harga 115.000", "Harga 150.000",
            "Harga 185.000", "Harga 165.000", "Harga 155.000", "Harga 125.000",


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGridView gridViewCustom = new CustomGridView(MainActivity.this, iconList, Headline);
        gridView = findViewById(R.id.gridViewImageText);
        gridView.setAdapter((ListAdapter) gridViewCustom);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Harga Menu: "
                        + Headline[+position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}