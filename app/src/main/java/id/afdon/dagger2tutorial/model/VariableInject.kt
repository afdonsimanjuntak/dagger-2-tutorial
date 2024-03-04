package id.afdon.dagger2tutorial.model

import android.util.Log
import javax.inject.Inject

class VariableInject @Inject constructor() {

    fun print() {
        Log.d("VariableInject", "print: VariableInject")
    }
}