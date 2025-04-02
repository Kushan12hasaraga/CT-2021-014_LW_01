package Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter temperature in celsius:");
        double celsiusInput = scanner.nextDouble();

        Temperature temp = new Temperature(celsiusInput);

        System.out.print("Temperature in Fahrenheit: "+ temp.toFahrenheit());

        scanner.close();
    }
}
