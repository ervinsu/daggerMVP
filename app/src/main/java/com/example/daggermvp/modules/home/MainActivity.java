package com.example.daggermvp.modules.home;

import android.content.Intent;
import android.os.Bundle;

import com.example.daggermvp.R;
import com.example.daggermvp.base.BaseActivity;
import com.example.daggermvp.mvp.presenter.CakePresenter;
import com.example.daggermvp.mvp.view.MainView;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainView {

    @Inject protected CakePresenter mPresenter;

    @Override
    public void onViewReady(Bundle savedInstanceState, Intent intent) {
        super.onViewReady(savedInstanceState, intent);
        mPresenter.getCakes();
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void resolveDaggerDepedency() {
        
    }
}
