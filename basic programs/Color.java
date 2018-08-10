import java.awt.*;
import java.awt.event.*;
class Color extends Frame
{
	public void paint(Graphics g)
	{
		g.setColor(new Color(255,0,0));
		g.drawRect(100,80,300,230);//x,y,w,h	
		g.fillRect(100,80,300,230);//x,y,w,h
		g.setColor(new Color(0,255,0));
		g.fillOval(110,90,280,200);//x,y,w,h
		g.setColor(new Color(0,0,255));
		g.drawLine(120,125,120,190);//x1,y1,x2,y2
        g.setFont(new Font("verdana",Font.BOLD,28));
        g.drawString("LUCKY",10,10);//str,x,y
        g.setColor(new Color(255,0,255));
        g.drawArc(130,145,200,100,0,100);//x,y,w,h,sa,ea
	}

	public static void main(String []ar)
	{
		Color a = new Color();
		a.setSize(400,400);
		a.setTitle("Color Frame");
		a.setVisible(true);
		a.addWindowListener(new Events());
	}
}

class Events extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}