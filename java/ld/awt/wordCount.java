import java.awt.*;
import java.awt.event.*;
import java.io.*;
class wordCount implements ActionListener{
          Frame f;
          TextField t1;
          Button b1;
          Label l1,l2;
     
          wordCount(){
                 f = new Frame("wordcount");
                 l1 = new Label("Words :- 0");
                 l1.setBounds(30,50,150,20);
                 l2 = new Label("Letters :- 0");
                 l2.setBounds(300,50,150,20);
                 t1 = new TextField();
                 t1.setBounds(30,100,400,200);
              
                 b1 = new Button("Count");
                 b1.setBounds(200,400,50,20);
                 b1.addActionListener(this);

                 f.add(l1);
                 f.add(l2);
                 f.add(t1);
                 f.add(b1);

                 f.setSize(300,300);
                 f.setLayout(null);
                 f.setVisible(true);
                
          }
          public void actionPerformed(ActionEvent e){
                String s1[] = t1.getText();
                int count=0;
                if(e.getSource() == b1){
                       for (int i = 0; s1[i] != '\0';i++)
                       {
                         if (s1[i] == ' ')
                            count++;    
                        }
                        String s2 = String.valueOf(count);
                        l1.setText("Words :- "+s2); 
                }
                
          }
          public static void main(String s[]){
                    wordCount ob = new wordCount();
          }
}