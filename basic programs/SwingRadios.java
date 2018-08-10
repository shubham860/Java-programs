import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingRadios extends JFrame implements ActionListener
{   
	JRadioButtton r1,r2;
	ButtonGroup bg;
	JButtton b1;

	SwingRadios()
	{
		this.setLayout(new FlowLayout());
		Font f = new Font("tahoma",Font.BOLD,28);

        r1 = new JRadioButton("I ACCEPT");
        r2 = new JRadioButton("I DON'T ACCEPT",true);//already tick at r2

        b1 = new JButton("NEXT");
        b1.setEnabled(false);//to faid the button
       
        bg.add(r1);//to choose either r1 or r2
        bg.add(r2);

        r1.setFont(f);
        r2.setFont(f);
        b1.setFont(f);
        

        this.add(r1);
        this.add(r2);
        this.add(b1);

        r1.addActionListener();
        r2.addActionListener();
        b1.addActionListener();

	}
      
      public void actionPerformed(ActionEvent ae)
      {
      	if(ae.getSource() == r1)
      	{
      	   b1.setEnabled(true);
      	}

      	if(ae.getSource() == r2)
      	{
      	   b1.setEnabled(false);
      	}

      	if(ae.getSource() == b1)
      	{
      	  JOptionPane.showMessageDialog(this,"HELLO SWING","MY APP",JOptionPane.ERROR_MESSAGE); 
      	}
      }

	public static void main(String []ar)
	{
		SwingRadios r = new SwingRadios();
		r.setSize(400,400);
		r.setTitle("Radio Button Frame");
		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}