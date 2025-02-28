package Q_07;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q_07 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();

        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss a.");

        JFrame newWindow =  new JFrame();
        newWindow.setVisible(true);
        newWindow.setSize(300,300);
        newWindow.setTitle(formatTime.format(time));
        newWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
