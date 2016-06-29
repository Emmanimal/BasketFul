package com.example.kevin.yoloapp;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class FourthActivity extends Activity {

    public void next_screen(View v){
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }

    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }


//    public void biggerView(View v)
//    {
//        im=(ImageView)findViewById(R.id.selected);
//
//        switch (v.getId())
//        {
//            case R.id.image1: im.setImageResource(R.drawable.ic_launcher);
//                break;
//            case R.id.image2: im.setImageResource(R.drawable.ic_launcher);
//                break;
//            case R.id.image3: im.setImageResource(R.drawable.ic_launcher);
//                break;
//            case R.id.image21: im.setImageResource(R.drawable.ic_launcher);
//                break;
//            case R.id.image22: im.setImageResource(R.drawable.ic_launcher);
//                break;
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fourth, menu);
        return true;
    }
}