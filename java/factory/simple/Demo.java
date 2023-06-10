package factory.simple;

public class Demo {

    public static void main(String[] args) {

       Factory.createAnimal("cat").makeASound();
       Factory.createAnimal("dog").makeASound();
    }
}
