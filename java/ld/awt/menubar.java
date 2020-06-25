import java.awt.*;
import java.awt.event.*;
class menubar{
          menubar()
          {
                Frame f=new Frame("menu");

                 MenuBar mb= new MenuBar();

                 Menu m1= new Menu("File");
                 Menu m2= new Menu("Edit");
                 Menu m3= new Menu("Format");
                 Menu m4= new Menu("View");
                 Menu m5= new Menu("Help");
                 Menu sm= new Menu("Zoom");
                 Menu sm2= new Menu("Insert Unicode control character");

                 PopupMenu p= new PopupMenu();
                 
                 MenuItem i01 = new MenuItem("Undo");     
                 MenuItem i02 = new MenuItem("Cut");  
                 MenuItem i03 = new MenuItem("Copy");  
                 MenuItem i04 = new MenuItem("Paste");  
                 MenuItem i05 = new MenuItem("Delete");  
                 MenuItem i06 = new MenuItem("Select All");     
                 MenuItem i07 = new MenuItem("Right to Left Reading Order");  
                 MenuItem i08 = new MenuItem("Show Unicode control characters");   
                 MenuItem i09 = new MenuItem("Open IME");  
                 MenuItem i010 = new MenuItem("Reconversion");  
                 MenuItem i011 = new MenuItem("Search with bing...");  
                 MenuItem i012 = new MenuItem("LRM                     Left-to-right mark");     
                 MenuItem i013 = new MenuItem("RLM                     Right-to-left mark");  
                 MenuItem i014 = new MenuItem("ZWJ                      Zero width joiner");  
                 MenuItem i015 = new MenuItem("ZWNJ                 Zero width non-joiner");  
                 MenuItem i016 = new MenuItem("LRE       Start of left-to-right embedding");  
                 MenuItem i017 = new MenuItem("RLE       Start of right-to-left embedding");     
                 MenuItem i018 = new MenuItem("LRO        Start of left-to-right override");  
                 MenuItem i019 = new MenuItem("RLO        Start of right-to-left override");  
                 MenuItem i020 = new MenuItem("PDF             Pop directional formatting");  
                 MenuItem i021 = new MenuItem("NADS    National digit shapes substitution");  
                 MenuItem i022 = new MenuItem("NODS       Nominal (European) digit shapes");  
                 MenuItem i023 = new MenuItem("ASS            Activate symmetric swapping");   
                 MenuItem i024 = new MenuItem("ISS             Inhibit symmetric swapping");  
                 MenuItem i025 = new MenuItem("AAFS          Activate Arabic form shaping");  
                 MenuItem i026 = new MenuItem("IAFS           Inhibit Arabic form shaping");  
                 MenuItem i027 = new MenuItem("RS       Record Seperator (Block seperator)");  
                 MenuItem i028 = new MenuItem("US        Unit Seperator (Segment seperator");    
 
                 sm2.add(i012);
                 sm2.add(i013);
                 sm2.add(i014);
                 sm2.add(i015);
                 sm2.add(i016);
                 sm2.add(i017);
                 sm2.add(i018);
                 sm2.add(i019);
                 sm2.add(i020);
                 sm2.add(i021);
                 sm2.add(i022);
                 sm2.add(i023);
                 sm2.add(i024);
                 sm2.add(i025);
                 sm2.add(i026);
                 sm2.add(i027);
                 sm2.add(i028);
                 p.add(i01);
                 p.add(i02);
                 p.add(i03);
                 p.add(i04);
                 p.add(i05);
                 p.add(i06);
                 p.add(i07);
                 p.add(i08);
                 p.add(sm2);
                 p.add(i09);
                 p.add(i010);
                 p.add(i011);
         
                 MenuItem i1 = new MenuItem("New                              Ctrl+N");     
                 MenuItem i2 = new MenuItem("New Window    Ctrl+Shift+N");  
                 MenuItem i3 = new MenuItem("Open...                          Ctrl+O");  
                 MenuItem i4 = new MenuItem("Save                              Ctrl+S");  
                 MenuItem i5 = new MenuItem("Save As...          Ctrl+Shift+S");  
                 MenuItem i6 = new MenuItem("Page Setup...");  
                 MenuItem i7 = new MenuItem("Print...                           Ctrl+P");  
                 MenuItem i8 = new MenuItem("Exit"); 
 
                 m1.add(i1);   
                 m1.add(i2); 
                 m1.add(i3); 
                 m1.add(i4); 
                 m1.add(i5); 
                 m1.add(i6); 
                 m1.add(i7); 
                 m1.add(i8); 

                 MenuItem i9 = new MenuItem("Undo                               Ctr+Z");     
                 MenuItem i10 = new MenuItem("Cut                                 Ctrl+X");  
                 MenuItem i11 = new MenuItem("Copy                              Ctrl+C");  
                 MenuItem i12 = new MenuItem("Paste                             Ctrl+V");  
                 MenuItem i13 = new MenuItem("Delete                               Del");
                 MenuItem i14 = new MenuItem("Search with Bing...      Ctrl+E");  
                 MenuItem i15 = new MenuItem("Find...                              Ctrl F");  
                 MenuItem i16 = new MenuItem("Find Next                             F3");  
                 MenuItem i17 = new MenuItem("Find Previous             Shift+F3"); 
                 MenuItem i18 = new MenuItem("Replace...                      Ctrl+H");  
                 MenuItem i19 = new MenuItem("Go To...                          Ctrl+G");
                 MenuItem i20 = new MenuItem("Select All                      Cntrl+A");  
                 MenuItem i21 = new MenuItem("Time/Date                            F5"); 


                 m2.add(i9);   
                 m2.add(i10); 
                 m2.add(i11); 
                 m2.add(i12); 
                 m2.add(i13); 
                 m2.add(i14); 
                 m2.add(i15); 
                 m2.add(i16);
                 m2.add(i17);   
                 m2.add(i18); 
                 m2.add(i19); 
                 m2.add(i20);
                 m2.add(i21); 
                   
                 MenuItem i22 = new MenuItem("Word Wrap");  
                 MenuItem i23 = new MenuItem("Font..."); 
             
                 m3.add(i22);
                 m3.add(i23); 
     
                 MenuItem i24 = new MenuItem("Zoom In                     Cntrl+Plus");  
                 MenuItem i25 = new MenuItem("Zoom Out                Cntrl+Minus"); 
                 MenuItem i26 = new MenuItem("Restore Default Zoom   Cntrl+0");  
                 MenuItem i27 = new MenuItem("Status Bar"); 
           
                 sm.add(i24);
                 sm.add(i25);
                 sm.add(i26);
                 m4.add(sm);
                 m4.add(i27);
 
                 
                 MenuItem i28 = new MenuItem("View Help");  
                 MenuItem i29 = new MenuItem("Send Feedback"); 
                 MenuItem i30 = new MenuItem("About Notepad");  


                 m5.add(i28);
                 m5.add(i29);
                 m5.add(i30);

                 
                 mb.add(m1);
                 mb.add(m2);
                 mb.add(m3);
                 mb.add(m4);
                 mb.add(m5);
                 
                 f.setMenuBar(mb);
                 f.addMouseListener(new MouseAdapter()
                 {
                         public void mouseClicked(MouseEvent e){
                                     p.show(f,e.getX(),e.getY());
                         }
                 });
                 f.add(p);
                 f.setSize(300,300);
                 f.setLayout(null);
                 f.setVisible(true);              
          }
          public static void main(String s[]){
                    menubar ob=new menubar();
          } 

}