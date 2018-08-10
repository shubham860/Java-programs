import java.awt.*;
import java.awt.event.*;
class AwtChoice extends Frame implements ItemListener
{
  Choice c;
  AwtChoice()
  {
    this.setLayout(new FlowLayout());
    Font f = new Font("verdana",Font.BOLD,27);
    c = new Choice();
    
    c.add("select country");
    c.add("india");
    c.add("pakistan");
    c.add("bangladesh");
    c.add("srilanka");

    c.setFont(f);
    this.add(c);
    c.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent ie)
  {
    System.out.println(c.getSelectedItem());
  }

 public static void main(String[] args)
  {
    
    AwtChoice c = new AwtChoice();
    c.setSize(400,400);//w,h
    c.setTitle("MY FIRST AWT");//string
    c.setVisible(true);
    c.setLocation(100,80);//x,y
    c.setBackground(Color.RED);
    c.addWindowListener(new Events()); 	
  }
}
class Events extends WindowAdapter
{
   public void windowClosing(WindowEvent we)
   {
     System.exit(0);
   }
}