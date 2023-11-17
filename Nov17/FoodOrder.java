package Nov17;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame {
    private JPanel panel1;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JButton btnOrder;
    public FoodOrder() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int price = 0;
                JCheckBox cb[] = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
                if (cb[0].isSelected()) {
                    price += 100;
                }
                if (cb[1].isSelected()) {
                    price += 80;
                }
                if (cb[2].isSelected()) {
                    price += 65;
                }
                if (cb[3].isSelected()) {
                    price += 55;
                }
                if (cb[4].isSelected()) {
                    price += 50;
                }
                if (cb[5].isSelected()) {
                    price += 40;
                }
                float discount = 0.00F;
                JRadioButton btnD[] = {rbNone, rb5, rb10, rb15};
                if (btnD[0].isSelected()) {
                    discount = 0;
                }
                if (btnD[1].isSelected()) {
                    discount = 0.05F;
                }
                if (btnD[2].isSelected()) {
                    discount = 0.10F;
                }
                if (btnD[3].isSelected()) {
                    discount = 0.15F;
                }
                float total = price - (price * discount);
                String str = String.format("The total price is Php %.2f", total);
                JOptionPane.showMessageDialog(null, str);
            }
        });
    }
    public static void main(String[] args) {
        FoodOrder app = new FoodOrder();
        app.setContentPane(app.panel1);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Food Ordering System");
        app.setVisible(true);
    }
}
