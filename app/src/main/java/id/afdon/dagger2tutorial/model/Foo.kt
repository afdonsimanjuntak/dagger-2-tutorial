package id.afdon.dagger2tutorial.model

import android.util.Log
import javax.inject.Inject

class Foo @Inject constructor() {

    fun print() {
        Log.d("Foo", "print: Foo")
    }
}