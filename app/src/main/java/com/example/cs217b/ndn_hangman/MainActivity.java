package com.example.cs217b.ndn_hangman;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_new = (Button) findViewById(R.id.button_new);
        button_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks", "New Game button clicked");
                Intent intent = new Intent(MainActivity.this, NewGameActivity.class);
                startActivity(intent);
            }
        });

        Button button_create = (Button) findViewById(R.id.button_create);
        button_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks", "Create Game button clicked");
                Intent intent = new Intent(MainActivity.this, CreateGame.class);
                startActivity(intent);
            }
        });

        Button button_join = (Button) findViewById(R.id.button_join);
        button_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks", "Join Game button clicked");
                Intent intent = new Intent(MainActivity.this, JoinGameActivity.class);
                startActivity(intent);
            }
        });

        Button button_load = (Button) findViewById(R.id.button_load);
        button_load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("clicks", "Load Game button clicked");
                Intent intent = new Intent(MainActivity.this, LoadGame.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
