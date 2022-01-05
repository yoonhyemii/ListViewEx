package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RecyclerActivityResult extends AppCompatActivity {

    ImageView mainImageView;
    TextView title_tv, description;

    String data, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_result);

        mainImageView = findViewById(R.id.mainImageView);
        title_tv = findViewById(R.id.title_tv);
        description = findViewById(R.id.description);

        getData();
        setData();
    }


    private void getData(){
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data") && getIntent().hasExtra("data2")){

            data = getIntent().getStringExtra("data");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage",1);

        }else{
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        title_tv.setText(data);
        description.setText(data2);
        mainImageView.setImageResource(myImage);

    }
}