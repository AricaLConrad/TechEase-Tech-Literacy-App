package com.example.techease.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.techease.MediaActivity;
import com.example.techease.R;

import static com.example.techease.MainActivity.s;


public class OverviewFragment extends Fragment{

    public OverviewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.i("INFO", "overview fragment started");
        String tutorialName = getArguments().getString("name");
        s = tutorialName;
        int position = getArguments().getInt("position");
        TextView instruction = view.findViewById(R.id.instru);
        instruction.setText("The " + tutorialName + " Tutorial will teach you the following:");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_overview, container, false);

        Button button = rootView.findViewById(R.id.start_btn);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(getActivity(), MediaActivity.class);
            String tutName = s;
            intent.putExtra(s, tutName);
            Log.i("INFO", s);
            Log.i("INFO", "Activity started??");
            startActivity(intent);
            //This doesn't do much yet, it just navigates to the media activity from the overview fragment button and
            // passes the tutorial name.
            //with some expanding of this method, we will be able to pass a lot more and swap the content of the
            // media activity to be replaced with whatever tutorial content we need in the future.
        });
        return rootView;
    }
}