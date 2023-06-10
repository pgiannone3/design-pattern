package prototype.out.of.the.box.with.cloneable;

public class PhoneNumber implements Cloneable {

    private long phone;
    private String operator;

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
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phone=" + phone +
                ", operator='" + operator + '\'' +
                '}';
    }
}
