package com.example.techease.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.techease.R;


public class SettingFragment extends Fragment implements View.OnClickListener{

    NavController navCon;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.notification_btn).setOnClickListener(this);
        view.findViewById(R.id.access_btn).setOnClickListener(this);
        navCon = Navigation.findNavController(view);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.notification_btn:
                navCon.navigate(R.id.action_settingFragment_to_notificationFragment);
                break;
            case R.id.access_btn:
                navCon.navigate(R.id.action_settingFragment_to_accessibilityFragment);
                break;
        }
    }
}