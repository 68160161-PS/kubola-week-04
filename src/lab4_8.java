import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab4_8 {
    public static void main(String[] args) {
        JFrame win = new JFrame("BMI Calculator");
        win.setSize(400, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(144, 238, 144));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel lbWeight = new JLabel("Weight (kg): ");
        lbWeight.setFont(new Font("Serif", Font.PLAIN, 16));
        lbWeight.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(lbWeight);

        JTextField txtWeight = new JTextField(10);
        txtWeight.setFont(new Font("Serif", Font.PLAIN, 16));
        panel.add(txtWeight);

        JLabel lbHeight = new JLabel("Height (cm): ");
        lbHeight.setFont(new Font("Serif", Font.PLAIN, 16));
        lbHeight.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(lbHeight);

        JTextField txtHeight = new JTextField(10);
        txtHeight.setFont(new Font("Serif", Font.PLAIN, 16));
        panel.add(txtHeight);

        JButton btnCalculate = new JButton("Calculate BMI");
        btnCalculate.setFont(new Font("Serif", Font.PLAIN, 18));
        btnCalculate.setAlignmentX(JButton.CENTER_ALIGNMENT);
        panel.add(btnCalculate);

        JLabel lbBMI = new JLabel("BMI = ");
        lbBMI.setFont(new Font("Serif", Font.PLAIN, 18));
        lbBMI.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(lbBMI);

        JLabel lbResult = new JLabel("Result: ");
        lbResult.setFont(new Font("Serif", Font.PLAIN, 18));
        lbResult.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel.add(lbResult);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(txtWeight.getText());
                    double height = Double.parseDouble(txtHeight.getText()) / 100; // Convert cm to m
                    double bmi = weight / (height * height);
                    lbBMI.setText("BMI = " + String.format("%.2f", bmi));

                    // Determine the result
                    String result = "";
                    if (bmi < 18.5) {
                        result = "Underweight";
                    } else if (bmi >= 18.5 && bmi < 24.9) {
                        result = "Normal weight";
                    } else if (bmi >= 25 && bmi < 29.9) {
                        result = "Overweight";
                    } else {
                        result = "Obesity";
                    }
                    lbResult.setText("Result: " + result);
                } catch (NumberFormatException ex) {
                    lbBMI.setText("BMI = Error");
                    lbResult.setText("Result: Invalid input");
                }
            }
        });

        win.add(panel);
        win.setVisible(true);
    }
}
