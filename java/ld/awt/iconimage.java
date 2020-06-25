import java.awt.*;
class iconimage{
             iconimage(){
			       Frame f = new Frame("iconimage");
				   Image ic = Toolkit.getDefaultToolkit().getImage("harry.jpg");
				   f.setIconImage(ic);
				   f.setSize(400,400);
				   f.setLayout(null);
				   f.setVisible(true);
			 }
			 public static void main(String s[]){
			     iconimage ob= new iconimage();
			 }
}