package id.afdon.dagger2tutorial.dagger.component

import dagger.Component
import id.afdon.dagger2tutorial.dagger.module.ThirdPartyImplModule
import id.afdon.dagger2tutorial.dagger.module.ThirdPartyModule
import id.afdon.dagger2tutorial.model.ThirdPartyClass
import id.afdon.dagger2tutorial.model.ThirdPartyInterface

@Component(modules = [ThirdPartyModule::class, ThirdPartyImplModule::class])
interface ThirdPartyComponent {

    fun getThirdPartyClass(): ThirdPartyClass

    fun getThirdPartyInterface(): ThirdPartyInterface
}