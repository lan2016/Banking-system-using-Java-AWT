import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Cpr extends JFrame implements ActionListener {
	JTextField jt1;
	TextField jt2;
	JLabel j1,j2,j;
	JButton jb1,jb2;
	Cpr()
	{
		this.setSize(1500,1500);
		this.setVisible(true);
		Container c=this.getContentPane();
		c.setBackground(Color.CYAN);
		this.setLayout(null);
		jt1=new JTextField();
		jt2=new TextField();
		j=new JLabel("CORPORATE BANKING LOGIN");
		j1=new JLabel("Enter User Id");
		j2=new JLabel("Enter Pasword");
		jb1=new JButton("LOGIN");
		jb2=new JButton("RESET");
		j1.setBounds(300,200,200,30);
		jt1.setBounds(530,200,200,30);
		j2.setBounds(300,230,200,30);
		jt2.setBounds(530,230,200,30);
		j.setBounds(400, 30, 600, 30);
		jt1.setFont(new Font("Arial",Font.BOLD,15));
		jt2.setFont(new Font("Arial",Font.BOLD,15));
		j1.setFont(new Font("Arial",Font.BOLD,15));
		j2.setFont(new Font("Arial",Font.BOLD,15));
		j.setFont(new Font("Arial",Font.BOLD,30));
		Border b=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.blue,Color.green);
		jb1.setBorder(b);
		jb2.setBorder(b);
		jb1.setBounds(450, 300, 100, 30);
		jb2.setBounds(550, 300, 100, 30);
		jt2.setEchoChar('*');
		j.setForeground(Color.red);
		c.add(j1);
		c.add(j2);
		c.add(j);
		c.add(jt1);
		c.add(jt2);
		c.add(jb1);
		c.add(jb2);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("LOGIN"))
		{
			String s1=jt1.getText();
			String s2=jt2.getText();
			if(s1.equals("rajat")&&s2.equals("bansal"))
			{
				Deposit d=new Deposit();
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Invalid User Id or Password");
			}
		}
		if(s.equals("RESET"))
		{
			jt1.setText(null);
			jt2.setText(null);

		}
	}

}
