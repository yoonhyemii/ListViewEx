package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] alphabet = {"a","b", "c", "d", "e", "f", "g", "h", "i","j", "k", "l", "m", "n", "o", "p"};
/*       for(int i = 0; i< 100; i++){
            Bean bean = new Bean();
            bean.setName("zhua" + i);
            data.add(bean);
        }*/

        listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter adapter = new ArrayAdapter( this, android.R.layout.simple_list_item_1, alphabet);

      //  listView.setAdapter(new myAdapter(data, this));
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListActivity.this, ListActivityResult.class);

                intent.putExtra("select","클릭한 리스트 아이템 : " + alphabet[i]);

                startActivity(intent);
                finish();
            }

        });

    }
}