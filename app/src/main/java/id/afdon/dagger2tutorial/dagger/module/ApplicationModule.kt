package id.afdon.dagger2tutorial.dagger.module

import dagger.Module
import dagger.Provides
import id.afdon.dagger2tutorial.dagger.scope.ApplicationScope
import id.afdon.dagger2tutorial.model.ApplicationScopedObject

@Module
object ApplicationModule {

    @Provides
    @ApplicationScope
    @JvmStatic
    fun provideApplicationScopedObject() : ApplicationScopedObject {
        return ApplicationScopedObject()
    }
}