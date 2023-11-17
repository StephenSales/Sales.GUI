package Nov17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalc extends JFrame {
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JLabel lblResult;
    private JPanel panel1;

    public SimpleCalc() {
        lblResult.setBorder(BorderFactory.createLineBorder(Color.black));
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                if (cbOperations.getSelectedIndex() == 0) {
                    lblResult.setText(String.valueOf(num1 + num2));
                }
                if (cbOperations.getSelectedIndex() == 1) {
                    lblResult.setText(String.valueOf(num1 - num2));
                }
                if (cbOperations.getSelectedIndex() == 2) {
                    lblResult.setText(String.valueOf(num1 * num2));
                }
                if (cbOperations.getSelectedIndex() == 3) {
                    lblResult.setText(String.valueOf(num1 / num2));
                }
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalc app = new SimpleCalc();
        app.setContentPane(app.panel1);
        app.setSize(700, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Simple Calculator");
        app.setVisible(true);
    }
}
