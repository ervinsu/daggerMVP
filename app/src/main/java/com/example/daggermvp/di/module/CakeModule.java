package com.example.daggermvp.di.module;

import com.example.daggermvp.api.CakeAppsService;
import com.example.daggermvp.di.scope.PerActivity;
import com.example.daggermvp.mvp.view.MainView;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class CakeModule {

    private MainView mainView;

    public CakeModule(MainView mainView){
        this.mainView = mainView;
    }

    @PerActivity
    @Provides
    CakeAppsService provideApiService(Retrofit retrofit){
        return retrofit.create(CakeAppsService.class);
    }

    @PerActivity
    @Provides
    MainView provideView(){
        return mainView;
    }
}
