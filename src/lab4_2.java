import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class lab4_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Hello Program: Padsakornn Sukprasert 68160161 n36");
        f.setSize(500, 300);
        f.setLayout(new FlowLayout());

        JLabel label1 = new JLabel();
        label1.setText("Enter name: ");
        f.add(label1);

        JTextField nameBox = new JTextField(5);
        f.add(nameBox);

        JLabel label2 = new JLabel();
        f.add(label2);

        JButton b1 = new JButton();
        b1.setText("Send");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameBox.getText();
                label2.setText("Hello " + name);
                // JOptionPane.showMessageDialog(null, "Hello " + name);
            }
        });
        f.add(b1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
