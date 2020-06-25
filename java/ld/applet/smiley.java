import java.applet.Applet;
import java.awt.Graphics;
import java.awt.*;
public class smiley extends Applet{
     public void paint(Graphics g){
           
           setBackground(Color.CYAN);
           
           g.setColor(Color.YELLOW);
           g.fillOval(100,100,400,400);
           g.setColor(Color.BLACK);
           g.drawOval(100,100,400,400);

           g.setColor(Color.BLACK);
           g.fillOval(220,220,40,40);
           g.fillOval(350,220,40,40);
           g.drawOval(220,220,40,40);
           g.drawOval(350,220,40,40);

           g.drawArc(160,230,280,200,0,-180);
     }
}
/*
  <applet code = "smiley.class" width="400" height="400">
  </applet>
*/