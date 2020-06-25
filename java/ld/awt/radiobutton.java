import java.awt.*;
import java.awt.event.*;
class radiobutton{
       radiobutton(){
	         Frame f = new Frame("RADIO-BUTTON");
			 Label l =new Label("     No option selected");
			 l.setSize(400,100);
			 Checkbox ch1 = new Checkbox("C-language");
			 ch1.setBounds(100,100,50,50);
			 Checkbox ch2 = new Checkbox("C++-language");
             ch2.setBounds(100,150,50,50);
             f.add(l);			 
			 f.add(ch1);			 
             f.add(ch2);
             ch1.addItemListener(new ItemListener(){
			        public void itemStateChanged(ItemEvent e){
					       l.setText("     C-language selected"+(e.getStateChange()==1?"  : checked":"  : unchecked"));
					}
			 });		
             ch2.addItemListener(new ItemListener(){
			        public void itemStateChanged(ItemEvent e){
					       l.setText("     C++-language selected"+(e.getStateChange()==1?"  : checked":"  : unchecked"));
					}
			 });				
             f.setSize(400,400);
			 f.setLayout(null);
			 f.setVisible(true);			 

	   }
	   public static void main(String s[]){
	      radiobutton r=new radiobutton();
	   }
}