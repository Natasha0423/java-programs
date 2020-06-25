import javax.swing.*;
import java.awt.Color;
class project1 {
        project1(){
		       JFrame f = new JFrame("main");
			   //f.getContentPane().setBackground(Color.BLUE);
			   JLabel l = new JLabel(new ImageIcon("hogwards.png"));
			   l.setBounds(0,0,400,223);
			   JLabel l2 = new JLabel("NAME :- ");
			   l2.setBounds(10,230,150,40);
			   JTextField t = new JTextField("          ");
		       t.setBounds(210,230,200,40);
			   JLabel l3 = new JLabel("PASSWORD :- ");
		       l3.setBounds(10,270,150,40);
			   JPasswordField p = new JPasswordField("");
		       p.setBounds(210,270,200,40);
			   JButton b1 = new JButton("SUBMIT");
		       b1.setBounds(10,310,100,40);
		       JButton b = new JButton("RESET");
		       b.setBounds(200,310,100,40);
			   
			   f.add(l);
			   f.add(l2);
			   f.add(t);
			   f.add(l3);
			   f.add(p);
			   f.add(b1);
			   f.add(b);
	           f.setSize(400,400);
		       f.setLayout(null);
		       f.setVisible(true);
		}
		public static void main(String s[]) {
	             project1 ob = new project1();
	    }
}