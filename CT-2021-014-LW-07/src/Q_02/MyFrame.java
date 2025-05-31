package Q_02;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MyFrame extends JFrame {
    public MyFrame() {
        this.setTitle("MyFrame Example");
        this.setSize(400, 450);
        this.setDefaultCloseOperation(3);
        this.getContentPane().setBackground(Color.BLUE);
        this.setLayout((LayoutManager)null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyFrame frame = new MyFrame();
            frame.setVisible(true);
        });
    }
}
