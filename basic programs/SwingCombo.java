import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingCombo extends JFrame implements ActionListener
{   
	JComboBox cb;
	SwingCombo()
	{

       this.setLayout(new FlowLayout());
       Font f = new Font("Tahoma",Font.BOLD,27);

       cb = new JComboBox();

       for(int i=1 ;i<=31;i++)
       cb.addItem(""+i);
       this.add(cb);
       cb.addActionListener(this);

    }
   public void actionPerformed(ActionEvent ae)
   {
   	System.out.println(cb.getSelectedItem());
   }

public static void main(String []ar)
	{
		SwingCombo s = new SwingCombo();
		s.setSize(400,400);
		s.setTitle("Color Frame");
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}