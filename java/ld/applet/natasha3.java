import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
public class natasha3 extends Applet{
       Image pic;
       public void init(){
               pic=getImage(getDocumentBase(),"harry.jpg");
               
       }
       public void paint(Graphics g){
               setBackground(Color.BLUE);
               g.drawImage(pic,100,200,this);
       }
}
/* 
 <applet code="natasha3.class" width="400" height="400">
 </applet>
*/