import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Deposit extends JFrame implements ActionListener {
	JButton jb;
	Deposit()
	{
		this.setVisible(true);
		this.setSize(400, 400);
		this.setLayout(null);
		jb=new JButton("Deposit Amount");
		Container c=this.getContentPane();
		c.add(jb);
		this.setResizable(false);
		jb.setBounds(10,100,380,40);
		jb.setBackground(Color.green);
		c.setBackground(Color.orange);
		jb.addActionListener(this);
	}
public void actionPerformed(ActionEvent e)
{
	String s=e.getActionCommand();
	if(s.equals("Deposit Amount"))
	{
		Amount a=new Amount();
		this.setVisible(false);
	}
}
}
