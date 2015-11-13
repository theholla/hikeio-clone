package com.example.guest.hikeioclone.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.guest.hikeioclone.R;
import com.example.guest.hikeioclone.models.Hike;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AddHikeActivity extends AppCompatActivity {
    @Bind(R.id.txtName) EditText mName;
    @Bind(R.id.txtLocation) EditText mLocation;
    @Bind(R.id.txtDistance) EditText mDistance;
    @Bind(R.id.txtElevGain) EditText mElevGain;
    @Bind(R.id.txtElevMax) EditText mElevMax;
    @Bind(R.id.txtLat) EditText mLatitude;
    @Bind(R.id.txtLong) EditText mLongitude;
    @Bind(R.id.btnAddHike) Button mAddHike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hike);
        ButterKnife.bind(this);

        mAddHike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addHike();
                goToMainPage();
            }
        });

    }

    private void goToMainPage() {
        Intent intent = new Intent(AddHikeActivity.this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    private void addHike() {
        String name = mName.getText().toString();
        String location = mLocation.getText().toString();
        String distance = mDistance.getText().toString();
        int elevGain = Integer.parseInt(mElevGain.getText().toString());
        int elevMax = Integer.parseInt(mElevMax.getText().toString());
        int latitude = Integer.parseInt(mLatitude.getText().toString());
        int longitude = Integer.parseInt(mLongitude.getText().toString());

        Hike hike = new Hike(name, location, distance, elevGain, elevMax, latitude, longitude);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_hike, menu);
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
