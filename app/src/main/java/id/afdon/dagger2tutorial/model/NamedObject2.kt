package id.afdon.dagger2tutorial.model

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class NamedObject2 @Inject constructor(
    @Named("named_object_dependency_1") private val namedObjectDependency1: NamedObjectDependency,
    @Named("named_object_dependency_2") private val namedObjectDependency2: NamedObjectDependency
) {

    fun print() {
        Log.d(
            "NamedObject2", "print: NamedObject2, " +
                    "dependency 1 value: ${namedObjectDependency1.value}, " +
                    "dependency 2 value: ${namedObjectDependency2.value}"
        )
    }
}