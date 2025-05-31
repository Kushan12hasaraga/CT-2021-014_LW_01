package Q_03;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ClickFrame extends JFrame {
    public ClickFrame() {
        this.setTitle("Click Button Example");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(3);
        this.setLayout(new FlowLayout());
        JButton button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog((Component)null, "You clicked!");
            }
        });
        this.add(button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClickFrame frame = new ClickFrame();
            frame.setVisible(true);
        });
    }
}
