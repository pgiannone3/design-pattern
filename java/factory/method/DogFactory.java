package factory.method;

public class DogFactory extends Factory {
    @Override
    public Animal create() {
        return new Dog();
    }
}
