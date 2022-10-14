import ext.IO;
import obj.Abonement;

public class main {
    public static void main(String[] args) {
        Abonement abon;
        if((abon = IO.inputAbon())==null) return;

        IO.printIsBookRetOnTime(abon.getBooks().get(0));
    }
}
