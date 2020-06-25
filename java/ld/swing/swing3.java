import javax.swing.*;
class swing3{
    swing3(){
	    JFrame f = new JFrame("password");
	    JButton b = new JButton("OK");
		b.setBounds(50,50,100,40);
        JLabel l = new JLabel("Name :- ");
		l.setBounds(50,100,100,40);
        JTextField t = new JTextField("Enter Name");
		t.setBounds(230,100,100,40);
        JTextArea tr = new JTextArea();	
		tr.setBounds(50,180,100,50);
		JLabel l1 = new JLabel("Password :- ");
		l1.setBounds(50,230,50,50);
        JPasswordField p = new JPasswordField();
		p.setBounds(130,230,50,50);
        JCheckBox ch1 = new JCheckBox("C-language");		
		JRadioButton r1 = new JRadioButton("M");
		r1.setBounds(50,250,70,80);
		JRadioButton r2 = new JRadioButton("F");
		//r1.setBounds(300,300,30,40);
		r2.setBounds(50,300,70,80);
		ButtonGroup bt = new ButtonGroup();
		bt.add(r1);
		bt.add(r2);
		f.add(b);
		f.add(l);
		f.add(t);
		f.add(tr);
		f.add(l1);
		f.add(p);
		f.add(ch1);
		f.add(r1);
		f.add(r2);
	    f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String s[]) {
	    swing3 ob = new swing3();
	}
	
}