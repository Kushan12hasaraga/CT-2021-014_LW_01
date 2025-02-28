package Q_10;
import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String sentence = scanner.next();

        int lengthString = sentence.length();

        if (lengthString%2 == 0){
            System.out.println("You have entered the even number sentence!!!!");
        }else {
            System.out.println(sentence.charAt((sentence.length())/2));
        }
    }
}
