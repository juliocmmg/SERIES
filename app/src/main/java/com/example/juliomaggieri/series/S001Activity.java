package com.example.juliomaggieri.series;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class S001Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s001);

        String[] serie1 = {"001.01","001.02","001.03","001.04"};
        ListView listaSerie1 = (ListView) findViewById(R.id.lista_serie1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, serie1);
        listaSerie1.setAdapter(adapter);

    }
}
