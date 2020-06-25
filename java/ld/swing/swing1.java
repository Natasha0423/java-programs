import javax.swing.*;
class swing1
{
    swing1(){
	    JFrame f = new JFrame("Swing");
		JButton b = new JButton("Hello");
		b.setBounds(130,100,100,40);
		f.add(b);
	    f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String s[]) {
	    swing1 ob = new swing1();
	}
}