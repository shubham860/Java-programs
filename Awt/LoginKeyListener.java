import java.awt.*;
import java.awt.event.*;
class LoginKeyListener extends Frame implements KeyListener,ActionListener
{

  TextField t1,t2;
  Button b1;

  LoginKeyListener()
  {
    this.setLayout(new FlowLayout()); 
    Font f = new Font("Verdana",Font.BOLD,28);


    t1 = new TextField(20);//columns
    t2 = new TextField(20);
 
    b1 = new Button("LOGIN");

     t1.setFont(f);
     t2.setFont(f);
   

     b1.setFont(f);
     this.add(t1);
     this.add(t2);
     this.add(b1);
   b1.addKeyListener(this);
   b1.addActionListener(this);
   }

   public void keyTyped(KeyEvent ke){}
   public void keyPressed(KeyEvent ke)
   {
   	  int a =ke.getKeyCode();
   	  if(a == ke.VK_ENTER);
   	    t2.setText(t1.getText());
   }
 	public void keyReleased(KeyEvent ke)
   {
   	int a = ke.getKeyCode();
   	t2.setText(ke.getKeyText(a));

   }

   public void actionPerformed(ActionEvent ae)
   {
     t2.setText(t1.getText());
   }
 public static void main(String[] args)
  {  
   LoginKeyListener l = new LoginKeyListener();
    l.setSize(400,400);//w,h
    l.setTitle("MY FIRST AWT");//string
    l.setVisible(true);
    l.setLocation(100,80);//x,y
    l.setBackground(Color.RED);
    l.addWindowListener(new Events()); 	
  }
}
class Events extends WindowAdapter
{
   public void windowClosing(WindowEvent we)
   {
     System.exit(0);
   }
}
