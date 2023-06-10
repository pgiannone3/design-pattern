package factory.simple;

public class Dog implements Animal {

    @Override
    public void makeASound() {
        System.out.println("Bau!");
    }
}
