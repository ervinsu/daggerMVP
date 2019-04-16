package com.example.daggermvp.mvp.presenter;

import com.example.daggermvp.base.BasePresenter;
import com.example.daggermvp.mvp.view.MainView;

import javax.inject.Inject;

public class CakePresenter extends BasePresenter<MainView> {

    @Inject public CakePresenter(){

    }

    public void getCakes() {
    }
}
