package com.example.spotifytest;

import android.os.Bundle;

import com.spotify.sdk.android.auth.AuthorizationRequest;
import androidx.appcompat.app.AppCompatActivity;

public class ListPlaylist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_playlist);

    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
