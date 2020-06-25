import java.awt.*;
import java.awt.event.*;
class calci implements ActionListener{
       Frame f;
       TextField t1,t2,t3;
       Button b1,b2,b3,b4;
     
       calci(){
         f = new Frame("Calculator");
         t1 = new TextField();
         t1.setBounds(50,50,150,20);
         t2 = new TextField();
         t2.setBounds(50,100,150,20);
         t3 = new TextField();
         t3.setBounds(50,150,150,20);

         b1 = new Button("Add");
         b1.setBounds(50,200,50,20);
         b1.addActionListener(this);

         f.add(t1);
         f.add(t2);
         f.add(t3);
         f.add(b1);
      
         b2 = new Button("Sub");
         b2.setBounds(100,200,50,20);
         b2.addActionListener(this);
         b3 = new Button("Mul");
         b3.setBounds(50,250,50,20);
         b3.addActionListener(this);
         b4 = new Button("Div");
         b4.setBounds(100,250,50,20);
         b4.addActionListener(this);

         f.add(b2);
         f.add(b3);
         f.add(b4);
 
         f.setSize(300,300);
         f.setLayout(null);
         f.setVisible(true);
       } 
       public void actionPerformed(ActionEvent e){
                String s1 = t1.getText();
                String s2 = t2.getText();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c=0;
                if(e.getSource() == b1)
                {
                       c=a+b;  
                       String s3 = String.valueOf(c);
                       t3.setText(s3);
                }
                else if(e.getSource() == b2)
                {
                      if( a<=0 )
                      { 
                          String s4= new String("Wrong input");
                          t3.setText(s4);
                      }
                      else 
                      {   c=a-b;
                         String s3 = String.valueOf(c);
                         t3.setText(s3);  
                      }
                }
                else if(e.getSource() == b3)
                {
                      if( a<=0 || b<=0 )
                      { 
                          String s4= new String("Wrong input");
                          t3.setText(s4);
                      }
                      else 
                       {  c=a*b;
                         String s3 = String.valueOf(c);
                         t3.setText(s3); 
                      } 
                }
                else if(e.getSource() == b4)
                {
                      if( a<=0 || b<=0 )
                      {   c=a/b;
                          String s4= new String("Wrong input");
                          t3.setText(s4);
                      }
                      else
                      {
                       c=a/b;  
                       String s3 = String.valueOf(c);
                       t3.setText(s3);
                      }
                }
                
              

       }
       public static void main(String s[]){
             calci ob = new calci();
       }
}