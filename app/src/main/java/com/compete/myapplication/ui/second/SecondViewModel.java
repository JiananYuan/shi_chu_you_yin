package com.compete.myapplication.ui.second;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SecondViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SecondViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("第2页");
    }

    public LiveData<String> getText() {
        return mText;
    }
}