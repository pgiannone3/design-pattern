package application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BookServiceImplTest {

    @Test
    void addBook() {
        var user = new User("Paolo", "Giannone");
        var aBook = new Book("Harry Potter", "J.K.Rowling", "123");
        var anotherBook = new Book("Harry Potter", "The Lord of The Rings", "456");
        var readingApplication = new ReadingApplication(user);


        var bookService = new BookServiceImpl(readingApplication);

        bookService.addBook(aBook);
        bookService.addBook(anotherBook);

        Assertions.assertFalse(user.getBooks().isEmpty());
        Assertions.assertEquals(2, user.getBooks().size());
    }

    @Test
    void removeBook() {
        var user = new User("Paolo", "Giannone");
        var aBook = new Book("Harry Potter", "J.K.Rowling", "123");
        var anotherBook = new Book("Harry Potter", "The Lord of The Rings", "456");
        var readingApplication = new ReadingApplication(user);

        var bookService = new BookServiceImpl(readingApplication);

        bookService.addBook(aBook);
        bookService.addBook(anotherBook);
        bookService.removeBook(anotherBook);

        Assertions.assertFalse(user.getBooks().isEmpty());
        Assertions.assertEquals(1, user.getBooks().size());
    }
}