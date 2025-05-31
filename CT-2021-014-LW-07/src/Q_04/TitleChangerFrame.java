package Q_04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TitleChangerFrame extends JFrame {
    private JTextField textField;
    private JButton button;

    public TitleChangerFrame() {
        this.setTitle("Title Changer");
        this.setSize(400, 150);
        this.setDefaultCloseOperation(3);
        this.setLayout(new FlowLayout());
        this.textField = new JTextField(20);
        this.button = new JButton("Set Title");
        this.button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TitleChangerFrame.this.setTitle(TitleChangerFrame.this.textField.getText());
            }
        });
        this.add(this.textField);
        this.add(this.button);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TitleChangerFrame frame = new TitleChangerFrame();
            frame.setVisible(true);
        });
    }
}
