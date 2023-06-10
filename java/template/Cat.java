package template;

public class Cat extends Animal {
    @Override
    public void makeASound() {
        System.out.println("Miao!");
    }

    @Override
    public void colorTail() {
        System.out.println("White");
    }
}
