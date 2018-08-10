import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingImage extends JFrame implements ActionListener
{
	ImageIcon i1;
	JButton b1;

  SwingImage()
  {
   this.setLayout(new FlowLayout());
   Font f = new Font("tahoma",Font.BOLD,28);
 
  i1 = new ImageIcon("Chrome.png");
  b1 = new JButton("NEXT",i1);
  b1.setFont(f);
  this.add(b1);

  b1.addActionListener(this);

  }

  public void actionPerformed(ActionEvent ae)
  {
      if(b1.isSelected())
      	b1.setIcon(i1);
  }
	public static void main(String []ar)
	{
		SwingImage s = new SwingImage();
		s.setSize(400,400);
		s.setTitle("Color Frame");
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}