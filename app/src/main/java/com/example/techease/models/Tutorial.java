package com.example.techease.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Tutorial implements Parcelable {
    private String tutorialName;
    private int tutorialImg;

    public Tutorial(String tutorialName, int tutorialImg) {
        this.tutorialName = tutorialName;
        this.tutorialImg = tutorialImg;
    }

    protected Tutorial(Parcel in) {
        tutorialName = in.readString();
        tutorialImg = in.readInt();
    }

    public static final Creator<Tutorial> CREATOR = new Creator<Tutorial>() {
        @Override
        public Tutorial createFromParcel(Parcel in) {
            return new Tutorial(in);
        }

        @Override
        public Tutorial[] newArray(int size) {
            return new Tutorial[size];
        }
    };

    public String getTutorialName() {
        return tutorialName;
    }

    public int getTutorialImg() {
        return tutorialImg;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(tutorialName);
        dest.writeInt(tutorialImg);
    }
}
