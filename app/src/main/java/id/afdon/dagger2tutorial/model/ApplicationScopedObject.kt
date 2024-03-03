package id.afdon.dagger2tutorial.model

import android.util.Log

class ApplicationScopedObject {

    fun print() {
        Log.d("ApplicationScopedObject", "print: ApplicationScopedObject " + hashCode())
    }
}