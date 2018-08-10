import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SwingLogin extends JFrame implements ActionListener
{   
	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1;


	SwingLogin()
	{
		this.setLayout(new FlowLayout());


		Font f = new Font("tahoma",Font.BOLD,27);


		l1 = new JLabel("USERNAME");
		l2 = new JLabel("PASSWORD");

		t1 = new JTextField(20);
		t2 = new JPasswordField(20);

		b1 = new JButton("LOGIN");

		t1.setToolTipText("ENTER USERNAME");//if we move cursor around textfield 1  username appears
		t2.setToolTipText("ENTER PASSWORD");
		b1.setToolTipText("LOGIN");


		l1.setFont(f);
		l2.setFont(f);
		t1.setFont(f);
		t2.setFont(f);
		b1.setFont(f);
		

		this.add(l1);
		this.add(t1);
        this.add(l2);
        this.add(t2);
        this.add(b1);


       b1.setMnemonic('L');//to create shortcut

       b1.addActionListener(this);

	}


	public void actionPerformed(ActionEvent ae)
	{
       System.out.println(t1.getText());
       System.out.println(t2.getText());

	}


	public static void main(String []ar)
	{
		SwingLogin s = new SwingLogin();
		s.setSize(400,400);
		s.setTitle("Color Frame");
		s.setVisible(true);
		s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}