package Q_02;

import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Temperature temp = new Temperature();

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        temp.setFahrenheit(fahrenheit);

        System.out.printf("Equivalent temperature in Celsius: %.2f\n", temp.getCelsius());

        scanner.close();
    }
}
