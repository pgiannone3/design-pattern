package application;

import java.util.HashMap;
import java.util.Map;

public class ReadingApplication {
    private final User user;

    @Override
    public String toString() {
        return "ReadingApplication{" +
                "user=" + user +
                ", leftOff=" + leftOff +
                ", activeBook=" + activeBook +
                '}';
    }

    private final Map<Book, Page> leftOff;
    private Book activeBook;
    public ReadingApplication(User user) {
        this.user = user;
        this.activeBook = null;
        this.leftOff = new HashMap<>();
    }

    public User getUser() {
        return user;
    }

    public Book getActiveBook() {
        return activeBook;
    }

    public void setActiveBook(Book activeBook) {
        this.activeBook = activeBook;
    }

    public Map<Book, Page> getLeftOff() {
        return leftOff;
    }
}
