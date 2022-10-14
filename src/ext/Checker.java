package ext;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Checker {
    protected static boolean isBookRetOnTime(String sDateNeedRet, String sDateRet){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dateNeedRet = LocalDate.parse(sDateNeedRet,dtf);
        LocalDate dateRet = LocalDate.parse(sDateRet,dtf);

        if(dateNeedRet.isAfter(dateRet) || sDateNeedRet.equals(sDateRet)) return true;
        return false;
    }

    public static boolean isDatePatternValid(String dateString){
        int[] dateInt = DateWorker.getDateFromString(dateString);
        if(dateInt[0]==0 || dateInt[1]==0 || dateInt[2]==0){
            System.out.println("Date Pattern is Invalid!");
            return false;
        }
        return true;
    }
}
