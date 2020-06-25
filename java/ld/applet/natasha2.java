import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
public class natasha2 extends Applet{
     public void paint(Graphics g){
            g.setColor(Color.RED);
            setBackground(Color.PINK);
           g.drawString("Natasha Sharma",150,150);
            g.drawRect(100,200,300,400);
           g.drawLine(10,20,30,40);
           g.drawArc(80,30,100,400,30,90);
           g.drawOval(400,40,150,150);
     }
}
/*
  <applet code = "natasha2.class" width="400" height="400">
  </applet>
*/