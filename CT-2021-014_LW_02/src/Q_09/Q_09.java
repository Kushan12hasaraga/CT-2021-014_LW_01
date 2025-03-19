package Q_09;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your investment in Dollars: ");
        float P = scanner.nextFloat();
        System.out.print("Enter your investment percentage: ");
        float R = scanner.nextFloat();
        System.out.print("Enter your investment Period in Years: ");
        int N = scanner.nextInt();

        double grow = P*Math.pow((1+(R/100)),N);
        System.out.println("You earned "+grow+ " dollars in "+N+" Years.");
    }
}
