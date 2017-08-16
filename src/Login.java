import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.event.*;
public class Login extends JFrame implements ActionListener {
	JTextField jf1;
	TextField jf2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
	JLabel j1;
	JLabel jl1,jl2;
	Login()
	{
		
		Container c=this.getContentPane();
	
		this.setSize(1500,1500);
		
		this.setVisible(true);
		this.setLayout(null);
	
		c.setBackground(Color.magenta);
		j1=new JLabel("Personal Banking Login");
		j1.setFont(new Font("Arial",Font.BOLD,30));
		j1.setForeground(Color.BLUE);
		j1.setBounds(500,40,600,40);
		jf1=new JTextField( "Account No");
		jf2=new TextField("Password");
		//jf2.setText(String.valueOf("Password"));
		jf1.setFont(new Font("Arial",Font.BOLD,15));
		jf2.setFont(new Font("Arial",Font.BOLD,15));
		//jf2.setEchoChar('*');	
		jf1.setBounds(500,150,250,40);
		jf2.setBounds(500,220,250,40);
		jb1=new JButton("LOGIN");
		jb2=new JButton("RESET");
	
		
		jb3=new JButton("Back",new ImageIcon("back5.png"));

		jb4=new JButton("New User",new ImageIcon("user.png"));
		jb5=new JButton("Forgot Password",new ImageIcon("forgot-password.png"));
		jb6=new JButton("Help",new ImageIcon("help-153094_960_720.png"));
		jb7=new JButton("Contatct Us",new ImageIcon("contact-icon-196.jpg"));
		//jb3.setBackground(Color.magenta);
		Border b=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.blue,Color.green);
		jb1.setBorder(b);
		jb2.setBorder(b);
		jb3.setFont(new Font("Arial",Font.BOLD,20));
		jb3.setForeground(Color.BLUE);
		jb4.setFont(new Font("Arial",Font.BOLD,20));
		jb4.setForeground(Color.BLUE);
		jb5.setFont(new Font("Arial",Font.BOLD,20));
		jb5.setForeground(Color.BLUE);
		jb6.setFont(new Font("Arial",Font.BOLD,20));
		jb6.setForeground(Color.BLUE);
jb7.setFont(new Font("Arial",Font.BOLD,20));
		jb7.setForeground(Color.BLUE);
		jb3.setOpaque(false);
		jb3.setContentAreaFilled(false);
		jb3.setBorderPainted(false);
		jb3.setBackground(Color.magenta);
jb4.setOpaque(false);
		jb4.setContentAreaFilled(false);
		jb4.setBorderPainted(false);
		jb4.setBackground(Color.magenta);
jb5.setOpaque(false);
		jb5.setContentAreaFilled(false);
		jb5.setBorderPainted(false);
		jb5.setBackground(Color.magenta);
jb6.setOpaque(false);
		jb6.setContentAreaFilled(false);
		jb6.setBorderPainted(false);
		jb6.setBackground(Color.magenta);
jb7.setOpaque(false);
		jb7.setContentAreaFilled(false);
		jb7.setBorderPainted(false);
		jb7.setBackground(Color.magenta);

		//jb3.setDebugGraphicsOptions(arg0);
		jb3.setHorizontalAlignment(SwingConstants.LEFT);
jb4.setHorizontalAlignment(SwingConstants.LEFT);
jb5.setHorizontalAlignment(SwingConstants.LEFT);
jb6.setHorizontalAlignment(SwingConstants.LEFT);
jb7.setHorizontalAlignment(SwingConstants.LEFT);
		//jb3.setHorizontalTextPosition(SwingConstants.LEFT);
		//jb3.setVerticalTextPosition(SwingConstants.CENTER);
		jb1.setBounds(800,300,100,40);
		jb2.setBounds(920,300,100,40);
		jb3.setBounds(50,150,250,60);
		jb4.setBounds(50,230,250,60);
		jb5.setBounds(50,310,300,50);
		jb6.setBounds(50,380,250,60);
		jb7.setBounds(50,460,250,50);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jf1.addActionListener(this);
		jf2.addActionListener(this);
		
		c.add(j1);
		c.add(jf1);
		c.add(jf2);
		c.add(jb1);
		c.add(jb2);
		c.add(jb3);
		c.add(jb4);
		c.add(jb5);
		c.add(jb6);
		c.add(jb7);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("LOGIN"))
		{
			String s56,s57;
			s56=jf1.getText();
			s57=jf2.getText();
			
		Search SE =new Search(s56,s57);
		this.setVisible(false);
		}
		if(s.equals("RESET"))
		{
			jf1.setText(null);
jf2.setText(null);
		}
		System.out.println(jf2.getText());
		if(s.equals("Back"))
		{
		Rebank2 r=new Rebank2();
		this.setVisible(false);
		}
		if(s.equals("New User"))
		{
			Signup su=new Signup();
			this.setVisible(false);
		}
		if(s.equals("Forgot Password"))
		{
			
		}
		if(s.equals("Help"))
		{
			
		}
		if(s.equals("Contact Us"))
		{
			
		}
		
	
		
	}

public static void main(String args[])
{
Login l=new Login();	
//l.setOpacity(0.55f);
System.out.println(l.getOpacity());
}
}