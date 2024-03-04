package id.afdon.dagger2tutorial.dagger.component

import dagger.Component
import id.afdon.dagger2tutorial.MainActivity

@Component
interface VariableInjectionComponent {

    fun inject(mainActivity: MainActivity)
}