import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener{
	JButton j1,j2;
	Home()
	{
		this.setSize(320,400);
		this.setVisible(true);
		Container c=this.getContentPane();
		c.setLayout(new BorderLayout());
		j1=new JButton("PERSONAL BANKING");
		j2=new JButton("AUTHORIZED BANKING");
			c.setBackground(Color.blue);
		this.setResizable(false);
		j1.addActionListener(this);
		j2.addActionListener(this);
		j1.setBackground(Color.red);
		j2.setBackground(Color.red);
		c.add("East",j1);
		c.add("West",j2);
	
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("AUTHORIZED BANKING"))
				{
			Cpr c=new Cpr();
			this.setVisible(false);
				}
		if(s.equals("PERSONAL BANKING"))
		{
			Login l=new Login();
			this.setVisible(false);
		}
	}
	public static void main(String args[])
	{
		Home h=new Home();
	}

}
