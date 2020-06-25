import java.awt.*;
import java.applet.*;
public class anima extends Applet{
        Image j;
		public void init(){
		        j = getImage(getDocumentBase(),"harry.jpg");
		}
		public void paint(Graphics g){
		        for(int i=0;i<100;i++){
				      g.drawImage(j,i,20,this);
					  try{
					      Thread.sleep(200);
					  }
					  catch(Exception e){}
				}
		}
}
/*
<applet code = "anima.class" height="600" width="600">
</applet>

*/