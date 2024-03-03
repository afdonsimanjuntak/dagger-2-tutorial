# Dagger 2 Tutorial

Provider
```Java
public interface Provider<T> {
    T get();
}
```

Example
```Java
final class Foo {
    @Inject Foo() {};
}

final class Bar {
    @Inject Bar(Foo foo) {};
}

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
