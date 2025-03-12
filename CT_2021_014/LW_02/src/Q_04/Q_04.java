package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Weight in pound : ");
        double weight = scanner.nextDouble();

        double calories = weight*19;

        System.out.print("Your daily wanted calories: "+calories);
    }
}
