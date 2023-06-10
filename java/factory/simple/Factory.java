package factory.simple;

public class Factory {
    public static Animal createAnimal(String type) {

        Animal animal = null;
        if("cat".equals(type)) {
            animal =  new Cat();
        } else if("dog".equals(type)) {
            animal = new Dog();
        }
        return animal;
    }
}
