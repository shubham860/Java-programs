import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingTextArea extends JFrame implements ActionListener
{
	JTextArea ta;
	JCheckBox c1,c2,c3;
   SwingTextArea()
   {
     this.setLayout(new FlowLayout());
     Font f = new Font("tahoma",Font.BOLD,28);

     ta = new JTextArea(5,20);//rows,columns
     c1 = new JCheckBox("JAVA");
     c2 = new JCheckBox("AWT");
     c3 = new JCheckBox("SWING");

     ta.setFont(f);
     c1.setFont(f);
     c2.setFont(f);
     c3.setFont(f);

     this.add(c1);
     this.add(c2);
     this.add(c3);
     this.add(ta);

     c1.addActionListener(this);
     c2.addActionListener(this);
     c3.addActionListener(this);

   }

   public void actionPerformed(ActionEvent ae)
   {
   	if(ae.getSource() == c1)
      ta.setText(c1.getText());

   	if(ae.getSource() == c2)
      ta.setText(c2.getText());

   	if(ae.getSource() == c3)
      ta.setText(c2.getText());
   }

  public static void main(String []ar)
	{
		SwingTextArea s = new SwingTextArea();
		s.setSize(400,400);
		s.setTitle("Text Area Frame");
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}