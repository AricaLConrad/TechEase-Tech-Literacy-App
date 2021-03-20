package com.example.techease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;


public class MainActivity extends AppCompatActivity {

    public static String s = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ExtendedFloatingActionButton helpFab = findViewById(R.id.help_button);
        helpFab.setOnClickListener(v -> {
            Intent helpIntent = new Intent(this, HelpActivity.class);
            startActivity(helpIntent);
        });
    }

/*    public void goToMediaActivity(View view) {
        Intent intent = new Intent(this, MediaActivity.class);
        Context context = getApplicationContext();
        String message = "Activity switch was attempted";
        int duration = Toast.LENGTH_SHORT;
        Log.i("INFO", message);
        startActivity(intent);
    }*/
}