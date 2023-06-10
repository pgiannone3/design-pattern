package factory.method;

public class Demo {

    public static void main(String[] args) {
        Factory dogFactory = new DogFactory();
        Factory catFactory = new CatFactory();

        dogFactory.doSomething();
        catFactory.doSomething();
    }
}
