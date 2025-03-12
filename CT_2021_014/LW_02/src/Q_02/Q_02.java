package Q_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Distsnce ic Centimeter: ");
        double input = scanner.nextFloat();

        double cmToInch = 2.54;

        System.out.println("Distance in Inches: "+input*cmToInch);
    }
}
