package factory.method;

public class Dog implements Animal {

    @Override
    public void makeASound() {
        System.out.println("Bau!");
    }
}
