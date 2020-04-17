package com.example.partysearchbeta.ui.decorador;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DecoradorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DecoradorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}