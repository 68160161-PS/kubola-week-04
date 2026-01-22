import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab4_7 {
    static int n1, n2, ans;
    static char op;
    static int count = 1;
    static int score = 0;

    static JLabel lb1, lb2, lbop, lbResult, lbCount;
    static JTextField ansBox;

    public static void randomQuestion() {
        n1 = (int)(Math.random() * 10);
        n2 = (int)(Math.random() * 10);
        int r = (int)(Math.random() * 3);

        if (r == 0) {
            op = '+';
            ans = n1 + n2;
        } else if (r == 1) {
            op = '-';
            ans = n1 - n2;
        } else {
            op = '*';
            ans = n1 * n2;
        }

        lb1.setText("" + n1);
        lb2.setText("" + n2);
        lbop.setText(" " + op + " ");
        lbCount.setText("Question " + count + " / 10");
        ansBox.setText("");
    }

    public static void main(String[] args) {
        JFrame win = new JFrame("Easy Math Quiz");
        win.setBounds(100, 100, 500, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel subwin = new JPanel();
        subwin.setBackground(new Color(144, 238, 144));

        lb1 = new JLabel();
        lb1.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(lb1);

        lbop = new JLabel();
        lbop.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(lbop);

        lb2 = new JLabel();
        lb2.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(lb2);

        JLabel lb3 = new JLabel(" = ");
        lb3.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(lb3);

        ansBox = new JTextField(2);
        ansBox.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(ansBox);

        JButton b1 = new JButton("Check");
        b1.setFont(new Font("Serif", Font.PLAIN, 20));
        subwin.add(b1);

        lbResult = new JLabel();
        lbResult.setFont(new Font("Serif", Font.PLAIN, 40));
        subwin.add(lbResult);

        lbCount = new JLabel();
        lbCount.setFont(new Font("Serif", Font.PLAIN, 20));
        subwin.add(lbCount);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = ansBox.getText();
                int userAns = Integer.parseInt(str);
                if (ans == userAns) {
                    score++;
                    lbResult.setText("Excellent!");
                } else {
                    lbResult.setText("Try again!");
                }
                count++;
                if (count <= 10) {
                    randomQuestion();
                } else {
                    lbCount.setText("Score : " + score + " / 10");
                }
            }
        });

        win.add(subwin);
        win.setVisible(true);

        randomQuestion();
    }
}
