package com.example.techease;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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