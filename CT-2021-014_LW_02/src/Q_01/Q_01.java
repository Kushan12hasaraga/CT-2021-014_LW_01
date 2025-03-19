package Q_01;
import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter A: ");
        double A = scanner.nextFloat();
        System.out.print("Enter B: ");
        double B = scanner.nextFloat();
        System.out.print("Enter C: ");
        double C = scanner.nextFloat();
        System.out.print("Enter X: ");
        double X = scanner.nextFloat();
        System.out.print("Enter Y: ");
        double Y = scanner.nextFloat();
        System.out.print("Enter r: ");
        double r = scanner.nextFloat();

        if (A!=C){// Answer for part a
            double resultA = Math.sqrt(Math.pow(B, 2) + 4 * A * C);
            System.out.println("The square root of B^2 + 4AC is: " + resultA);

            // b. Answer for part b
            double resultB = Math.sqrt(X + 4 * Math.pow(Y, 3));
            System.out.println("The square root of X + 4Y^3 is: " + resultB);

            // c. Answer for part c
            double resultC = Math.cbrt(X * Y);
            System.out.println("The cube root of the product of X and Y is: " + resultC);

            // d. Answer for part d
            double resultD = Math.PI * Math.pow(r, 2);
            System.out.println("The area of the circle with radius r is: " + resultD);
        }else {
            System.out.println("Your A & C are same!!!!!!");
        }
    }
}
