import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab4_4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Grading Program: Padsakorn Sukprasert n36");
        f.setSize(500, 300);
        f.setLayout(new FlowLayout());

        JTextField midBox = new JTextField(5);
        JTextField finBox = new JTextField(5);
        JTextField hwBox = new JTextField(5);
        JButton b1 = new JButton("Grade");
        JLabel label1 = new JLabel();

        b1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strMid = midBox.getText().toString();
                String strFin = finBox.getText().toString();
                String strHw = hwBox.getText().toString();
                double mid = Double.parseDouble(strMid);
                double fin = Double.parseDouble(strFin);
                double hw = Double.parseDouble(strHw);
                double total = mid + fin + hw;
                char grade;

                if (total >= 80)
                    grade = 'A';
                else if (total >= 70)
                    grade = 'B';
                else if (total >= 60)
                    grade = 'C';
                else if (total >= 50)
                    grade = 'D';
                else
                    grade = 'F';

                label1.setText("" + grade);
            }
        });

        f.add(midBox);
        f.add(finBox);
        f.add(hwBox);
        f.add(b1);
        f.add(label1);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
