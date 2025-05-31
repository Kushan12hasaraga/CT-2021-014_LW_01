package Q_05;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ToggleFrame extends JFrame {
    private JButton toggleButton;
    private boolean isOn = false;

    public ToggleFrame() {
        this.setTitle("Toggle Frame");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(3);
        this.getContentPane().setBackground(Color.GREEN);
        this.setLayout(new FlowLayout());
        this.toggleButton = new JButton("OFF");
        this.toggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ToggleFrame.this.toggleState();
            }
        });
        this.add(this.toggleButton);
    }

    private void toggleState() {
        if (this.isOn) {
            this.getContentPane().setBackground(Color.GREEN);
            this.toggleButton.setText("OFF");
        } else {
            this.getContentPane().setBackground(Color.RED);
            this.toggleButton.setText("ON");
        }

        this.isOn = !this.isOn;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ToggleFrame frame = new ToggleFrame();
            frame.setVisible(true);
        });
    }
}
