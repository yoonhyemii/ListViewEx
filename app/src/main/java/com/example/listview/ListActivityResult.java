package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ListActivityResult extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_result);

        textView = (TextView) findViewById(R.id.textView);

        String selectValue = getIntent().getStringExtra("select");

        if(selectValue != null){
            textView.setText(selectValue);
        }
    }
}