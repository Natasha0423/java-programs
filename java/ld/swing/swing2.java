import javax.swing.*;
import java.awt.*;
class swing2
{
    swing2(){
	    JFrame f = new JFrame("Swing");
		JButton b = new JButton(new ImageIcon("harry.jpg"));
		b.setBounds(50,50,100,100);
		f.add(b);
	    f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String s[]) {
	    swing2 ob = new swing2();
	}
}