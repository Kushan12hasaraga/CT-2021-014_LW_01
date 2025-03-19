package Q_05;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        double input = scanner.nextFloat();

        double output = (((double) 5 /9)*(input-32));

        System.out.println("Temperature in Celsius : "+output);
    }
}
