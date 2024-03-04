package id.afdon.dagger2tutorial.model

import android.util.Log

class RunTimeObject constructor(runTimeDependency: RunTimeDependency) {

    fun print() {
        Log.d("RunTimeObject", "print: RunTimeObject")
    }
}