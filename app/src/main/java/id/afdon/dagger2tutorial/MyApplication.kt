package id.afdon.dagger2tutorial

import android.app.Application
import id.afdon.dagger2tutorial.dagger.component.ApplicationComponent
import id.afdon.dagger2tutorial.dagger.component.DaggerApplicationComponent

class MyApplication: Application() {

    private val applicationComponent : ApplicationComponent by lazy {
        DaggerApplicationComponent.create()
    }

    fun applicationComponent() : ApplicationComponent = applicationComponent
}