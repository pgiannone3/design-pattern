package prototype.out.of.the.box.with.cloneable;

public class Person implements Cloneable {

    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;

    public Person(String firstName, String lastName, PhoneNumber phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        var cloned = (Person) super.clone();
        var clonedPhoneNumber = (PhoneNumber) cloned.getPhoneNumber().clone();
        cloned.setPhoneNumber(clonedPhoneNumber);
        return cloned;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", hashcode=" + this.hashCode() + '\'' +
                '}';
    }
}
