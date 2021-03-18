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

    @RequiresApi(api = Build.VERSION_CODES.R)
    public ArrayList<Tutorial>appTutorialList(){
        List<String> listOfAppTut = List.of("Calendar", "Alarm and Clock", "Weather", "Maps",
                "Apps Store", "Files", "Contacts", "Calculator", "Play Music");

        ArrayList<Tutorial> appList = new ArrayList<>();
        for (int i = 0; i < listOfAppTut.size(); i++){
            appList.add(new Tutorial(listOfAppTut.get(i), R.drawable.app_icon));
        }
        return appList;
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    public ArrayList<Tutorial>internetList(){
        List<String> listOfInternetTut = List.of("Ads safety", "Personal Info on Web", "Safe Browsing",
                "Online Purchase", "Antivirus", "Password Online", "Download Online", "Post Online");

        ArrayList<Tutorial> internetList = new ArrayList<>();
        for (int i = 0; i < listOfInternetTut.size(); i++){
            internetList.add(new Tutorial(listOfInternetTut.get(i), R.drawable.internet));
        }

        return internetList;
    }
}
