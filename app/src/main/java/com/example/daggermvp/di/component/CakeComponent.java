package com.example.daggermvp.di.component;

import android.content.Context;

import com.example.daggermvp.di.module.CakeModule;
import com.example.daggermvp.di.scope.PerActivity;
import com.example.daggermvp.modules.home.MainActivity;

import dagger.Component;
import retrofit2.Retrofit;

@PerActivity
@Component (modules= CakeModule.class, dependencies = ApplicationComponent.class)
public interface CakeComponent {
    void inject(MainActivity mainActivity);

}
