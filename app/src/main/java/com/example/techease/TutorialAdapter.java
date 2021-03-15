package com.example.techease;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.techease.models.Tutorial;

import java.util.ArrayList;

public class TutorialAdapter extends RecyclerView.Adapter<TutorialAdapter.TutorialViewHolder> {

    private ArrayList<Tutorial> tutorialList = new ArrayList<>();

    public TutorialAdapter(ArrayList<Tutorial> tutorialList) {
        this.tutorialList = tutorialList;
    }

    @NonNull
    @Override
    public TutorialViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new TutorialViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.tutorial_item,
                        parent, false)
        );
    }

    @Override
    public void onBindViewHolder(@NonNull TutorialViewHolder holder, int position) {
        Tutorial tutorial = this.tutorialList.get(position);
        holder.getTutorialName().setText(tutorial.getTutorialName());
        holder.getTutorialImg().setImageResource(tutorial.getTutorialImg());
    }

    @Override
    public int getItemCount() {
        return tutorialList.size();
    }


    public class TutorialViewHolder extends RecyclerView.ViewHolder {

        private TextView tutorialName;
        private ImageView tutorialImg;

        public TutorialViewHolder(@NonNull View itemView) {
            super(itemView);

            tutorialName = itemView.findViewById(R.id.tutorial_label);
            tutorialImg = itemView.findViewById(R.id.tutorial_icon);
        }

        public TextView getTutorialName() {
            return tutorialName;
        }

        public ImageView getTutorialImg() {
            return tutorialImg;
        }
    }
}
