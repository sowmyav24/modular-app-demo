package com.example.app.di

import com.example.app.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface MyApplicationModule {
    @ContributesAndroidInjector
    fun contributeActivityInjector(): MainActivity
}