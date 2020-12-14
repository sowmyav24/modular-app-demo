package com.example.app.di

import com.example.app.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract fun contributeActivityInjector(): MainActivity
}