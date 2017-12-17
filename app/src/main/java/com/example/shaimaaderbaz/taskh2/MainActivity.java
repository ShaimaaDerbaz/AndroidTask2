package com.example.shaimaaderbaz.taskh2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ImageItem> images=new ArrayList<ImageItem>();
        //String[] images=new String[10];
        images.add(new ImageItem(R.drawable.facebook,1));
        images.add(new ImageItem(R.drawable.googleplus,2));
        images.add(new ImageItem(R.drawable.linkedin,3));
        images.add(new ImageItem(R.drawable.twitter,4));
        images.add(new ImageItem(R.drawable.wordpress,5));
        images.add(new ImageItem(R.drawable.youtube,6));

        ListAdapter adapter = new ListAdapter(this,images);
        ListView listView = (ListView) findViewById(R.id.activity_main);
        listView.setAdapter(adapter);
    }
}
