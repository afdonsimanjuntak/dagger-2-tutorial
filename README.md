# Dagger 2 Tutorial

Dagger Provider
```Java
public interface Provider<T> {
    T get();
}
```

Add @Inject annotation to constructor
```Java
final class Foo {
    @Inject Foo() {};
}

final class Bar {
    @Inject Bar(Foo foo) {};
}
```

Dagger will generate factories for those annotated classes
```Java
@Generated
public final class Foo_Factory implements Provider<Foo> {

    @Override Foo get() {
        return new Foo();
    }
}

@Generated
public final class Bar_Factory implements Provider<Bar> {

    private final Provider<Foo> fooProvider;

    public Bar_Factory(Provider<Foo> fooProvider) {
        this.fooProvider = fooProvider
    }

    @Override Bar get() {
        return new Bar(fooProvider.get());
    }
}
```

To get dependencies, create component interface. Dagger will generate the implementation of the component.
```Java
@Component
interface MyComponent {

    Bar bar();
}

@Generated
final class DaggerMyComponent implements MyComponent {

    private Provider<Foo> fooProvider;
    private Provider<Bar> barProvider;

    DaggerMyComponent() {
        this.fooProvider = new Foo_Factory();
        this.barProvider = new Bar_Factory();
    }

    @Override public Bar bar() {
        return barProvider.get();
    }
}
```
