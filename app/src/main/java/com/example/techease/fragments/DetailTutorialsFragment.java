package com.example.techease.fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.techease.ListOfTutorials;
import com.example.techease.R;
import com.example.techease.TutorialAdapter;
import com.example.techease.models.Tutorial;

import java.util.ArrayList;

public class DetailTutorialsFragment extends Fragment {

    ArrayList<Tutorial> tutorialList = new ArrayList<>();
    ListOfTutorials listOfTutorials;

    public DetailTutorialsFragment() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listOfTutorials = new ListOfTutorials();

        if (getArguments().getInt("tutorial") == 1){
            tutorialList = listOfTutorials.phoneFeaturesList();
        } else if (getArguments().getInt("tutorial") == 2){
            tutorialList = listOfTutorials.appTutorialList();
        }

        RecyclerView tutorialRv = view.findViewById(R.id.tutotial_list);
        tutorialRv.setLayoutManager(new LinearLayoutManager(getContext()));
        TutorialAdapter tutorialAdapter = new TutorialAdapter(tutorialList);
        tutorialRv.setAdapter(tutorialAdapter);
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_tutorials, container, false);
    }
}