package com.example.exercise2task;

import static android.os.SystemClock.sleep;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class HomeFragment extends Fragment {

    private StringViewModel stringViewModel;
    EditText editText;
    Button button;

    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        editText =  requireView().findViewById(R.id.editText);
        button = requireView().findViewById(R.id.button);

        stringViewModel = new ViewModelProvider(requireActivity()).get(StringViewModel.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                stringViewModel.setStringData(text);
                Log.v("GDG", "Text from TextEdit: " + text);
                Log.v("GDG", "Text from stringViewModel: " + stringViewModel.getStringData());
                Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_screen2Fragment);

            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}