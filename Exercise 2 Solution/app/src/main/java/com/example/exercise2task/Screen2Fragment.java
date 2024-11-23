package com.example.exercise2task;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Screen2Fragment extends Fragment {

    private StringViewModel stringViewModel;
    TextView textView;

    public Screen2Fragment() {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = requireView().findViewById(R.id.textView);

        stringViewModel = new ViewModelProvider(requireActivity()).get(StringViewModel.class);

        Log.v("GDG", stringViewModel.getStringData());
        textView.setText(stringViewModel.getStringData());
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_screen2, container, false);
    }
}