package Q_08;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sentence including !: ");
        String sentence = scanner.nextLine();

        String[] newArray = sentence.split("!");
        for (String s:newArray) {
            System.out.println(s);
        }
    }
}
