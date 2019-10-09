package com.ceng319.listviewdemo;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

// TODO 2: Define a List as ArrayList Collection Finished
    List<DataItem> dataList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        processDataAdapter();

    }

    private void processDataAdapter() {
        List<DataItem> dataItemList = SampleData.dataItemList;
        // TODO 4: Assign the list adapter and listview. Finished
        DataAdapter adapter = new DataAdapter(this, R.id.listView, dataItemList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        // TODO 5: set the listView click event. Finished
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("MapleLeaf", Integer.toString(position));
                // Use intent to pass the activity and position of the click.
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("position", Integer.toString(position));
                startActivity(intent);
            }
        });
    }
}
