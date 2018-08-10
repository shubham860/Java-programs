import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingImageChange extends JFrame implements ActionListener
{
	ImageIcon i1,i2;
	JToggleButton b1;

  SwingImageChange()
  {
   this.setLayout(new FlowLayout());
   Font f = new Font("tahoma",Font.BOLD,28);
 
  i1 = new ImageIcon("Chrome.png");
  i2 = new ImageIcon("Mozilla.png");
  b1 = new JToggleButton("NEXT",i1);
  b1.setFont(f);
  this.add(b1);

  b1.addActionListener(this);

  }

  public void actionPerformed(ActionEvent ae)
  {
    if(b1.isSelected())
      {
        b1.setText("PREVIOUS");
      	b1.setIcon(i2);
      }
    else
    {

      b1.setText("NEXT");
      b1.setIcon(i1);

    }

  }
	public static void main(String []ar)
	{
		SwingImageChange s = new SwingImageChange();
		s.setSize(400,400);
		s.setTitle("Color Frame");
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}