package Q_06;
import javax.swing.*;
import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Width: ");
        int W = scanner.nextInt();
        System.out.print("Enter High: ");
        int H = scanner.nextInt();
        System.out.print("Enter Title: ");
        String title = scanner.next();

        JFrame newFrame = new JFrame();
        newFrame.setSize(W,H);
        newFrame.setTitle(title);
        newFrame.setVisible(true);
        newFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
