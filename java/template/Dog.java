package template;

public class Dog extends Animal {

    @Override
    public void makeASound() {
        System.out.println("Bau!");
    }

    @Override
    public void colorTail() {
        System.out.println("Yellow");
    }
}
