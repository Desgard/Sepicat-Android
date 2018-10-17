package com.desgard.sepicat.gua.Feed;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.desgard.sepicat.gua.R;

public class FeedActivity extends AppCompatActivity {
    private String[] data = {"Apple", "Orange", "Banana", "Watermelon"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                FeedActivity.this, android.R.layout.simple_list_item_1, data
        );
        ListView listView = (ListView)findViewById(R.id.feed_list_view);
        listView.setAdapter(adapter);
    }


}
