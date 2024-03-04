package id.afdon.dagger2tutorial.model

import android.util.Log

class RunTimeDependency(val value: Int) {

    fun print() {
        Log.d("RunTimeDependency", "print: RunTimeDependency")
    }
}