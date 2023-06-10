package application;

public interface BookService {

    void addBook(Book book);
    void removeBook(Book book);
    void activateBook(Book book);
    void turnPage();

}
