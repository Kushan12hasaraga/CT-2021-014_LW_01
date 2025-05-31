package Q_01;

import javax.swing.*;
import java.awt.*;

public class SumThreeIntegers {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Enter the first integer:");
        String input2 = JOptionPane.showInputDialog("Enter the second integer:");
        String input3 = JOptionPane.showInputDialog("Enter the third integer:");
        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        int num3 = Integer.parseInt(input3);
        int sum = num1 + num2 + num3;
        JOptionPane.showMessageDialog((Component)null, "The sum is: " + sum);
    }
}

