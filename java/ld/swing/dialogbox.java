import javax.swing.*;
import java.awt.event.*;
class dialogbox implements ActionListener
{     JFrame f;
      JButton b;
	  
      dialogbox(){
	        f = new JFrame();
	        b = new JButton("OK");
            b.setBounds(100,100,100,100);
            f.add(b);
            b.addActionListener(this);
        f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);			
	  }
	  public void actionPerformed(ActionEvent e){
	    if(e.getSource() == b){
		     JOptionPane.showMessageDialog(f,"Hello");
		}
	  }
	  public static void main(String s[]){
	       dialogbox ob = new dialogbox();
	   }
}