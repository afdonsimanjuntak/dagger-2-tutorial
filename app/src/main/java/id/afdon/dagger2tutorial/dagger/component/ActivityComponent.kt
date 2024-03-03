package id.afdon.dagger2tutorial.dagger.component

import dagger.Component
import id.afdon.dagger2tutorial.dagger.module.ActivityModule
import id.afdon.dagger2tutorial.dagger.scope.ActivityScope
import id.afdon.dagger2tutorial.model.ActivityScopedObject

@ActivityScope
@Component(modules = [ActivityModule::class])
interface ActivityComponent {

    fun getActivityScopedObject(): ActivityScopedObject
}