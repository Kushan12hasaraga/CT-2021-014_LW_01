package Q_03;

import java.util.Scanner;

public class NumSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pow;
        System.out.print("Enter power of 10: (ex: 6, 9, 12, 15,18,21,30,100)  : ");
        pow = scanner.nextInt();

        if (pow == 6){
            System.out.println("Power of 10^"+pow+" is a Million");
        }else if (pow == 9){
            System.out.println("Power of 10^"+pow+" is a Billion");
        } else if (pow == 12) {
            System.out.println("Power of 10^"+pow+" is a Trillion");
        } else if (pow == 15) {
            System.out.println("Power of 10^"+pow+" is a Quadrillion");
        } else if (pow == 18) {
            System.out.println("Power of 10^"+pow+" is a Quintillion");
        } else if (pow == 21) {
            System.out.println("Power of 10^"+pow+" is a Sextillion");
        } else if (pow == 30) {
            System.out.println("Power of 10^"+pow+" is a Nonillion");
        } else if (pow == 100) {
            System.out.println("Power of 10^"+pow+" is a Googol");
        } else
            System.out.println("Invalid selection!!!!!");
    }
}
