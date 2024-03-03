package id.afdon.dagger2tutorial.model

import android.util.Log
import javax.inject.Inject

class ThirdPartyInterfaceImpl @Inject constructor() : ThirdPartyInterface{

    override fun print() {
        Log.d("ThirdPartyInterfaceImpl", "print: ThirdPartyInterfaceImpl")
    }
}