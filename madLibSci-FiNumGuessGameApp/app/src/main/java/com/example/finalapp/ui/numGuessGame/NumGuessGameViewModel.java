package com.example.finalapp.ui.numGuessGame;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NumGuessGameViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NumGuessGameViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the Number Guessing Game fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}