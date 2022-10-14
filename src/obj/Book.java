package obj;

public class Book {
    private String bookAuthor;
    private String bookName;
    private String bookNeedRet;
    private String bookRet;

    public Book(String bookAuthor, String bookName, String bookNeedRet, String bookRet) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
        this.bookNeedRet = bookNeedRet;
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

    public String getBookNeedRet() {
        return bookNeedRet;
    }

    public void setBookNeedRet(String bookGot) {
        this.bookNeedRet = bookGot;
    }

    public String getBookRet() {
        return bookRet;
    }

    public void setBookRet(String bookRet) {
        this.bookRet = bookRet;
    }
}
