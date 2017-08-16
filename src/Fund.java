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
public class Fund extends JFrame implements ActionListener {
	JTextField jf;
	String s21,s22;
JButton jb1;
Double a,b;
	Fund(String s21,String s22)
	{
		this.s21=s21;
		this.s22=s22;
		Container c=this.getContentPane();
		this.setSize(400,500);
		this.setVisible(true);
		jf=new JTextField("Enter Amount");
		
		this.setLayout(null);
		jf.setBounds(120, 150, 150, 30);
		c.setBackground(Color.cyan);
		jf.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
		jb1=new JButton("Continue");
		//jb1.setBounds(700,250,100,40);
		Border b=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.green,Color.green);
		jb1.setBorder(b);
		jb1.setBounds(280, 200, 100, 40);
		c.add(jf);
		c.add(jb1);
		this.setResizable(false);
		jb1.addActionListener(this);
		jf.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		String s1=jf.getText();
		if(s.equals("Continue"))
		{
		a=Double.parseDouble(s21);
		b=Double.parseDouble(s1);
			if(a>b)
			{
				
				if(b>=0)
				{String s5="Your Account Balance is= " +a;
				JOptionPane.showMessageDialog(null,s5);
				Transfer t=new Transfer(s22,b,a);
				this.setVisible(false);
				//String s6="After detuction balance is "+ (a-b);
				//JOptionPane.showMessageDialog(null,s6);
			
		    		//this.setVisible(false);
				}
				
			
						
				else
				{
					JOptionPane.showMessageDialog(null,"Enter Valid Amount ");
				}
			}
			else if(a<b)
			{
				
				JOptionPane.showMessageDialog(null,"Balance Is Too Low For Transaction" );
			}
			else
			{
				System.out.println(a);
				System.out.println(b);
				
				if(b>=0)
				{
					String s5="Your Account Balance is= " +a;
					JOptionPane.showMessageDialog(null,s5);
					Transfer tr=new Transfer(s22,b,a);
					this.setVisible(false);
					//String s6="After detuction balance is "+ (a-b);
					//JOptionPane.showMessageDialog(null,s6);
					}
				else
				{
					JOptionPane.showMessageDialog(null,"Enter Valid Amount ");
				}
		
			}
		
			
			
			
		}
	}
}
	
	



