package id.afdon.dagger2tutorial.dagger.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import id.afdon.dagger2tutorial.model.ThirdPartyInterface
import id.afdon.dagger2tutorial.model.ThirdPartyInterfaceImpl

@Module
interface ThirdPartyImplModule {

    @Binds
    fun bindThirdPartyInterface(thirdPartyInterfaceImpl: ThirdPartyInterfaceImpl): ThirdPartyInterface
}