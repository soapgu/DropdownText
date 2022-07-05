package com.example.dropdowntext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autoCompleteTextView = this.findViewById(R.id.autoCompleteText);
        //List<String> list = Arrays.asList( "Material", "Design", "Components", "Android" );
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add( "Line:" + i );
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, list);
        autoCompleteTextView.setAdapter( adapter);
        autoCompleteTextView.setOnItemClickListener((adapterView, view, i, l) -> {
            Toast toast = Toast.makeText(getApplicationContext(), "Select :" +  i, Toast.LENGTH_SHORT);
            toast.show();
        });
    }
}