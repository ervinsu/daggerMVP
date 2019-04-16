package com.example.daggermvp.di.module;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApplicationModule {
    private String mBaseUrl;
    private Context context;

    public ApplicationModule(String mBaseUrl,Context context){
        this.mBaseUrl = mBaseUrl;
        this.context = context;
    }


    @Singleton
    @Provides
    @Named("conver-1")
    GsonConverterFactory provideGsonConverterFactory(){
        return GsonConverterFactory.create();
    }



    @Singleton
    @Provides
    @Named("okhttp-1")
    OkHttpClient provideHttpClient1(){
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build();
    }


    @Singleton
    @Provides
    @Named("okhttp-2")
    OkHttpClient provideHttpClient2(){
        return new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .build();
    }

    @Singleton
    @Provides
    RxJava2CallAdapterFactory provideRxJavaCallAdapterFactory(){
        return RxJava2CallAdapterFactory.create();
    }

    @Singleton
    @Provides
    Retrofit provideRetrofit(@Named("okhttp-1") OkHttpClient client, @Named("conver-1") GsonConverterFactory gsonConverterFactory, RxJava2CallAdapterFactory adapterFactory){
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .addConverterFactory(gsonConverterFactory)
                .addCallAdapterFactory(adapterFactory)
                .client(client)
                .build();
    }

    @Singleton
    @Provides
    Context provideContext(){
        return this.context;
    }
}
