import javax.swing.*;
import java.lang.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.*;


class myframe1 extends JFrame
{
    JLabel nofdisc;
    JTextField number;
    JButton ok;
    JPanel p;
    myframe1()
    {
          nofdisc=new JLabel(" no of disc ");
          number=new JTextField(20);
          ok=new JButton("enter");
          ok.setBackground(Color.black);
          ok.setForeground(Color.white);
          p=new JPanel();
          p.add(nofdisc);
          p.add(number);
          p.add(ok);
        setLayout(new FlowLayout());
        getRootPane().setDefaultButton(ok);
        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED, 2)," DISC");
        p.setBorder(br);
        add(p);
    }
}
public class toerofhanoi 
{
     public static void main(String[] args) 
     { 
           myframe1 fl=new myframe1();
           fl.setTitle("nof of disc");
           
        fl.setSize(400,400);
         fl.setVisible(true);
         fl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image=new ImageIcon("C:\\Users\\Wahab\\Downloads\\logo.jpg");
           fl.setIconImage(image.getImage());
     }    
}

