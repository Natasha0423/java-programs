import java.sql.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class p7 extends p4 implements ActionListener
{       static String a;
        JButton b3;
        static JFrame f;
        static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
        p7(String s){
          a=s;
          System.out.println(a);

          f=new JFrame("View Details");
          f.getContentPane().setBackground(Color.black);
          l1= new JLabel(new ImageIcon("kr.jpg"));
          l1.setBounds(0,0,600,150);

          l2= new JLabel("Roll Number :-",JLabel.CENTER);
          l2.setForeground(Color.white);
          l2.setBounds(80,210,200,40);
          l6= new JLabel();
          l6.setForeground(Color.white);
          l6.setBounds(300,210,200,40);

          l3= new JLabel("NAME :-",JLabel.CENTER);
          l3.setForeground(Color.white); 
          l3.setBounds(80,260,200,40);
          l7= new JLabel();
          l7.setForeground(Color.white);
          l7.setBounds(300,260,200,40);

          l4= new JLabel("FATHER'S NAME :-",JLabel.CENTER);
          l4.setForeground(Color.white); 
          l4.setBounds(80,310,200,40);
          l8= new JLabel();
          l8.setForeground(Color.white);
          l8.setBounds(300,310,200,40);
          
          l5= new JLabel("MOTHER'S NAME :-",JLabel.CENTER);
          l5.setForeground(Color.white); 
          l5.setBounds(80,360,200,40);
          l9= new JLabel();
          l9.setForeground(Color.white);
          l9.setBounds(300,360,200,40);
       
          b3= new JButton("BACK");
          b3.setBounds(200,430,100,50);

          Font fo=new Font("Serif",Font.BOLD,20);   
          l2.setFont(fo);
          l3.setFont(fo);
          l4.setFont(fo);
          l5.setFont(fo);
          l6.setFont(fo);
          l7.setFont(fo);
          l8.setFont(fo);
          l9.setFont(fo);
          Font fon=new Font("Serif",Font.BOLD,15);
          b3.setFont(fon);
          b3.addActionListener(this);

          f.add(l1);
          f.add(l2);
          f.add(l3);
          f.add(l4);
          f.add(l5);
          f.add(l6);
          f.add(l7);
          f.add(l8);
          f.add(l9);
          f.add(b3);
          f.setSize(600,600);
          f.setLayout(null);
          f.setVisible(true);
          sql();
        }
        public void actionPerformed(ActionEvent e)
 	{ 
             if(e.getSource()==b3)
		{
			p4 ob=new p4();
                        
		}
        }
        public static void sql(){
             Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/project_java","root","");
			System.out.println("Connect Success.....");
			Statement stat=con.createStatement();

			String inser="SELECT * FROM `student` WHERE `Roll_number` = '"+ a +"';";
			ResultSet rs=stat.executeQuery(inser);
			if(rs.next() != false){
				String s0=rs.getString(1);
                                String s1=rs.getString(2);
                                String s2=rs.getString(3);
                                String s3=rs.getString(4);
                                l6.setText(s0);
                                l7.setText(s1);
                                l8.setText(s2);
                                l9.setText(s3);
			}else{
                         JOptionPane.showMessageDialog(f,"Candidate doesn't exist");
                         p4 ob= new p4();
                        }
                        


			System.out.println("View Success.....");
		}
		catch(Exception e)
		{
			System.out.println("Not Connected");
		}
        }
	public static void main(String s[])
	{     
               // String ss="1";
                //p7 ob= new p7(ss);
                //sql();
                
       }
}