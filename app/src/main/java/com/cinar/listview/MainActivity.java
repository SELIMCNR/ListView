package com.cinar.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Array;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String countries[];

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        countries = getResources().getStringArray(R.array.countries);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,countries);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String country_name = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"Veri : "+country_name,Toast.LENGTH_LONG).show();
            }
        });
    }
}