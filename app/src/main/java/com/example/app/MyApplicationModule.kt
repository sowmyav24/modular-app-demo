package com.example.app

import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class MyApplicationModule {
    @ContributesAndroidInjector
    abstract fun contributeActivityInjector(): MainActivity
}