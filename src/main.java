import ext.IO;
import obj.Abon;
import obj.Book;

public class main extends IO {
    public static void main(String[] args) {
        Abon abon;
        if((abon = inputAbon())==null) return;

        printIsBookRetOnTime(abon.getBooks().get(0));
    }
}
