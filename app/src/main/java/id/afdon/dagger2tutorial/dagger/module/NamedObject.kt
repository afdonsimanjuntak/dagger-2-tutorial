package id.afdon.dagger2tutorial.dagger.module

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class NamedObject @Inject constructor(
    @Named("named_object_dependency_1") private val namedObjectDependency1: NamedObjectDependency,
    @Named("named_object_dependency_2") private val namedObjectDependency2: NamedObjectDependency
) {

    fun print() {
        Log.d(
            "NamedObject", "print: NamedObject, " +
                    "value1: ${namedObjectDependency1.value}, " +
                    "value2: ${namedObjectDependency2.value}"
        )
    }
}