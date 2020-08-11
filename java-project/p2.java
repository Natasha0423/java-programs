import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class p2 implements ActionListener{
      JFrame f;
      JLabel l1,l2;
      JButton b1,b2,b3,b4,b5;
      p2(){
          f=new JFrame("Main Page");
          f.getContentPane().setBackground(Color.black);
          l1= new JLabel(new ImageIcon("kr.jpg"));
          l1.setBounds(0,0,600,150);
          l2= new JLabel(new ImageIcon("img.jpg"));
          l2.setBounds(30,150,250,336);
          
          b1= new JButton("REGISTRATION");
          b1.setBounds(300,180,200,50);
          b2= new JButton("VIEW");
          b2.setBounds(300,240,200,50);
          b3= new JButton("DELETE");
          b3.setBounds(300,300,200,50);
          b4= new JButton("UPDATE");
          b4.setBounds(300,360,200,50);
          b5= new JButton("BACK");
          b5.setBounds(300,420,200,50);

          Font fon=new Font("Serif",Font.BOLD,15);
          b1.setFont(fon);
          b2.setFont(fon);
          b3.setFont(fon);
          b4.setFont(fon);
          b5.setFont(fon);
          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          b4.addActionListener(this);
          b5.addActionListener(this);
          f.add(l1);
          f.add(l2);
          f.add(b1);
          f.add(b2);
          f.add(b3);
          f.add(b4);
          f.add(b5);
          f.setSize(600,600);
          f.setLayout(null);
          f.setVisible(true);
      }
      
      public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			p3 ob=new p3();
		}
                else if(e.getSource()==b2)
		{
			p4 ob=new p4();
		}
                else if(e.getSource()==b3)
		{
			p5 ob=new p5();
		}
                else if(e.getSource()==b4)
		{
			p6 ob=new p6();
		}
                else if(e.getSource()==b5)
		{
			p1 ob=new p1();
		}
	}
        
     
 
}
