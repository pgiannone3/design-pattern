package factory.simple;

public class Cat implements Animal {
    @Override
    public void makeASound() {
        System.out.println("Miao!");
    }
}
