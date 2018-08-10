import java.awt.*;
import java.awt.event.*;
class ButtonsBackground extends Frame implements ActionListener
{
  Button b1,b2,b3;

ButtonsBackground()
{
  this.setLayout(null);//set layout by ourselves

  b1 = new Button("RED");
  b2 = new Button("BLUE");
  b3 = new Button("GREEN");

  b1.setBounds(20,60,80,40);//x,y,w,h
  b2.setBounds(20,120,80,40);
  b3.setBounds(20,180,80,40);

  this.add(b1);
  this.add(b2);
  this.add(b3);

  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);

}

public void actionPerformed(ActionEvent ae)
{
  if(ae.getSource()==b1)
    this.setBackground(new Color(255,0,0));
  if(ae.getSource()==b2)
    this.setBackground(new Color(0,0,255));
  if(ae.getSource()==b3)
    this.setBackground(new Color(0,255,0));
}





 public static void main(String[] args)
  {
    ButtonsBackground b = new ButtonsBackground();
    b.setSize(400,400);//w,h
    b.setTitle("MY FIRST AWT");//string
    b.setVisible(true);
    b.setLocation(100,80);//x,y
    b.setBackground(Color.RED);
   b.setResizable(false);
    b.addWindowListener(new Events()); 	
  }
}
class Events extends WindowAdapter
{
   public void windowClosing(WindowEvent we)
   {
     System.exit(0);
   }
}