package Q_07;

import java.util.Scanner;
public class Q_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mass in kilograms: ");
        float w = scanner.nextFloat();
        System.out.print("Enter your height in centimeters: ");
        float h = scanner.nextFloat();

        double BMI = w/Math.pow(h/100.0,2);

        if (BMI < 20){
            System.out.println("Your BMI category: UnderWeight.");
            System.out.print("BMI value: "+BMI);
        }else if (BMI >= 20 && BMI <=25){
            System.out.println("Your BMI category: Normal.");
            System.out.print("BMI value: "+BMI);
        }else{
            System.out.println("your BMI category: OverWeight");
            System.out.print("BMI value: "+BMI);
        }
    }
}
