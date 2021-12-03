package com.example.finalapp.ui.madLibs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MadLibsViewModel {

    private MutableLiveData<String> mText;

    public MadLibsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the MadLibs fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
