import java.awt.*;
import java.awt.event.*;
class Awt extends Frame
{
 public static void main(String[] args)
  {
    Awt a = new Awt();
    a.setSize(400,400);//w,h
    a.setTitle("MY FIRST AWT");//string
    a.setVisible(true);
    a.setLocation(100,80);//x,y
    a.setBackground(Color.RED);
    a.setResizable(false);
    a.addWindowListener(new Events()); 	
  }
}
class Events implements WindowListener
{
   public void windowOpened(WindowEvent we){}
   public void windowClosing(WindowEvent we)
   {
     System.exit(0);
   }
   public void windowClosed(WindowEvent we){}
   public void windowActivated(WindowEvent we){}
   public void windowDeactivated(WindowEvent we){}
   public void windowIconified(WindowEvent we){}
   public void windowDeiconified(WindowEvent we){}
}