package obj;

import ext.IO;

import java.util.ArrayList;

public class Abonement extends IO {
    private String name;
    private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Abonement(String name, ArrayList<Book> books) {
        this.name = name;
        this.books = books;
    }



    public void addBook(Book book){
        books.add(book);
    }

    public String getBookNeedRet(int bookIndex) {
        return books.get(bookIndex).getBookNeedRet();
    }

    public Abonement(String name) {
        this.name = name;
    }

    public String getBookRet(int bookIndex) {
        return books.get(bookIndex).getBookRet();
    }

    public String getBookAuthor(int bookIndex) {
        return books.get(bookIndex).getBookAuthor();
    }

    public String getBookName(int bookIndex) {
        return books.get(bookIndex).getBookName();
    }

    public String getName() {
        return name;
    }

    public void setBookAuthor(String bookAuthor, int bookIndex) {
        books.get(bookIndex).setBookAuthor(bookAuthor);
        books.set(bookIndex, books.get(bookIndex));
    }

    public void setBookNeedRet(String bookNeedRet, int bookIndex) {
        books.get(bookIndex).setBookNeedRet(bookNeedRet);
        books.set(bookIndex, books.get(bookIndex));
    }

    public void setBookName(String bookName, int bookIndex) {
        books.get(bookIndex).setBookNeedRet(bookName);
        books.set(bookIndex, books.get(bookIndex));
    }

    public void setBookRet(String bookRet, int bookIndex) {
        books.get(bookIndex).setBookNeedRet(bookRet);
        books.set(bookIndex, books.get(bookIndex));
    }

    public void setName(String name) {
        this.name = name;
    }
}
