// Layout

import java.awt.*;
import javax.swing.*;

public class Flow_Layout 
{
    Flow_Layout()
    {
        JButton btn1, btn2, btn3, btn4, btn5, btn6;
        Container c;
        btn1 = new JButton("Button 1 vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        btn6 = new JButton("Button 6");

        JFrame jf = new JFrame();
        jf.setBounds(100, 100, 600, 600);

        c = jf.getContentPane();
        c.setBounds(100, 100, 100, 100);

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);

        // FlowLayout f = new FlowLayout(FlowLayout.RIGHT, 20, 30);
        FlowLayout f = new FlowLayout(FlowLayout.RIGHT);
        f.setVgap(20);
        f.setHgap(50);
        c.setLayout(f);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
        new Flow_Layout();
    }
}
