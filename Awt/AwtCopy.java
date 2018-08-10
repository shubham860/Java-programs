import java.awt.*;
import java.awt.event.*;
class AwtCopy extends Frame
{
 public static void main(String[] args)
  {
    AwtCopy a = new AwtCopy();
    a.setSize(400,400);//w,h
    a.setTitle("MY FIRST AWT");//string
    a.setVisible(true);
    a.setLocation(100,80);//x,y
    a.setBackground(Color.RED);
   /* a.setResizable(false);(for max. nd min. the size of screen)*/
    a.addWindowListener(new Events()); 	
  }
}
class Events extends WindowAdapter
{
   public void windowClosing(WindowEvent we)
   {
     System.exit(0);
   }
}