package com.example.exercise2task;

import android.app.Application;
import android.util.Log;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StringViewModel extends ViewModel {

    private final MutableLiveData<String> stringData = new MutableLiveData<String>();

    public String getStringData() {
        return stringData.isInitialized() ? stringData.getValue() : "ERROR GETTING DATA";
    }

    public void setStringData(String stringData) {
        Log.v("GDG", "Set string data: " + stringData);
        this.stringData.setValue(stringData);
    }
}
