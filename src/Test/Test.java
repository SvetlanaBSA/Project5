package Test;

import java.security.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.security.cert.CertPath;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        //Date date;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dateInString = "05/05/2000"; //studentsArray[i][3];
        try {
            //date = formatter.parse(dateInString);
            //System.out.println(date);
            //System.out.println(formatter.format(date));
            long l = new SimpleDateFormat("dd/MM/yyyy").parse(dateInString).getTime();
            System.out.println(l);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
