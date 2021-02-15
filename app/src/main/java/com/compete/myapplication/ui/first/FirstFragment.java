package com.compete.myapplication.ui.first;

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

public class FirstFragment extends Fragment {

    private FirstViewModel firstViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        firstViewModel =
                new ViewModelProvider(this).get(FirstViewModel.class);
        View root = inflater.inflate(R.layout.fragment_first, container, false);
//        final TextView textView = root.findViewById(R.id.first_page_bg);
//        firstViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}