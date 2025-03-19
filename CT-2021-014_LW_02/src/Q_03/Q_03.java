package Q_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius : ");
        double input = scanner.nextFloat();

        double Fahrenheit ;
        double output = ((1.8 * input) + 32);

        System.out.println("Temperature in Fahrenheit: "+output);
    }
}
