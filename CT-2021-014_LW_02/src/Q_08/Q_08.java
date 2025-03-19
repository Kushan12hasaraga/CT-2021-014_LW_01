package Q_08;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Q_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of your Sphere: ");
        float r = scanner.nextFloat();

        double V = (4.0/3)*(PI*Math.pow(r,3));

        System.out.println("Volume of your sphere: "+V);
    }
}
