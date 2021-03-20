package com.example.techease;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MediaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        Log.i("INFO", "Activity created??");

        Intent intent = getIntent();
        String tutorialTitle = intent.getStringExtra(MainActivity.s);
        Log.i("INFO", "Activity got extra as: "+ tutorialTitle);
        TextView tutorialVideoTitle = findViewById(R.id.extraView);
        tutorialVideoTitle.setText(tutorialTitle);
        //This grabs the passed tutorial name and sets it as the title of the video for the tutorial in this activity.
        //in the future we could pass variables to load transcript text and video urls as well.

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        String transcript = "00:05     Text messages are a quick and simple way" +
                "\n                  to send short messages to anyone that" +
                "\n                  has a cell phone capable of receiving them." +
                "\n00:12     In this video, we\'ll learn how to" +
                "\n                  compose a text message," +
                "\n                  read and respond to a received" +
                "\n00:21     text message, send a photo message, and" +
                "\n                  delete a text message conversation. First," +
                "\n                  let\'s go over the options in the text" +
                "\n00:31     messages app. Start at the home screen" +
                "\n                  and find and tap text messages.";
        TextView transcriptShow = findViewById(R.id.editTextTextMultiLine);
        transcriptShow.setText(transcript);
        // Arica: Changing the color of the text from gray to black for readability.
        transcriptShow.setTextColor(Color.parseColor("#000000"));
    }
}