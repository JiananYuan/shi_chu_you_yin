package com.compete.myapplication.ui.third;

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

import com.compete.myapplication.MainActivity;
import com.compete.myapplication.R;
import com.youth.banner.Banner;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;

public class ThirdFragment extends Fragment {

    private ThirdViewModel thirdViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        thirdViewModel =
                new ViewModelProvider(this).get(ThirdViewModel.class);
        View root = inflater.inflate(R.layout.fragment_third, container, false);



//        final TextView textView = root.findViewById(R.id.text_third);
//        thirdViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}