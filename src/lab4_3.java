import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab4_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Hello Padsakornn Sukprasert 68160161 n36");
        f.setSize(500, 300);
        f.setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setBackground(Color.PINK);

        JPanel p2 = new JPanel();
        p2.setBackground(Color.LIGHT_GRAY);

        JLabel label1 = new JLabel();
        label1.setText("Enter name : ");
        p1.add(label1);

        JTextField nameBox = new JTextField(5);
        p1.add(nameBox);

        JLabel label2 = new JLabel();
        p2.add(label2);

        JButton b1 = new JButton();
        b1.setText("Send");
        p1.add(b1);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = nameBox.getText();
                label2.setText("Hello " + str);
                JOptionPane.showMessageDialog(null, "Hello " + str);
            }
        });

        f.add(p1, BorderLayout.CENTER);
        f.add(p2, BorderLayout.SOUTH);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
