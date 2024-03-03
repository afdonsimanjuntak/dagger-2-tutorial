package id.afdon.dagger2tutorial.model

import android.util.Log
import javax.inject.Inject

class Bar @Inject constructor(foo: Foo) {

    fun print() {
        Log.d("Bar", "print: Bar")
    }
}