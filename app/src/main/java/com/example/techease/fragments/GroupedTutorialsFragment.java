package com.example.techease.fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.techease.ListOfTutorials;
import com.example.techease.R;
import com.example.techease.models.Tutorial;

import java.util.ArrayList;

public class GroupedTutorialsFragment extends Fragment implements View.OnClickListener {

    NavController navCon;

    public GroupedTutorialsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.phone_feature_btn).setOnClickListener(this);
        view.findViewById(R.id.app_tutorial_btn).setOnClickListener(this);
        view.findViewById(R.id.internet_btn).setOnClickListener(this);
        view.findViewById(R.id.social_media_btn).setOnClickListener(this);
        navCon = Navigation.findNavController(view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grouped_tutorial, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    @Override
    public void onClick(View v) {

        ListOfTutorials listOfTutorials = new ListOfTutorials();
        ArrayList<Tutorial> featureList = listOfTutorials.phoneFeaturesList();
        switch (v.getId()){
            case R.id.phone_feature_btn:
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("feature", featureList);
                navCon.navigate(R.id.action_tutorialFragment_to_detailTutorialsFragment, bundle);
                break;
            case R.id.app_tutorial_btn:
                navCon.navigate(R.id.action_tutorialFragment_to_detailTutorialsFragment);
                break;
            case R.id.internet_btn:
                navCon.navigate(R.id.action_tutorialFragment_to_detailTutorialsFragment);
                break;
            case R.id.social_media_btn:
                navCon.navigate(R.id.action_tutorialFragment_to_detailTutorialsFragment);
                break;
        }

    }
}