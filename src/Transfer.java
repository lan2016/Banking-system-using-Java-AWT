import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.event.*;
public class Transfer extends JFrame implements ActionListener {
	Double a,b,d;
	String s22,s221;
	JTextField jf;
	JButton jb1;
		public Transfer(String s22, Double b, Double a) {
			this.s22=s22;
			this.a=a;
			this.b=b;
			this.setSize(400,500);
			this.setVisible(true);
			Container c=this.getContentPane();
			jf=new JTextField("Transferable Account No");
			
			this.setLayout(null);
			jf.setBounds(120, 150, 230, 30);
			c.setBackground(Color.pink);
			jf.setFont(new Font("Arial",Font.ROMAN_BASELINE,20));
			jb1=new JButton("Continue");
			//jb1.setBounds(700,250,100,40);
			Border e=BorderFactory.createBevelBorder(BevelBorder.RAISED,Color.green,Color.green);
			jb1.setBorder(e);
			jb1.setBounds(280, 200, 100, 40);
			c.add(jf);
			c.add(jb1);
			this.setResizable(false);
			jb1.addActionListener(this);
			jf.addActionListener(this);
			
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		}
		public void actionPerformed(ActionEvent e)
		{
			String s=e.getActionCommand();
			s221=jf.getText();
			if(s.equals("Continue"))
			{
				try
				{
					
				
					Class.forName("com.mysql.jdbc.Driver");
		    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","mysql");
		    		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		    		ResultSet rs=st.executeQuery("select * from emp");	
		    			
		              // int c=st.executeUpdate(updateemp);
		    		while(rs.next())
		    		{
		    		if(rs.getString("s22").equals(s221))
		    		{
		    			d=Double.parseDouble(rs.getString("s21"));
		    			System.out.println("d="+d);
		    			String updateemp="update emp set s21='"+(a-b)+"' where s22='"+s22+"'";
			    		int k=st.executeUpdate(updateemp);
			    		System.out.println(k);
			    		String updateemp1="update emp set s21='"+(d+b)+"' where s22='"+s221+"'";
			    		int l=st.executeUpdate(updateemp1);
			    		System.out.println(l);
			    		String s5=b+" Rs "+"Transferred To Account"+s221;
			    		JOptionPane.showMessageDialog(null,s5);
			    		String s6="Your Account Balance is " +(a-b);
			    		
			    		JOptionPane.showMessageDialog(null,s6);
			    		this.setVisible(false);
			    		
			    		Login l1=new Login();
			    		break;
		    		}
		    	
		    		}
		    		rs.last();
		    		if(rs.getString("s22").equals(s221))
		    		{
		    			
		    		}
		    		else
		    		{
		    			JOptionPane.showMessageDialog(null,"Invalid Account Number");
		    		}
		    		
		    		
		    		
		    		
		    	
		    		
		    		this.setVisible(false);
		    			}
				
			
				catch(Exception e1)
				{
				System.out.println(e1);	
				}
			}
			
		}

}
