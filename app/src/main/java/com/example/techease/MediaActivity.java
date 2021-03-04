package com.example.techease;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MediaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);

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
    }
}