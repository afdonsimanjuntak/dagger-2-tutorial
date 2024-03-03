package id.afdon.dagger2tutorial.dagger.module

import dagger.Module
import dagger.Provides
import id.afdon.dagger2tutorial.dagger.scope.ActivityScope
import id.afdon.dagger2tutorial.model.ActivityScopedObject

@Module
object ActivityModule {

    @Provides
    @ActivityScope
    @JvmStatic
    fun provideActivityScopedObject(): ActivityScopedObject {
        return ActivityScopedObject()
    }
}