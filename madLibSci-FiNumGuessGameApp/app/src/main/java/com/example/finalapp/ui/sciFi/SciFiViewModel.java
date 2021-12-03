package com.example.finalapp.ui.sciFi;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SciFiViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SciFiViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Sci-Fi fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}