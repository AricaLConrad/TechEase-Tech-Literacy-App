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
                "Voicemail", "Videos", "Music");

        ArrayList<Tutorial> phoneFeatures = new ArrayList<>();
        for (int i = 0; i < featureList.size(); i++ ){
            phoneFeatures.add(new Tutorial(featureList.get(i), R.drawable.phone));
        }
        return phoneFeatures;
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    public ArrayList<Tutorial>appTutorialList(){
        List<String> listOfAppTut = List.of("Calendar", "Alarms and Clock", "Weather", "Maps",
                "App Store", "Files", "Contacts", "Calculator", "Play Music");

        ArrayList<Tutorial> appList = new ArrayList<>();
        for (int i = 0; i < listOfAppTut.size(); i++){
            appList.add(new Tutorial(listOfAppTut.get(i), R.drawable.app_icon));
        }
        return appList;
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    public ArrayList<Tutorial>internetList(){
        List<String> listOfInternetTut = List.of( "Web 101","Ad Safety", "Cookies", "Using a Search Engine", "Personal Info on Web",
                "Safe Browsing", "Online Purchases", "Antivirus", "Passwords Online"
                , "Downloading Online", "Posting Online");

        ArrayList<Tutorial> internetList = new ArrayList<>();
        for (int i = 0; i < listOfInternetTut.size(); i++){
            internetList.add(new Tutorial(listOfInternetTut.get(i), R.drawable.internet));
        }
        return internetList;
    }

    @RequiresApi(api = Build.VERSION_CODES.R)
    public ArrayList<Tutorial>socialMediaList(){
        List<String> listOfSMTutorial = List.of("Social Media 101", "Zoom", "Facebook", "Instagram", "Snapchat"
                , "Tik Tok", "Twitter", "Pinterest", "YouTube", "Messenger", "FaceTime");

        ArrayList<Tutorial> mediaList = new ArrayList<>();
        for (int i = 0; i < listOfSMTutorial.size(); i++){
            mediaList.add(new Tutorial(listOfSMTutorial.get(i), R.drawable.social_media));
        }
        return mediaList;
    }
}
