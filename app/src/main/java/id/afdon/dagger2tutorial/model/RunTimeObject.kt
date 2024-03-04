package id.afdon.dagger2tutorial.model

import android.util.Log

class RunTimeObject(private val runTimeDependency: RunTimeDependency) {

    fun print() {
        Log.d("RunTimeObject", "print: RunTimeObject, dependency value: ${runTimeDependency.value}")
    }
}