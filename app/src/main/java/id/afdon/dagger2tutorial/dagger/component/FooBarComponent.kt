package id.afdon.dagger2tutorial.dagger.component

import dagger.Component
import id.afdon.dagger2tutorial.model.Bar
import id.afdon.dagger2tutorial.model.Foo

@Component
interface FooBarComponent {

    fun getFoo(): Foo

    fun getBar(): Bar
}