package application;

public class Page {

    private final int number;

    public Page(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Page{" +
                "number=" + number +
                '}';
    }
}
