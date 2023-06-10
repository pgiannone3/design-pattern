package prototype.custom;


public class PrototypeDemo {

    public static void main(String[] args) {

        var aPerson = new Person("Paolo", "Giannone", new PhoneNumber(3294121360L, "Iliad"));
        System.out.println(aPerson);

        var anotherPerson = aPerson.clone();
        System.out.println(anotherPerson);

        anotherPerson.getPhoneNumber().setOperator("Hackeeed!");

        System.out.println(aPerson);
        System.out.println(anotherPerson);

    }

}
