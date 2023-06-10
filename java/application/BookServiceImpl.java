package application;

import java.security.InvalidParameterException;
import java.util.Set;

public class BookServiceImpl implements BookService {
    private final ReadingApplication readingApplication;

    public BookServiceImpl(ReadingApplication readingApplication) {
        this.readingApplication = readingApplication;
    }

    @Override
    public void addBook(Book book) {
        User user = readingApplication.getUser();
        Set<Book> userBooks = user.getBooks();
        userBooks.add(book);
    }

    @Override
    public void removeBook(Book book) {
        User user = readingApplication.getUser();
        Set<Book> userBooks = user.getBooks();
        userBooks.remove(book);
    }

    @Override
    public void activateBook(Book book) {
        User user = readingApplication.getUser();
        if(user.getBooks().contains(book)) {
            readingApplication.setActiveBook(book);
            readingApplication.getLeftOff().put(book, new Page(1));
        } else {
            throw new InvalidParameterException("This book is not in your library!");
        }
    }

    @Override
    public void turnPage() {
        if(readingApplication.getActiveBook() == null) {
            throw new InvalidParameterException("You don't have any active books");
        }
        readingApplication.getLeftOff().put(readingApplication.getActiveBook(), new Page(readingApplication.getLeftOff().get(readingApplication.getActiveBook()).getNumber() + 1));
    }
}
