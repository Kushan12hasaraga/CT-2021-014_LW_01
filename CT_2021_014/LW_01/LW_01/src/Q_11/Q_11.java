package Q_11;
import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name in format of (first middle last): ");
        String name = scanner.nextLine();

        String [] partOfName = name.split(" ");

        if (partOfName.length != 3){
            System.out.println("Invalid Input: ");
        }else {
            String firstName = partOfName[0];
            String middleName = partOfName[1];
            String lastName = partOfName[2];

            System.out.println(lastName+", "+firstName+" "+middleName.charAt(0)+".");
        }
    }
}
