package ext;

import obj.Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

import static java.time.temporal.ChronoUnit.DAYS;

public class DateWorker {

    protected static long getDaysAfterRet(String sDateGot, String sDateRet) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dateGot = LocalDate.parse(sDateGot,dtf);
        LocalDate dateRet = LocalDate.parse(sDateRet,dtf);

        return DAYS.between(dateGot,dateRet);
    }

    static int[] getDateFromString(String dateString){
        int[] arr = Arrays.stream(dateString.split("\\.")).mapToInt(Integer::parseInt).toArray();
        return arr;
    }
}
