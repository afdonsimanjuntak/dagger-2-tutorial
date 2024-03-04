package id.afdon.dagger2tutorial.dagger.component

import dagger.BindsInstance
import dagger.Component
import id.afdon.dagger2tutorial.dagger.module.RunTimeModule
import id.afdon.dagger2tutorial.model.RunTimeDependency
import id.afdon.dagger2tutorial.model.RunTimeObject

@Component(modules = [RunTimeModule::class])
interface RunTimeComponent {

    fun getRunTimeObject(): RunTimeObject

    @Component.Builder
    interface Builder {

        @BindsInstance fun setRunTimeDependency(runTimeDependency: RunTimeDependency): Builder

        fun build(): RunTimeComponent
    }
}