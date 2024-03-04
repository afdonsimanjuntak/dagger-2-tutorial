package id.afdon.dagger2tutorial.dagger.component

import dagger.BindsInstance
import dagger.Component
import id.afdon.dagger2tutorial.dagger.module.NamedObject
import id.afdon.dagger2tutorial.dagger.module.NamedObjectDependency
import javax.inject.Named

@Component
interface NamedObjectComponent {

    fun namedObject() : NamedObject

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun setNamedObjectDependency1(
            @Named("named_object_dependency_1") namedObjectDependency: NamedObjectDependency
        ) : Builder

        @BindsInstance
        fun setNamedObjectDependency2(
            @Named("named_object_dependency_2") namedObjectDependency: NamedObjectDependency
        ) : Builder

        fun build(): NamedObjectComponent
    }
}