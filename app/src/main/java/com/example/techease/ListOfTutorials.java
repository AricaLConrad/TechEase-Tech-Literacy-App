package com.example.techease;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.techease.models.Tutorial;

import java.util.ArrayList;
import java.util.List;

public class ListOfTutorials {

    @RequiresApi(api = Build.VERSION_CODES.R)
    public ArrayList<Tutorial> phoneFeaturesList(){

        List<String> featureList = List.of("Contact List", "Calling", "Texting", "Camera", "Photos",
                "Voice Mail", "Videos", "Music");
        ArrayList<Tutorial> phoneFeatures = new ArrayList<>();
        for (int i = 0; i < featureList.size(); i++ ){
            phoneFeatures.add(new Tutorial(featureList.get(i), R.drawable.phone));
        }
        return phoneFeatures;
    }
}
