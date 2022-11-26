package bridge.Animal;

public class Animal {
    private AnimalImpl impl;

    public Animal(AnimalImpl impl) {
        this.impl = impl;
    }

    public String bark() {
        return impl.bark();
    }

    public String sit() {
        return impl.sit();
    }

    public String run() {
        return impl.run();
    }
}
