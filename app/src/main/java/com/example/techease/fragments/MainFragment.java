package com.example.techease.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.techease.R;

public class MainFragment extends Fragment implements View.OnClickListener {

    NavController navCon;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.start_tutorials_button).setOnClickListener(this);

        navCon = Navigation.findNavController(view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.start_tutorials_button:
                navCon.navigate(R.id.action_mainFragment_to_tutorialFragment);
                break;
        }
    }
}
