package Q_04;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of Rows: ");
        int row = scanner.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= row-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <=(2*i-1); k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
