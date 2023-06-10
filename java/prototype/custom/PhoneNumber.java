package prototype.custom;

public class PhoneNumber implements Prototype{

    private long phone;
    private String operator;

    public PhoneNumber(PhoneNumber phoneNumber) {
        this.phone = phoneNumber.phone;
        this.operator = phoneNumber.operator;
    }

    public PhoneNumber(long phone, String operator) {
        this.phone = phone;
        this.operator = operator;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phone=" + phone +
                ", operator='" + operator + '\'' +
                '}';
    }

    @Override
    public PhoneNumber clone() {
        return new PhoneNumber(this);
    }
}
