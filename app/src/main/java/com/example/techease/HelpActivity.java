package com.example.techease;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        // Arica: Adding the reference to the toolbar for the top action menu bar.
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Arica: Get a support ActionBar corresponding to the toolbar.
        ActionBar actionBar = getSupportActionBar();

        // Arica: Enable the "Up" button (the back button). It will automatically look like a back arrow.
        actionBar.setDisplayHomeAsUpEnabled(true);

        Button callUsBtn = findViewById(R.id.contact_us_btn);
        Button emailUsBtn = findViewById(R.id.email_btn);

        callUsBtn.setOnClickListener(v -> {
            Uri number = Uri.parse("tel:5244549");
            Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent);
        });

        emailUsBtn.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:customercare@techease.com"));

            try {
                startActivity(emailIntent);
            } catch (ActivityNotFoundException e) {
                Toast.makeText(this,"No Email Application Found", Toast.LENGTH_LONG).show();
            }

        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
        // Arica: I just needed this to get the error to go away. I am still not sure what this
        // method is supposed to do.
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Arica: Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.top_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Arica: If the back arrow is pressed, the app will navigate to the previous screen
            // the user was on.
            case android.R.id.home:
                finish();
                return true;
            // Arica: If the home button is pressed, the app will navigate to the Main Activity, which
            // is the home screen.
            case R.id.home_button:
                Intent intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                break;
            // Arica: If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            default:
                return super.onOptionsItemSelected(item);
        }

        // Arica: Returning true to make sure this method returns something.
        return true;
    }
}