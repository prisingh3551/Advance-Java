
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator extends JFrame implements ActionListener
{
    Container c;
    JLabel label_1, label_2, label_result;
    JTextField jf1, jf2;
    JButton btn_add, btn_sub, btn_mul, btn_div, btn_mod;
    Calculator()
    { 
        setTitle("Calculator");
        setSize(800, 600);
        setLocation(200, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        c = getContentPane();
        c.setLayout(null);
        Font f = new Font("Verdana", Font.BOLD, 25);

        //no
        label_1 = new JLabel("First Number : ");
        label_1.setBounds(100, 100, 300, 50);
        c.add(label_1);
        label_1.setFont(f);

        label_2 = new JLabel("Second Number : ");
        label_2.setBounds(100, 170, 300, 50);
        c.add(label_2);
        label_2.setFont(f);

        //TextField
        jf1 = new JTextField();
        jf1.setBounds(400, 100, 300, 50);
        c.add(jf1);
        jf1.setFont(f);

        jf2 = new JTextField();
        jf2.setBounds(400, 170,300, 50);
        c.add(jf2);
        jf2.setFont(f);

        btn_add = new JButton("+");
        btn_add.setBounds(100, 250, 100, 50);
        c.add(btn_add);
        btn_add.setFont(f);
        btn_add.addActionListener(this);

        btn_sub = new JButton("-");
        btn_sub.setBounds(210, 250, 100, 50);
        c.add(btn_sub);
        btn_sub.setFont(f);
        btn_sub.addActionListener(this);
        
        btn_mul = new JButton("*");
        btn_mul.setBounds(320, 250, 100, 50);
        c.add(btn_mul);
        btn_mul.setFont(f);
        btn_mul.addActionListener(this);
        
        btn_div = new JButton("/");
        btn_div.setBounds(430, 250, 100, 50);
        c.add(btn_div);
        btn_div.setFont(f);
        btn_div.addActionListener(this);

        btn_mod = new JButton("%");
        btn_mod.setBounds(540, 250, 100, 50);
        c.add(btn_mod);
        btn_mod.setFont(f);
        btn_mod.addActionListener(this);

        //result
        label_result = new JLabel("Result");
        label_result.setBounds(100, 300, 800, 50);
        c.add(label_result);
        label_result.setFont(f);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        try
        {
            double num1 = Double.parseDouble(jf1.getText());
            double num2 = Double.parseDouble(jf2.getText());
            double ans = 0.0;

            if(e.getSource() == btn_add)
            {
                ans = num1 + num2;
            }
            else if(e.getSource() == btn_sub)
            {
                ans = num1 - num2;
            }
            else if(e.getSource() == btn_mul)
            {
                ans = num1 * num2;
            } 
            else if(e.getSource() == btn_div)
            {
                if(num2 == 0) throw new ArithmeticException();
                ans = num1 / num2;
            }
            else if(e.getSource() == btn_mod)
            {
                ans = num1 % num2;
            } 
            label_result.setText("Result : " + ans);
        }
        catch(NumberFormatException NFE)
        {
            label_result.setText("Invalid Input");
        }
        catch(ArithmeticException AE)
        {
            label_result.setText("Division By Zero");
        }
    }
}

public class MyCalculator
{
    public static void main(String[] args) {
        new Calculator();
    }
}