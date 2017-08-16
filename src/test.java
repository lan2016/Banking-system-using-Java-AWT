import javax.swing.*;
import java.awt.*;
public class test extends JFrame {
	static JProgressBar b;
	public static void main(String args[])
	{
		
		
		test t=new test();
		
		t.setSize(300,300);
		t.setVisible(true);
     	b=new JProgressBar(0,200);
		b.setStringPainted(true);
		Container c=t.getContentPane();
		c.setLayout(new FlowLayout());
		t.delay();
		
		c.add(b);
	}

	private void delay() {
		for(int i=0;i<=200;i+=8)
		{
			b.setValue(i);
			try
			{
				Thread.sleep(20);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
			}
}
