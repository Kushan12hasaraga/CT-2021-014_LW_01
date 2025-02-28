package Q_03;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scanner.next();
        System.out.print("Enter Midlle Name: ");
        String middlerName = scanner.next();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();

        System.out.println(firstName+" "+middlerName.charAt(0)+". "+lastName);
    }
}
