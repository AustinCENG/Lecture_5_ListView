package com.ceng319.listviewdemo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.text.BreakIterator;

public class DetailActivity extends AppCompatActivity {
    String countryId;
    TextView mTextView;
    TextView mTextView1;
    ImageView mImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Bundle extras = getIntent().getExtras();// extras bundle has the position index.
        if (extras == null) { return; } // get data via the key
        countryId = extras.getString("position");

        findAllViews();

        setDisplayOnLayout();

    }

    private void setDisplayOnLayout() {
        // Setup the textview.
        mTextView.setText("You clicked: " + SampleData.dataItemList.get(Integer.parseInt(countryId)).getItemName());

        mTextView1.setText("The population of this country is: " + SampleData.dataItemList.get(Integer.parseInt(countryId)).getPopulation());

        // Define an InputStream

        InputStream inputStream = null;
        try {
            // Get the image file
            String imageFile = SampleData.dataItemList.get(Integer.parseInt(countryId)).getFlagimage();
            // File operations, need to get the image from asset files.
            inputStream = getAssets().open(imageFile);
            Drawable d = Drawable.createFromStream(inputStream, null);
            mImage.setImageDrawable(d);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void findAllViews(){
        mTextView = findViewById(R.id.detailPage);
        mImage = findViewById(R.id.imagedetails);
        mTextView1 = findViewById(R.id.population);
    }

}
