package id.afdon.dagger2tutorial.dagger.module

import dagger.Module
import dagger.Provides
import id.afdon.dagger2tutorial.model.RunTimeDependency
import id.afdon.dagger2tutorial.model.RunTimeObject

@Module
object RunTimeModule {

    @Provides
    @JvmStatic
    fun provideRunTimeObject(runTimeDependency: RunTimeDependency): RunTimeObject {
        return RunTimeObject(runTimeDependency)
    }
}