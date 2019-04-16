package com.example.daggermvp.di.component;

import android.content.Context;

import com.example.daggermvp.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    Retrofit exoposeRetrofit();

    Context exposeContext();
}
