import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab4_6 {
    public static void main(String[] args) {
        int n1 = (int)(Math.random() * 10);
        System.out.println(n1);
        int n2 = (int)(Math.random() * 10);
        System.out.println(n2);

        int opRand = (int)(Math.random() * 3);
        char op = '+';
        int ans = 0;

        if (opRand == 0) {
            op = '+';
            ans = n1 + n2;
        } else if (opRand == 1) {
            op = '-';
            ans = n1 - n2;
        } else {
            op = '*';
            ans = n1 * n2;
        }

        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 500, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel subwin = new JPanel();
        subwin.setBackground(new Color(102, 224, 255));

        JLabel label1 = new JLabel("" + n1);
        label1.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label1);

        JLabel labelop = new JLabel(" " + op + " ");
        labelop.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(labelop);

        JLabel label2 = new JLabel("" + n2);
        label2.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label2);

        JLabel label3 = new JLabel(" = ");
        label3.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(label3);

        JTextField ansBox = new JTextField(2);
        ansBox.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(ansBox);

        JButton b1 = new JButton("Check");
        b1.setFont(new Font("Serif", Font.PLAIN, 20));
        subwin.add(b1);

        JLabel labelResult = new JLabel();
        labelResult.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(labelResult);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = ansBox.getText();
                int userAns = Integer.parseInt(str);
                int ans = Integer.parseInt(str);
                if (ans == userAns) {
                    labelResult.setText("Excellent!");
                } else {
                    labelResult.setText("Try again!");
                }
            }
        });

        win.add(subwin);
        win.setVisible(true);
    }
}
