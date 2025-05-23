package Q_03;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Number for multiplication: ");
        int num = scanner.nextInt();

        for (int i =1;i>=1 && i<=10;i++){
            int ans;
            ans = num*i;
            System.out.println(num+" * "+i+" = "+ans);
        }
    }
}
