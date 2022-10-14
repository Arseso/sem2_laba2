package ext;

import obj.Abonement;
import obj.Book;

import java.util.Scanner;

public class IO {

    public static Abonement inputAbon(){
        Abonement abonement = new Abonement("", null);
        print("Введите имя читателя:");
        abonement.setName(inputStr());

        print("Введите количество книг у абонента: ");
        int kol = inputInt();
        for(int i = 0; i<kol; i++) abonement.addBook(inputBook());
        if(abonement.getBooks().contains(null)) return null;
        return abonement;
    }

    public static void printIsBookRetOnTime(Book book){
        print("Книга возвращена вовремя: "+ Checker.isBookRetOnTime(book.getBookNeedRet(),book.getBookRet()));
        if(!Checker.isBookRetOnTime(book.getBookNeedRet(),book.getBookRet())){
            print("Сдача просрачена на "+ DateWorker.getDaysAfterRet(book.getBookNeedRet(),book.getBookRet()) + " дней");
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
        if (!Checker.isDatePatternValid(date = inputStr())) return null;
        book.setBookNeedRet(date);
        print("Введите дату возвращения книги (в формате дд.мм.гггг):");
        if (!Checker.isDatePatternValid(date = inputStr())) return null;
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
