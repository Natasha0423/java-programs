import java.awt.*;
import java.applet.*;
public class awt_in_applet extends Applet{
    Label l;
    public void init(){
	    l = new Label("Hello");
        l.setBounds(100,200,150,20);
        add(l);
        setLayout(null);
		
	}	
}
/*
<applet code = "awt_in_applet.class" height="600" width="600">
</applet>

*/