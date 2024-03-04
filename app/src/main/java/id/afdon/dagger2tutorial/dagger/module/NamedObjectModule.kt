package id.afdon.dagger2tutorial.dagger.module

import dagger.Module
import dagger.Provides
import id.afdon.dagger2tutorial.model.NamedObject2
import id.afdon.dagger2tutorial.model.NamedObjectDependency
import javax.inject.Named

@Module
object NamedObjectModule {

    @Provides
    @JvmStatic
    fun provideNameObject2(
        @Named("named_object_dependency_1") namedObjectDependency1: NamedObjectDependency,
        @Named("named_object_dependency_2") namedObjectDependency2: NamedObjectDependency
    ): NamedObject2 {
        return NamedObject2(namedObjectDependency1, namedObjectDependency2)
    }
}