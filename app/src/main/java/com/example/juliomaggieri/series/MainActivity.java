package com.example.juliomaggieri.series;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] series = {"001","002","003","004"};
        ListView listaSeries = (ListView) findViewById(R.id.lista_series);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, series);
        listaSeries.setAdapter(adapter);
        listaSeries.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicou!", Toast.LENGTH_SHORT).show();
                Intent intentVS001 = new Intent(MainActivity.this, S001Activity.class);
                startActivity(intentVS001);

            }
        });
        }
    }
