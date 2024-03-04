package id.afdon.dagger2tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.afdon.dagger2tutorial.dagger.component.DaggerActivityComponent
import id.afdon.dagger2tutorial.dagger.component.DaggerFooBarComponent
import id.afdon.dagger2tutorial.dagger.component.DaggerNamedObjectComponent
import id.afdon.dagger2tutorial.dagger.component.DaggerRunTimeComponent
import id.afdon.dagger2tutorial.dagger.component.DaggerThirdPartyComponent
import id.afdon.dagger2tutorial.dagger.component.DaggerVariableInjectionComponent
import id.afdon.dagger2tutorial.model.NamedObjectDependency
import id.afdon.dagger2tutorial.model.RunTimeDependency
import id.afdon.dagger2tutorial.model.VariableInject
import id.afdon.dagger2tutorial.ui.theme.Dagger2TutorialTheme

class MainActivity : ComponentActivity() {

    private lateinit var variableInject: VariableInject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fooBarComponent = DaggerFooBarComponent.create()
        val foo = fooBarComponent.getFoo()
        val bar = fooBarComponent.getBar()
        foo.print()
        bar.print()

        val variableInjectComponent = DaggerVariableInjectionComponent.create()
        variableInjectComponent.inject(this)
        variableInject.print()

        val thirdPartyComponent = DaggerThirdPartyComponent.create()
        val thirdPartyClass = thirdPartyComponent.getThirdPartyClass()
        val thirdPartyInterface = thirdPartyComponent.getThirdPartyInterface()
        thirdPartyClass.print()
        thirdPartyInterface.print()

        val applicationComponent = (application as MyApplication).applicationComponent()
        val applicationScopedObject1 = applicationComponent.getApplicationScopedObject()
        val applicationScopedObject2 = applicationComponent.getApplicationScopedObject()
        applicationScopedObject1.print()
        applicationScopedObject2.print()

        val activityComponent = DaggerActivityComponent.create()
        val activityScopedObject1 = activityComponent.getActivityScopedObject()
        val activityScopedObject2 = activityComponent.getActivityScopedObject()
        activityScopedObject1.print()
        activityScopedObject2.print()

        val runTimeComponent = DaggerRunTimeComponent.builder()
            .setRunTimeDependency(RunTimeDependency(1000))
            .build()
        val runTimeObject = runTimeComponent.getRunTimeObject()
        runTimeObject.print()

        var namedObjectComponent = DaggerNamedObjectComponent.builder()
            .setNamedObjectDependency1(NamedObjectDependency(100))
            .setNamedObjectDependency2(NamedObjectDependency(200))
            .build()
        val namedObject = namedObjectComponent.namedObject()
        namedObject.print()

        namedObjectComponent = DaggerNamedObjectComponent.builder()
            .setNamedObjectDependency1(NamedObjectDependency(111))
            .setNamedObjectDependency2(NamedObjectDependency(222))
            .build()
        val namedObject2 = namedObjectComponent.namedObject2()
        namedObject2.print()

        setContent {
            Dagger2TutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Dagger2TutorialTheme {
        Greeting("Android")
    }
}