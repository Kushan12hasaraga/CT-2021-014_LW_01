package Q_01;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        a = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        b = scanner.nextInt();
        System.out.print("Enter Number 3: ");
        c = scanner.nextInt();

        if (a<b && a<c){
            System.out.println("The smallest Number is "+a);
        }else if (b<a && b<c){
            System.out.println("The smallest Number is "+b);
        }else{
            System.out.println("The smallest Number is "+c);
        }
    }
}
