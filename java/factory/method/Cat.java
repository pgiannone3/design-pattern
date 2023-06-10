package factory.method;

public class Cat implements Animal {
    @Override
    public void makeASound() {
        System.out.println("Miao!");
    }
}
