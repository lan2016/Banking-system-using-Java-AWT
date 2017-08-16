import javax.swing.*;

import java.awt.*;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.event.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Amount extends JFrame implements ActionListener {
	JTextField jt1,jt2;
	JButton jb1,jb2;
	Amount()
	{
		this.setSize(1500,1500);
		this.setVisible(true);
		Container c=this.getContentPane();
		c.setBackground(Color.CYAN);
		this.setLayout(null);
		jt1=new JTextField("Enter Account Number");
		jt2=new JTextField("Enter Amount");
	
		
		jb1=new JButton("DEPOSIT");
		jb2=new JButton("RESET");
		
		jt1.setBounds(570,200,300,40);
		
		jt2.setBounds(570,270,300,40);
		
		jt1.setFont(new Font("Arial",Font.BOLD,15));
		jt2.setFont(new Font("Arial",Font.BOLD,15));
	
	
		Border b=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.blue,Color.green);
		jb1.setBorder(b);
		jb2.setBorder(b);
		jb1.setBounds(600, 400, 200, 40);
		jb2.setBounds(800, 400, 200, 40);
		
		
		
	
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
		if(s.equals("DEPOSIT"))
		{
			String s1=jt1.getText();
			String s2=jt2.getText();
			Double a=Double.parseDouble(s2);
				try
				{
					
				
					Class.forName("com.mysql.jdbc.Driver");
		    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","mysql");
		    		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		    		ResultSet rs=st.executeQuery("select * from emp");	
		    			
		              // int c=st.executeUpdate(updateemp);
		    		while(rs.next())
		    		{
		    		if(rs.getString("s22").equals(s1))
		    		{
		    			Double d=Double.parseDouble(rs.getString("s21"));
		    			System.out.println("d="+d);
		    			String updateemp="update emp set s21='"+(a+d)+"' where s22='"+s1+"'";
			    		int k=st.executeUpdate(updateemp);
			    		System.out.println(k);
			    		String s5=a+" Rs "+"Succesfully Sumbitted to "+s1;
			    		JOptionPane.showMessageDialog(null,s5);
			    		//String s6="Your Account Balance is " +(a-b);
			    		Rebank2 b=new Rebank2();
			    		//JOptionPane.showMessageDialog(null,s6);
			    		this.setVisible(false);
			    		
			    		//Login l1=new Login();
			    		//break;
		    		}
		    	
		    		}
		    		rs.first();
		    		if(rs.getString("s22").equals(s1))
		    		{
		    			
		    		}
		    		else
		    		{
		    			JOptionPane.showMessageDialog(null,"Invalid Account Number");
		    		}
		    		
		}
				catch(Exception e1)
				{
					//JOptionPane.showMessageDialog(null,e1);
				}
		}

		if(s.equals("RESET"))
		{
			jt1.setText(null);
			jt2.setText(null);
		}
	}

}
