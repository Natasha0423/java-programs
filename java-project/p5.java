import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class p5 implements ActionListener{
      JFrame f;
      JLabel l1,l2,l3;
      JButton b1,b2,b3;
      JTextField t1;
      p5(){
          f=new JFrame("Delete Page");
          f.getContentPane().setBackground(Color.black);
          l1= new JLabel(new ImageIcon("kr.jpg"));
          l1.setBounds(0,0,600,150);
          l2= new JLabel(" Enter Roll Number you want to DELETE");
          l2.setForeground(Color.white);
          l2.setBounds(80,180,400,80);
          l3= new JLabel("Roll Number :-",JLabel.CENTER);
          l3.setForeground(Color.white); 
          l3.setBounds(80,300,200,50);
          t1= new JTextField();
          t1.setBounds(300,300,200,50);
          b1= new JButton("RESET");
          b1.setBounds(120,390,100,50);
          b2= new JButton("DELETE");
          b2.setBounds(240,390,100,50);
          b3= new JButton("BACK");
          b3.setBounds(360,390,100,50);
          Font foi=new Font("Serif",Font.BOLD,22);   
          l2.setFont(foi);
          Font fo=new Font("Serif",Font.BOLD,20);   
          l3.setFont(fo);
          Font fon=new Font("Serif",Font.BOLD,15);
          b1.setFont(fon);
          b2.setFont(fon);
          b3.setFont(fon);
          b1.addActionListener(this);
          b2.addActionListener(this);
          b3.addActionListener(this);
          f.add(l1);
          f.add(l2);
          f.add(l3);
          f.add(t1);
          f.add(b1);
          f.add(b2);
          f.add(b3);
          f.setSize(600,550);
          f.setLayout(null);
          f.setVisible(true);
      }
      public void actionPerformed(ActionEvent e)
	{       String s1 = t1.getText();
                if(e.getSource()==b2)
		{
			p8 ob=new p8(s1);
		}
                if(e.getSource()==b1)
		{
			t1.setText("");
                        
		}
                if(e.getSource()==b3)
		{
			p2 ob=new p2();
                        
		}
	}
       public static void main(String s[]){
             p5 ob= new p5();
       }
     
 
}
