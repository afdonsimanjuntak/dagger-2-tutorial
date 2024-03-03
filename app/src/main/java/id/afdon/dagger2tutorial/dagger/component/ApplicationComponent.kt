package id.afdon.dagger2tutorial.dagger.component

import dagger.Component
import id.afdon.dagger2tutorial.dagger.module.ApplicationModule
import id.afdon.dagger2tutorial.dagger.scope.ApplicationScope
import id.afdon.dagger2tutorial.model.ApplicationScopedObject

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun getApplicationScopedObject(): ApplicationScopedObject
}