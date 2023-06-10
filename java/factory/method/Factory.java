package factory.method;

public abstract class Factory {

    public void doSomething() {
        Animal animal = create();
        animal.makeASound();
    }

     abstract Animal create();

}
