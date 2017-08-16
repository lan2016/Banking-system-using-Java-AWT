import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.event.*;
public class Withdrawl extends JFrame implements ActionListener {
	JTextField jt1;
	JLabel l,l1;
	Container c;
JButton jb1;
String s21,s22;
Double a,b;
	Withdrawl(String s21,String s22)
	{
		this.s21=s21;
		this.s22=s22;
		this.setSize(1200,1200);
		this.setVisible(true);
 c=this.getContentPane();
		c.setBackground(Color.white);
		this.setLayout(null);
		l=new JLabel("Enter Amount To Withdrawl");
		jt1=new JTextField();
		l.setBounds(250,200,400,40);
		l.setFont(new Font("Arial",Font.BOLD,30));
		l.setForeground(Color.blue);
		jt1.setBounds(670,200,250,40);
		jt1.setFont(new Font("Arial",Font.BOLD,15));
		//jt1.setBackground(Color.blue);
		jb1=new JButton("Continue");
		jb1.setBounds(700,250,100,40);
		Border b=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.blue,Color.green);
		jb1.setBorder(b);
		c.add(jt1);
		c.add(l);
		c.add(jb1);
		jt1.addActionListener(this);
		jb1.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		String s1=jt1.getText();
		if(s.equals("Continue"))
		{
		a=Double.parseDouble(s21);
		b=Double.parseDouble(s1);
			if(a>b)
			{
				
				if(b>=0)
				{String s5="Your Account Balance is= " +a;
				JOptionPane.showMessageDialog(null,s5);
				String s6="After detuction balance is "+ (a-b);
				JOptionPane.showMessageDialog(null,s6);
				try
				{
					
				
					Class.forName("com.mysql.jdbc.Driver");
		    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","mysql");
		    		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		    		ResultSet rs=st.executeQuery("select * from emp");	
		    		String updateemp="update emp set s21='"+(a-b)+"' where s22='"+s22+"'";	
		               int c=st.executeUpdate(updateemp);
		    		System.out.println(c);
		    		this.setVisible(false);
		    		Login l1=new Login();
				}
				
			
				catch(Exception e1)
				{
				System.out.println(e1);	
				}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Enter Valid Amount ");
					this.setVisible(false);
				}
			}
			else if(a<b)
			{
				
				JOptionPane.showMessageDialog(null,"You Have Not Sufficient Balance ");
				this.setVisible(false);
			}
			else
			{
				System.out.println(a);
				System.out.println(b);
				
				if(b>=0)
				{
					String s5="Your Account Balance is= " +a;
					JOptionPane.showMessageDialog(null,s5);
					String s6="After detuction balance is "+ (a-b);
					JOptionPane.showMessageDialog(null,s6);
				try
				{
					
				
					Class.forName("com.mysql.jdbc.Driver");
		    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","mysql");
		    		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		    		ResultSet rs=st.executeQuery("select * from emp");	
		    		String updateemp="update emp set s21='"+(a-b)+"' where s22='"+s22+"'";	
		               int c=st.executeUpdate(updateemp);
		    		System.out.println(c);
		    		this.setVisible(false);
		    		Login l=new Login();
				}
				
			
				catch(Exception e1)
				{
				System.out.println(e1);	
				}
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Enter Valid Number ");
				}
		
			}
		
			
			
			
		}
	}
	}
