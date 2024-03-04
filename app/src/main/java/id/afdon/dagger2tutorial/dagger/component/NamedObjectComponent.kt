package id.afdon.dagger2tutorial.dagger.component

import dagger.BindsInstance
import dagger.Component
import id.afdon.dagger2tutorial.dagger.module.NamedObjectModule
import id.afdon.dagger2tutorial.model.NamedObject
import id.afdon.dagger2tutorial.model.NamedObject2
import id.afdon.dagger2tutorial.model.NamedObjectDependency
import javax.inject.Named

@Component(modules = [NamedObjectModule::class])
interface NamedObjectComponent {

    fun namedObject() : NamedObject

    fun namedObject2() : NamedObject2

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