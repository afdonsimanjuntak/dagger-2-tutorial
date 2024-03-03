package id.afdon.dagger2tutorial.dagger.module

import dagger.Module
import dagger.Provides
import id.afdon.dagger2tutorial.model.ThirdPartyClass

@Module
object ThirdPartyModule {

    @Provides
    @JvmStatic
    fun provideThirdPartyClass() : ThirdPartyClass {
        return ThirdPartyClass()
    }
}