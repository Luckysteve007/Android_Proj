package com.example.fragmentsapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_second,container,false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView myTxt2=view.findViewById(R.id.FragmentText2);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button myBtn2=view.findViewById(R.id.FragmentBtn2);
        myBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Second Fragment Called", Toast.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}