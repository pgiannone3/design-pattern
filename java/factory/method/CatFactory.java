package factory.method;

public class CatFactory extends Factory {
    @Override
    public Animal create() {
        return new Cat();
    }
}
