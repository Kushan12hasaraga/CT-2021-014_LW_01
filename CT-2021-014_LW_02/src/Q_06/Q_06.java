package Q_06;
import java.time.LocalDate;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentYear = LocalDate.now().getYear();

        System.out.print("Enter your Birth Year : ");
        int birthYear = scanner.nextInt();

        if (birthYear>currentYear){
            System.out.println("You entered invalid Birth Year!!!!! ");
        }else {
            int age = currentYear - birthYear;
            System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");
        }
        scanner.close();
    }
}
