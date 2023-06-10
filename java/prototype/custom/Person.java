package prototype.custom;

public class Person implements Prototype {

    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;

    public Person(Person person) {
        this.firstName = person.firstName;
        this.lastName = person.lastName;
        this.phoneNumber = person.phoneNumber;
    }

    public Person(String firstName, String lastName, PhoneNumber phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public Person clone() {
        var cloned = new Person(this);
        var clonedPhoneNumber = cloned.getPhoneNumber().clone();
        cloned.setPhoneNumber(clonedPhoneNumber);
        return cloned;
    }
}
