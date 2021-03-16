package com.example.techease.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.techease.R;
import com.example.techease.models.Tutorial;

import java.util.ArrayList;

public class TutorialAdapter extends RecyclerView.Adapter<TutorialAdapter.TutorialViewHolder> {

    private ArrayList<Tutorial> tutorialList = new ArrayList<>();
    private final TutorialOnClickHandler clickHandler;

    public interface TutorialOnClickHandler{
        void onClick(String tutorialName, int position);
    }

    public TutorialAdapter(ArrayList<Tutorial> tutorialList, TutorialOnClickHandler clickHandler) {
        this.tutorialList = tutorialList;
        this.clickHandler = clickHandler;
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


    public class TutorialViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView tutorialName;
        private ImageView tutorialImg;

        public TutorialViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            tutorialName = itemView.findViewById(R.id.tutorial_label);
            tutorialImg = itemView.findViewById(R.id.tutorial_icon);
        }

        public TextView getTutorialName() {
            return tutorialName;
        }

        public ImageView getTutorialImg() {
            return tutorialImg;
        }

        @Override
        public void onClick(View v) {
            int adapterPosition = getAdapterPosition();
            Tutorial tutorial = tutorialList.get(adapterPosition);

            String name = tutorial.getTutorialName();
            clickHandler.onClick(name, adapterPosition);
        }
    }
}
