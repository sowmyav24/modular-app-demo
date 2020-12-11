package com.example.app.component

import com.example.app.MainActivity
import com.example.app.module.InstantBuyModule
import dagger.Component

@Component(modules = [InstantBuyModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}