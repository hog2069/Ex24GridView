package com.hog2020.ex24gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> datas = new ArrayList<>();

    GridView gridView;

    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");
        datas.add("fff");
        datas.add("ggg");
        datas.add("hhh");
        datas.add("iii");
        datas.add("jjj");

        gridView=findViewById(R.id.gridview);
        adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,datas);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String str= datas.get(position);
                Toast.makeText(MainActivity.this, datas.get(position), Toast.LENGTH_SHORT).show();

            }
        });

    }
}