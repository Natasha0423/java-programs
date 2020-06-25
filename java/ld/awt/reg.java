import java.awt.*;
import java.awt.event.*;
import java.io.*;
class reg{
     reg(){
        Frame f = new Frame("layout");
      
        Label l1= new Label("               K.R.Network Cloud");
        //l1.setBounds(0,0,0,0);

        Panel panel1 = new Panel();
        panel1.setBounds(50,50,1000,80);
        Panel panel2 = new Panel();
        panel2.setBounds(50,200,600,500);
        Panel panel3 = new Panel();
        panel3.setBounds(700,200,500,500);

        Label l2= new Label("First-Name :-");
        Label l3= new Label("Last-Name :-");
        Label l4= new Label(" Age :-");
        Label l5= new Label("Email :-");
        Label l6= new Label(" Phone Number :-");
        Label l7= new Label("Password :-");
        Label l8= new Label(" Re-Enter Password :-");
        TextField t1 = new TextField(" Enter firstname");
        TextField t2 = new TextField(" Enter lastname");
        TextField t3 = new TextField(" Enter age");
        TextField t4 = new TextField(" Enter Email ID");
        TextField t5 = new TextField(" Enter Phone Number");
        TextField t6 = new TextField(" Enter Password");
        TextField t7 = new TextField("Re-enter Password");
        Button b1 = new Button("Sign Up");
        b1.setBounds(450,200,200,200);

        l2.setBounds(100,200,200,50);
        l3.setBounds(100,250,200,50);
        l4.setBounds(100,280,100,50);
        l5.setBounds(100,310,100,50);
        l6.setBounds(100,340,100,50);
        l7.setBounds(100,370,100,50);
        l8.setBounds(100,400,100,50);
		
		t1.setBounds(200,220,200,50);
        t2.setBounds(200,250,200,50);
        t3.setBounds(200,280,100,50);
        t4.setBounds(200,310,100,50);
        t5.setBounds(200,340,100,50);
        t6.setBounds(200,370,100,50);
        t7.setBounds(200,400,100,50);


        Label l9= new Label(" Username :-");
        Label l10= new Label("Password :-");
        TextField t8 = new TextField(" Enter Username");
        TextField t9 = new TextField(" Enter Password");
        Button b2 = new Button("Log In");
        b2.setBounds(450,200,200,200);

        
        Font myFont = new Font("Serif",Font.BOLD,30);
        l1.setFont(myFont);
		
        
        panel1.add(l1);
        panel2.add(l2);
        panel2.add(t1);
        panel2.add(l3);
        panel2.add(t2);
        panel2.add(l4);
        panel2.add(t3);
        panel2.add(l5);
        panel2.add(t4);
        panel2.add(l6);
        panel2.add(t5);
        panel2.add(l7);
        panel2.add(t6);
        panel2.add(l8);
        panel2.add(t7);
        panel2.add(b1);
        panel3.add(l9);
        panel3.add(t8);
        panel3.add(l10);
        panel3.add(t9);
        panel3.add(b2);

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.BLUE);
        f.add(panel1);
        f.add(panel2);
        f.add(panel3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        }
        public static void main(String s[]){
            reg ob= new reg();
        }

}