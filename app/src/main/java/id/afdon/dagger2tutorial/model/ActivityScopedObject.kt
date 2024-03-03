package id.afdon.dagger2tutorial.model

import android.util.Log

class ActivityScopedObject {

    fun print() {
        Log.d("ActivityScopedObject", "print: ActivityScopedObject " + hashCode())
    }
}