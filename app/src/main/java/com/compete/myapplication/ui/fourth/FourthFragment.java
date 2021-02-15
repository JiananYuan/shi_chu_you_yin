package com.compete.myapplication.ui.fourth;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.compete.myapplication.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

public class FourthFragment extends Fragment {
    private FourthViewModel fourthViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fourthViewModel =
                new ViewModelProvider(this).get(FourthViewModel.class);
        View root = inflater.inflate(R.layout.fragment_fourth, container, false);
//        final TextView textView = root.findViewById(R.id.text_fourth);
//        fourthViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}
