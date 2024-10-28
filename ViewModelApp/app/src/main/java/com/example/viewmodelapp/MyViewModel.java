package com.example.viewmodelapp;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> counter=new MutableLiveData<>();

    public void increaseCounter(View view){
        //Retrieve current value from live data
        int currentValue=counter.getValue() !=null? counter.getValue():0;
        //increase value by 1
        counter.setValue(currentValue+1);
    }

    public MutableLiveData<Integer> getCounter() {
        return counter;
    }
}
