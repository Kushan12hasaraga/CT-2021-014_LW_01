package Q_02;

import java.util.Scanner;

public class DigiCount {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int count = 0;
        int num = 0;
        while (num >= 0){
            System.out.print("Enter Number (Negative to stop): ");
            num = scanner.nextInt();
            count = String.valueOf(Math.abs(num)).length();
            System.out.println("Digits: "+count);
        }
    }
}
