package com.compete.myapplication.ui.fourth;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FourthViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public FourthViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("第4页");
    }

    public LiveData<String> getText() {
        return mText;
    }
}