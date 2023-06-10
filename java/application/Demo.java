package application;

/***
 *
 * Online cloud reading application, similar to Amazon Kindle:
 **** Users have a library of books that they can add or remove from
 **** Users can set a Book from their library as active
 **** The reading application remembers where a user left off in a given book
 **** The reading application only displays a page of text at a time in the active book
 *
 */

public class Demo {
    public static void main(String[] args) {

        var user = new User("Paolo", "Giannone");
        var aBook = new Book("Harry Potter", "J.K.Rowling", "123");
        var anotherBook = new Book("The Lord of The Rings", "Tolkien", "456");
        var readingApplication = new ReadingApplication(user);

        var bookService = new BookServiceImpl(readingApplication);
        bookService.addBook(aBook);
        bookService.addBook(anotherBook);

        bookService.activateBook(aBook);

        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();

        bookService.activateBook(anotherBook);

        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();
        bookService.turnPage();

        System.out.println(user+ "\n");
        System.out.println(readingApplication);

    }

}
