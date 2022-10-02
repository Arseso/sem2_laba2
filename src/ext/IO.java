package ext;

import obj.Abon;
import obj.Book;

import java.util.Scanner;

public class IO extends DateWorker {

    protected static Abon inputAbon(){
        Abon abon = new Abon("", null);
        print("Введите имя читателя:");
        abon.setName(inputStr());

        print("Введите количество книг у абонента: ");
        int kol = inputInt();
        for(int i = 0; i<kol; i++) abon.addBook(inputBook());
        if(abon.getBooks().contains(null)) return null;
        return abon;
    }

    protected static void printIsBookRetOnTime(Book book){
        print("Книга возвращена вовремя: "+ isBookRetOnTime(book.getBookGot(),book.getBookRet()));
        if(!isBookRetOnTime(book.getBookGot(),book.getBookRet())){
            print("Сдача просрачена на "+ getDaysAfterRet(book.getBookGot(),book.getBookRet()) + " дней");
        }
    }



    public static Book inputBook(){
        String date;
        Book book = new Book("","","","");
        print("Введите название книги:");
        book.setBookName(inputStr());
        print("Введите автора книги:");
        book.setBookAuthor(inputStr());
        print("Введите дату взятия книги (в формате дд.мм.гггг):");
        if (!isDatePatternValid(date = inputStr())) return null;
        book.setBookGot(date);
        print("Введите дату возвращения книги (в формате дд.мм.гггг):");
        if (!isDatePatternValid(date = inputStr())) return null;
        book.setBookRet(date);
        return book;
    }

    private static int inputInt(){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()) return sc.nextInt();
        return 0;
    }

    private static String inputStr(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static void print(String msg){
        System.out.println(msg);
    }


}
