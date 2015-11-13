package com.example.guest.hikeioclone.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.guest.hikeioclone.BaseActivity;
import com.example.guest.hikeioclone.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {
    @Bind(R.id.btnMap) Button mButton;
    @Bind(R.id.locationText) EditText mLocationText;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = mLocationText.getText().toString();
                Uri intentForLocation = Uri.parse("geo:0,0?q=" + location);
                Log.d("LOCATION!!!!!", intentForLocation + "");
                Intent mapIntent = new Intent(MainActivity.this, MapsActivity.class);
                mapIntent.putExtra("location", intentForLocation);
                mapIntent.setData(intentForLocation);
                setContentView(R.layout.activity_maps);
                startActivity(mapIntent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        if (id == R.id.action_add) {
            Intent intent = new Intent(MainActivity.this, AddHikeActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
