package com.yichee.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add to listview
        String[] games = {"Final Fantasy XV", "Tales of Zestiria", "Tales of Berseria", "Nioh", "Persona 5", "Kingdom Hearts III", "Digimon Story Cyber Sleuth"};

        //Converts an array into list items
        ListAdapter gamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, games);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(gamesAdapter);


        //Add click functionality to list items
        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String game = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(MainActivity.this, game, Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

}
