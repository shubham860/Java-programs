import java.awt.*;
import java.awt.event.*;
class Login extends Frame implements ActionListener
{

  Label l1,l2;
  TextField t1,t2,t3;
  Button b1;

  Login()
  {
    this.setLayout(new FlowLayout()); 
    Font f = new Font("Verdana",Font.BOLD,28);


    l1 = new Label("username");
    l2 = new Label("password");
   /* l3 = new Label("                                         ");*/


    t1 = new TextField(20);//columns
    t2 = new TextField(20);
    t3 = new TextField(20);
    b1 = new Button("LOGIN");

     l1.setFont(f);
     l2.setFont(f);
    /* l3.setFont(f);*/
     t1.setFont(f);
     t2.setFont(f);
     t3.setFont(f);

     b1.setFont(f);

      t1.setForeground(new Color(255,0,0));
    t2.setForeground(new Color(255,0,0));
t3.setForeground(new Color(255,0,0));

    t1.setBackground(new Color(0,255,255));
    t2.setBackground(new Color(0,255,255));
    t3.setBackground(new Color(0,255,255));

    t2.setEchoChar('*');


     this.add(l1);
     this.add(t1);
     this.add(l2);
     this.add(t2);
     this.add(b1);
    this.add(t3);
     b1.addActionListener(this);
  }
  
  public void actionPerformed(ActionEvent ae)
  {
     String user = t1.getText();
     String pass = t2.getText();

     if(user.equals("shubham") && pass.equals("chauhan"))
    /*  l3.setText("welcome");*/
     t3.setText("welcome");
    else
    {
      t3.setText("incorrect user and pass");
      t1.setText("");
      t2.setText("");
      t1.requestFocus();

    }

  }



 public static void main(String[] args)
  {
    
    Login l = new Login();
    l.setSize(300,300);//w,h
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