import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener
{
    Container c;
    JButton btn1, btn2, btn3, btn4;
    
    MyFrame()
    {
        setTitle("Changing Background colour using Buttons");

        c = this.getContentPane();
        c.setLayout(null);
        Font f = new Font("Arial", Font.BOLD, 34);
        btn1 = new JButton("RED");
        btn1.setSize(150, 50);
        btn1.setLocation(100, 100);
        btn1.setFont(f);
        btn1.addActionListener(this);

        c.add(btn1);

        btn1.addActionListener(this);
        
        btn2 = new JButton("GREEN");
        btn2.setSize(150, 50);
        btn2.setLocation(300, 100);
        btn2.setFont(f);
        btn2.addActionListener(this);
        c.add(btn2);

        
        btn3 = new JButton("BLUE");
        btn3.setSize(150, 50);
        btn3.setLocation(100, 200);
        btn3.setFont(f);
        btn3.addActionListener(this);
        c.add(btn3);

        
        btn4 = new JButton("YELLOW");
        btn4.setSize(150, 50);
        btn4.setLocation(300, 200);
        btn4.setFont(f);
        btn4.addActionListener(this);
        c.add(btn4);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(btn1 == e.getSource())
            c.setBackground(Color.RED);
        if(btn2 == e.getSource())
            c.setBackground(Color.GREEN);
        if(btn3 == e.getSource())
            c.setBackground(Color.BLUE);
        if(btn4 == e.getSource())
            c.setBackground(Color.YELLOW);
    }
}
public class Button_Action  {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setBounds(100, 100, 800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
