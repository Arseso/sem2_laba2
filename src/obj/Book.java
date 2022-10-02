package obj;

public class Book {
    private String bookAuthor;
    private String bookName;
    private String bookGot;
    private String bookRet;

    public Book(String bookAuthor, String bookName, String bookGot, String bookRet) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookGot = bookGot;
        this.bookRet = bookRet;
    }


    public String getBookAuthor() {
        return bookAuthor;
    }


    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookGot() {
        return bookGot;
    }

    public void setBookGot(String bookGot) {
        this.bookGot = bookGot;
    }

    public String getBookRet() {
        return bookRet;
    }

    public void setBookRet(String bookRet) {
        this.bookRet = bookRet;
    }
}
