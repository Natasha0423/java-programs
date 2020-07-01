import javax.swing.*;
import java.awt.event.*;
public class Main implements ActionListener {
      JFrame f;
      JLabel l1,l2,l3,l4,l5;
      JButton b1,b2;
      JTextField t1,t2,t3,t4;
      Main(){
              f=new JFrame();
              l1= new JLabel(new ImageIcon("hogwards.png"));
              l1.setBounds(0,0,370,100);
              l2= new JLabel("Name :-");
              l2.setBounds(30,120,100,20);
              l3= new JLabel("Father's Name :-");
              l3.setBounds(30,150,100,20);
              l4= new JLabel("Mother's Name :-");
              l4.setBounds(30,180,100,20);
              l5= new JLabel("Phone Number :-");
              l5.setBounds(30,210,100,20);
              t1= new JTextField(" ");
              t1.setBounds(140,120,200,20);
              t2= new JTextField(" ");
              t2.setBounds(140,150,200,20);
              t3= new JTextField(" ");
              t3.setBounds(140,180,200,20);
              t4= new JTextField(" ");
              t4.setBounds(140,210,200,20);
              b1= new JButton("Submit");
              b1.setBounds(30,240,100,40);
              b1.addActionListener(this);
              b2= new JButton("Reset");
              b2.setBounds(140,240,100,40);
              b2.addActionListener(this);
              
              f.add(l1);
              f.add(l2);
              f.add(l3);
              f.add(l4);
              f.add(l5);
              f.add(t1);
              f.add(t2);
              f.add(t3);
              f.add(t4);
              f.add(b1);
              f.add(b2);
              f.setSize(400,400);
              f.setLayout(null);
              f.setVisible(true);
      }
      public void actionPerformed(ActionEvent e) {
         if (e.getSource() == b2) {
                 t1.setText(" ");
                 t2.setText(" ");
                 t3.setText(" ");
                 t4.setText(" ");
        
         }
          String s1 = t1.getText();
          String s2 = t2.getText();
          String s3 = t3.getText();
          String s4 = t4.getText();
         if (e.getSource() == b1) {
             if(s1.length()<4)
                 t1.setText("The value must be greater than 4");
             if(s2.length()<4)
                 t2.setText("The value must be greater than 4");
             if(s3.length()<4)
                 t3.setText("The value must be greater than 4");
             if(s4.length() != 10)
                 t4.setText("Please enter valid number");
        
         }
     }
      public static void main(String s[]){
             Main m=new Main();    
      }
}