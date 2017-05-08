package com.mahiltletdan.hw1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Mahilet
 * on 4/15/17.
 */


public class DetailActivity extends AppCompatActivity {
    private static final String TAG= DetailActivity.class.getSimpleName();


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        MenuItem itemToHide = menu.findItem(R.id.action_about);
        itemToHide.setVisible(false);
        return true;


    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item
        if (item.getItemId() == R.id.home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }
        if (item.getItemId() == R.id.action_movie_list) {
            Intent intent = new Intent(this, MyMoviesList.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if (savedInstanceState != null) {
            Log.d(TAG, "onCreate() Restoring previous state");
            /* restore state */
        } else {
            Log.d(TAG, "onCreate() No saved state available");
            /* initialize app */
        }

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String myDetail=   intent.getStringExtra(MainActivity.MESSAGE_TO_PASS);
        // Capture the layout's TextView and set the string as its text
        TextView myReceiver =(TextView) findViewById(R.id.receiver);
        //create a new TextView object
        myReceiver.setText(myDetail);

        //append state name with TextView static text

        Log.d(TAG, "onCreate()");

        //Main App Menu
        Toolbar ToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(ToolBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }



    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume()");
    }


    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause()");
    }


    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop()");
    }


    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }
}
