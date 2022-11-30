package com.example.addnames;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText nameTV;
    private Button addBtn;
    private ListView nameListView;

    private ArrayList<String > nameList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTV = findViewById(R.id.NameTV);
        addBtn = findViewById(R.id.addBtn);
        nameListView = findViewById(R.id.nameLV);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,nameList);
        nameListView.setAdapter(adapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name = nameTV.getText().toString();
                nameList.add(name);
                nameTV.setText("");
                adapter.notifyDataSetChanged();
            }
        });
    }
}