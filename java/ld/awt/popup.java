import java.io.*;
import java.awt.*;
import java.awt.event.*;
class popup{
          popup(){
                 Frame f=new Frame("popup");
                 PopupMenu p= new PopupMenu();
                 f.add(p);
                 MenuItem i01 = new MenuItem("Undo");     
                 MenuItem i02 = new MenuItem("Cut");  
                 MenuItem i03 = new MenuItem("Copy");  
                 MenuItem i04 = new MenuItem("Paste");  
                 MenuItem i05 = new MenuItem("Delete");  
                 MenuItem i06 = new MenuItem("Select All");  
                 p.add(i01);
                 p.add(i02);
                 p.add(i03);
                 p.add(i04);
                 p.add(i05);
                 p.add(i06);  
                 f.add(p); 
                 f.addMouseListener(new MouseAdapter()
                 {
                         public void mouseClicked(MouseEvent e){
                                     p.show(f,e.getX(),e.getY());
                         }
                 });
                 f.setSize(300,300);
                 f.setLayout(null);
                 f.setVisible(true);              
          }
          public static void main(String s[]){
                    popup ob=new popup();
          } 

}