package Q_04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q_04 {
    public static void main(String[] args) {
        LocalDate toDay = LocalDate.now();
        DateTimeFormatter format;
        format = DateTimeFormatter.ofPattern("dd MMM yyyy");

        System.out.println(toDay.format(format));
    }
}
