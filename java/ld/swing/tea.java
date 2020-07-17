import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class tea implements ActionListener{
      JFrame f;
      JLabel l1,l2,l3,l4,t2;
      JButton b1;
      JTextField t1;
      JComboBox j1,j2;
      tea(){
          f=new JFrame("Coffee House");

          l1= new JLabel("The Coffee House",JLabel.CENTER);
          l1.setBackground(Color.red);
          l1.setForeground(Color.black);
          l1.setBounds(0,0,600,150);

          l2= new JLabel("Tea",JLabel.CENTER);
          l2.setBackground(Color.black);
          l2.setBounds(80,160,200,40);

          l3= new JLabel("Coffee",JLabel.CENTER);
          l3.setForeground(Color.white);
          l3.setForeground(Color.black); 
          l3.setBounds(80,220,200,40);

          l4= new JLabel("Fan",JLabel.CENTER);
          l4.setBounds(80,280,200,40);
          l4.setForeground(Color.black); 
          l4.setBackground(Color.blue);
          
          String number[]={"0","1","2","3","4","5","6","7","8","9","10"};
          j1=new JComboBox(number); 
          j1.setBounds(300,160,200,40);
          j2=new JComboBox(number); 
          j2.setBounds(300,220,200,40);

          t1= new JTextField("0");
          t1.setBounds(300,280,200,40);
          t2= new JLabel("",JLabel.CENTER);
          t2.setBounds(125,400,400,150);
          t2.setOpaque(true);
          t2.setBackground(Color.white);
         // t2.setLayout(new  BoxLayout(t2, BoxLayout.Y_AXIS));
          


          b1= new JButton("Show Bill");
          b1.setBackground(Color.blue);
          b1.setBounds(180,350,300,40);
          b1.addActionListener(this);

          Font fo=new Font("Elephant",Font.ITALIC,20);
          l2.setFont(fo);
          l3.setFont(fo);
          l4.setFont(fo);
          b1.setFont(fo);
          Font fi=new Font("Elephant",Font.ITALIC,40);
          l1.setFont(fi);
          Font ff=new Font("Elephant",Font.ITALIC,20);
          t2.setFont(ff);
          f.add(l1);
          f.add(l2);
          f.add(l3);
          f.add(l4);
          
          f.add(b1);
          f.add(j1);
          f.add(j2);
          f.add(t1);
          f.add(t2);

          f.setSize(600,600);
          f.setLayout(null);
          f.setVisible(true);
      }
      public void actionPerformed(ActionEvent e) 
	{       String s1 = String.valueOf(j1.getSelectedItem());
                String s2 = String.valueOf(j2.getSelectedItem());
                String s3 = t1.getText();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = Integer.parseInt(s3);
                int d=0;
                
                if(e.getSource() == b1)
                {
                       a=a*50;
                       b=b*100;
                       c=c*12;
                       d=a+b+c;  
                       String s4 = String.valueOf("<html>"+"Total Payment"+"<br>"+"Tea :- "+a+"<br>"+"Coffee :- "+b+"<br>"+"Fan :- "+c+"<br>"+"Total Bill :- "+d+"</html>");
                       final String s5="\n";
                       t2.setText(s4+s5+"hi");
                       
                }
               
	}
      public static void main(String[] s){
          tea ob=new tea();
      }
        
 
}
