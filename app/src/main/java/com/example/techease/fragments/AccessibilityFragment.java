package com.example.techease.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.techease.R;

public class AccessibilityFragment extends Fragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button textToSpeech_btn = view.findViewById(R.id.textToSpeech_btn);
        Button visionOption_btn = view.findViewById(R.id.visionOption_btn);
        Button voiceCommand_btn = view.findViewById(R.id.voice_cmd_btn);

        textToSpeech_btn.setOnClickListener(v -> {
            Toast.makeText(getContext(), "Text-to-Speech activated", Toast.LENGTH_SHORT).show();
        });
        visionOption_btn.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Vision Option activated", Toast.LENGTH_SHORT).show();
        });
        voiceCommand_btn.setOnClickListener(v -> {
            Toast.makeText(getContext(),"Voice command activated", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_accessibility, container, false);
    }
}