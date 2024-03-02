import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu implements ActionListener
{
    JCheckBox cb1, cb2, cb3;
    JLabel bill;
    Menu()
    {
        JFrame jf = new JFrame("Menu");
        jf.setSize(800, 700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = jf.getContentPane();
        c.setLayout(null);

        Font f = new Font("Arial", Font.ITALIC, 20);
        JLabel lbl = new JLabel("Ready to eat........");
        lbl.setBounds(100, 100, 200, 50);
        lbl.setFont(f);
        c.add(lbl);

        cb1 = new JCheckBox("Pizza                 Rs.250");
        cb1.setBounds(150, 200, 400, 50);
        cb1.setFont(f);
        c.add(cb1);
        cb1.addActionListener(this);

        cb2 = new JCheckBox("Burger                Rs.150");
        cb2.setBounds(150, 300, 400, 50);
        cb2.setFont(f);
        c.add(cb2);
        cb2.addActionListener(this);

        cb3 = new JCheckBox("Samosa                Rs. 50");
        cb3.setBounds(150, 400, 400, 50);
        cb3.setFont(f);
        c.add(cb3);
        cb3.addActionListener(this);

        bill = new JLabel();
        bill.setBounds(150, 500, 400, 50);
        c.add(bill);

        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new Menu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int total = 0;
        if(cb1.isSelected())
        {
            total += 250;
        }
        if(cb2.isSelected())
        {
            total += 150;
        }
        if(cb3.isSelected())
        {
            total += 50;
        }
        bill.setText("Bill to be Paid : Rs. " + total);
        
    }
}
