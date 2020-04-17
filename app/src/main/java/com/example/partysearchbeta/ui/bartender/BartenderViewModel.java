package com.example.partysearchbeta.ui.bartender;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BartenderViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BartenderViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}