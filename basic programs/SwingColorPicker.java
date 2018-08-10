import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingColorPicker extends JFrame implements ActionListener
{
	JTextArea ta;
	JButton b1;
  SwingColorPicker()
  {
     this.setLayout(new FlowLayout());
     Font f = new Font("tahoma",Font.BOLD,28);

     ta = new JTextArea(5,20);//rows,columns
     b1 = new JButton("open color");

     ta.setFont(f);
     b1.setFont(f);

     this.add(ta);
     this.add(b1);

     b1.addActionListener(this);
  } 

  public void actionPerformed(ActionEvent ae)
  {
  	Color cl = null;
  	cl = JColorChooser.showDialog(this,"PICK A COLOR",cl);
  	ta.setBackground(cl);
  }

   public static void main(String []ar)
	{
		SwingColorPicker s = new SwingColorPicker();
		s.setSize(400,400);
		s.setTitle("Color Chooser");
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}