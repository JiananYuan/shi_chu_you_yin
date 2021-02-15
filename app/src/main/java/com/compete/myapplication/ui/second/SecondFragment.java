package com.compete.myapplication.ui.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.compete.myapplication.R;

public class SecondFragment extends Fragment {

    private SecondViewModel secondViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        secondViewModel =
                new ViewModelProvider(this).get(SecondViewModel.class);
        View root = inflater.inflate(R.layout.fragment_second, container, false);
//        final TextView textView = root.findViewById(R.id.text_second);
//        secondViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}