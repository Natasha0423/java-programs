import java.awt.*;
import java.awt.event.*;
class choice{
            choice(){
                  Frame f = new Frame("Receive_Choice");
                  Label l = new Label("     No Option Selected");
				  l.setSize(400,100);
				  Button b =new Button("Fetch");
				  b.setBounds(200,100,75,75);
				  Choice ch = new Choice();
				  ch.setBounds(100,100,75,75);

				  ch.add("Delhi");
				  ch.add("Agra");
				  ch.add("Noida");
				  ch.add("UK");
				  ch.add("UP");
				  f.add(l);
				  f.add(b);
				  f.add(ch);
				  f.setSize(400,400);
				  f.setLayout(null);
				  f.setVisible(true);
				  b.addActionListener(new ActionListener(){
				          public void actionPerformed(ActionEvent e)
						  {
						       String s="     You selected :- "+ch.getItem(ch.getSelectedIndex());
							   l.setText(s);
						  }
				  });

            }
            public static void main(String s[]){
                    choice ob = new choice();
            }
            
             
}