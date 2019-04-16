package com.example.daggermvp.base;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.daggermvp.di.component.DaggerApplicationComponent;

public abstract class BaseActivity extends AppCompatActivity {

    private ProgressDialog dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        onViewReady(savedInstanceState,getIntent());
    }

    @CallSuper
    public void onViewReady(Bundle savedInstanceState, Intent intent){
        //USED BY CHILD
        resolveDaggerDepedency();
    }

    protected void resolveDaggerDepedency(){
        DaggerApplicationComponent.builder().build();
    }


    public void showDialog(String message){
        if(dialog==null){
            dialog = new ProgressDialog(this);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.setCancelable(true);
        }
        dialog.setMessage(message);
        dialog.show();
    }

    public void hideDialog(){
        if(dialog!=null && dialog.isShowing()){
            dialog.dismiss();
        }
    }
    protected abstract int getContentView();

}
