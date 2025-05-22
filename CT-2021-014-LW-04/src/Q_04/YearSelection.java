package Q_04;

import java.util.Scanner;

public class YearSelection {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year;

        System.out.print("Enter Year: ");
        year= scanner.nextInt();

        if ( (year % 4==0 && year % 100 != 0 ) || (year % 400 == 0)){
            System.out.println("Leap Year.");
        }else {
            System.out.println("Not a leap Year.");
        }
    }




}
