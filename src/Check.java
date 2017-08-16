import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.JTableHeader;
public class Check extends JFrame implements ActionListener {
	String s22;
	JButton jb1;
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16,j17,j18,j19,j20;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
	String  s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s17,s18,s19,s20,s21,s16;
	JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10,jt11,jt12,jt13,jt14,jt15,jt16,jt17,jt18,jt19,jt20;
	Check(String s22)
	{
		this.s22=s22;
		
		try
		{
			
			this.setSize(1500,1500);
			this.setVisible(true);
		
			Class.forName("com.mysql.jdbc.Driver");
    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","mysql");
    		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    		ResultSet rs=st.executeQuery("select * from emp");	
    		    		    		
    		while(rs.next())
    		{
    			
    			if((rs.getString("s22").equals(s22)))
    					{
    				s1=rs.getString("s1");
    				s2=rs.getString("s2");
    				s3=rs.getString("s3");
    				s4=rs.getString("s4");
    				s5=rs.getString("s5");
    				s6=rs.getString("s6");
    				s7=rs.getString("s7");
    				s8=rs.getString("s8");
    				s9=rs.getString("s9");
    				s10=rs.getString("s10");
    				s11=rs.getString("s11");
    				s12=rs.getString("s12");
    				s13=rs.getString("s13");
    				s14=rs.getString("s14");
    				s15=rs.getString("s15");
    				s16=rs.getString("s16");
    				s17=rs.getString("s17");
    				s18=rs.getString("s18");
    				s19=rs.getString("s19");
    				s20=rs.getString("s20");
    				s21=rs.getString("s21");
    				
	}

}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);			
		}
		System.out.println(s1+s2+s3);
	l1=new JLabel(s1);
	l2=new JLabel(s2);
	l4=new JLabel(s4);
	l5=new JLabel(s5);
	l6=new JLabel(s6);
	l7=new JLabel(s7);
	l8=new JLabel(s8);
	l9=new JLabel(s9);
	l10=new JLabel(s10);
	l11=new JLabel(s11);
	l12=new JLabel(s12);
	l13=new JLabel(s13);
	l14=new JLabel(s14);
	l15=new JLabel(s15);
	l18=new JLabel(s18);
	l19=new JLabel(s19);
	l20=new JLabel(s20);
	l21=new JLabel("Personal Details");
	l1.setBounds(700, 110, 400, 30);
	l2.setBounds(700, 140, 400, 30);
	l4.setBounds(700, 170, 400, 30);
	l5.setBounds(700, 200, 400, 30);
	l6.setBounds(700, 230, 400, 30);
	l7.setBounds(700, 260, 400, 30);
	l8.setBounds(700, 290, 400, 30);
	l9.setBounds(700, 320, 400, 30);
	l10.setBounds(700, 350, 400, 30);
	l11.setBounds(700, 380, 400, 30);
	l12.setBounds(700, 410, 400, 30);
	l13.setBounds(700, 440, 400, 30);
	l14.setBounds(700, 470, 400, 30);
	l15.setBounds(700, 500, 400, 30);
	l18.setBounds(700, 530, 400, 30);
	l19.setBounds(700, 560, 400, 30);
	l20.setBounds(700, 590, 400, 30);	
	l21.setBounds(30, 40, 400, 30);
	//l1.setBounds(700, 110, 400, 30);
		j1=new JLabel("Name");
		j2=new JLabel("Father's/Husband's Name");
		//j3=new JLabel("Date Of Birth");
		j18=new JLabel("Age");
		j19=new JLabel("Gender");
		j20=new JLabel("Marital Status");
		j4=new JLabel("Permanant Adress");
		j5=new JLabel("Present Adress");
		j6=new JLabel("Contact No.");
		j7=new JLabel("Email Id");
		j8=new JLabel("UID No.");
		j9=new JLabel("Pan No.");
		j10=new JLabel("Occupation");
		j11=new JLabel("Gross Income");
		j12=new JLabel("Educational Qualification");
		//j13=new JLabel("Enter password");
		//j14=new JLabel("Opening Date");
		j15=new JLabel("Account Type");
		j16=new JLabel("Nominees Name");
		j17=new JLabel("Relation");
		Container c=this.getContentPane();
	c.setLayout(null);
	c.setBackground(Color.green);
	
		jt1=new JTextField();
		jt1.setBackground(Color.blue);
		jt1.setOpaque(false);
		
		
		jt2=new JTextField();
		jt2.setOpaque(false);
		//jt3=new JTextField();
		jt4=new JTextField();
		jt4.setOpaque(false);
		jt5=new JTextField();
		jt5.setOpaque(false);
		jt6=new JTextField();
		jt6.setOpaque(false);
		jt7=new JTextField();
		jt7.setOpaque(false);
		jt8=new JTextField();
		jt8.setOpaque(false);
		
		jt9=new JTextField();
		jt9.setOpaque(false);
		jt10=new JTextField();
		jt10.setOpaque(false);
		jt11=new JTextField();
		jt11.setOpaque(false);
		jt12=new JTextField();
		jt12.setOpaque(false);
		//jt13=new JTextField();
		//jt14=new JTextField();
		jt15=new JTextField();
		jt15.setOpaque(false);
		jt16=new JTextField();
		jt16.setOpaque(false);
		jt17=new JTextField();
		jt17.setOpaque(false);
		jt18=new JTextField();
		jt18.setOpaque(false);
		jt19=new JTextField();
		jt19.setOpaque(false);
		jt20=new JTextField();
		jt20.setOpaque(false);
		j1.setBounds(20,110,250,30);
		j2.setBounds(20,140,250,30);
		//j3.setBounds(20,170,200,30);
		j18.setBounds(20,170,200,30);
		j19.setBounds(20,200,200,30);
		j20.setBounds(20,230,200,30);
		j4.setBounds(20,260,200,30);
		j5.setBounds(20,290,200,30);
		j6.setBounds(20,320,200,30);
		j7.setBounds(20,350,200,30);
		j8.setBounds(20,380,200,30);
		j9.setBounds(20,410,200,30);
		j10.setBounds(20,440,200,30);
		j11.setBounds(20,470,200,30);
		j12.setBounds(20,500,250,30);
		//j13.setBounds(800,360,200,30);
		//j14.setBounds(800,410,200,30);
		j15.setBounds(20,530,200,30);
	  j16.setBounds(20,560,200,30);
		j17.setBounds(20,590,200,30);
		jt1.setBounds(10,110,1500,30);
		jt2.setBounds(10,140,1500,30);
		//jt3.setBounds(10,170,1500,30);
		jt19.setBounds(10,200,1500,30);
		jt18.setBounds(10,170,1500,30);
		
		//jr1.setBounds(270,310,100,30);
//		jr2.setBounds(370,310,100,30);
		jt20.setBounds(10,230,1500,30);
	//	jr3.setBounds(270,360,100,30);
		//jr4.setBounds(370,360,100,30);
		jt4.setBounds(10,260,1500,30);
		jt5.setBounds(10,290,1500,30);
		jt6.setBounds(10,320,1500,30);
		jt7.setBounds(10,350,1500,30);
		jt8.setBounds(10,380,1500,30);
		jt9.setBounds(10,410,1500,30);
		jt10.setBounds(10,440,1500,30);
		jt11.setBounds(10,470,1500,30);
		jt12.setBounds(10,500,1500,30);
		//jt13.setBounds(1050,360,200,30);
		//jt14.setBounds(1050,410,200,30);
		jt15.setBounds(10,530,1500,30);
		jt16.setBounds(10,560,1500,30);
		jt17.setBounds(10,590,1500,30);
		j1.setFont(new Font("Arial",Font.BOLD,20));
		j2.setFont(new Font("Arial",Font.BOLD,20));
		//j3.setFont(new Font("Arial",Font.BOLD,20));
		j4.setFont(new Font("Arial",Font.BOLD,20));
		j5.setFont(new Font("Arial",Font.BOLD,20));
		j6.setFont(new Font("Arial",Font.BOLD,20));
		j7.setFont(new Font("Arial",Font.BOLD,20));
		j8.setFont(new Font("Arial",Font.BOLD,20));
		j9.setFont(new Font("Arial",Font.BOLD,20));
		j10.setFont(new Font("Arial",Font.BOLD,20));
		j11.setFont(new Font("Arial",Font.BOLD,20));
		j12.setFont(new Font("Arial",Font.BOLD,20));
		//j13.setFont(new Font("Arial",Font.BOLD,20));
		//j14.setFont(new Font("Arial",Font.BOLD,20));
		j15.setFont(new Font("Arial",Font.BOLD,20));
		j16.setFont(new Font("Arial",Font.BOLD,20));
		j17.setFont(new Font("Arial",Font.BOLD,20));
		j18.setFont(new Font("Arial",Font.BOLD,20));
		j19.setFont(new Font("Arial",Font.BOLD,20));
		
		
		j20.setFont(new Font("Arial",Font.BOLD,20));
		
		
		jt1.setFont(new Font("Arial",Font.BOLD,15));
		jt2.setFont(new Font("Arial",Font.BOLD,15));
		//jt3.setFont(new Font("Arial",Font.BOLD,15));
		jt4.setFont(new Font("Arial",Font.BOLD,15));
		jt5.setFont(new Font("Arial",Font.BOLD,15));
		jt6.setFont(new Font("Arial",Font.BOLD,15));
		jt7.setFont(new Font("Arial",Font.BOLD,15));
		jt8.setFont(new Font("Arial",Font.BOLD,15));
		jt9.setFont(new Font("Arial",Font.BOLD,15));
		jt10.setFont(new Font("Arial",Font.BOLD,15));
		
		jt11.setFont(new Font("Arial",Font.BOLD,15));
		jt12.setFont(new Font("Arial",Font.BOLD,15));
	//	jt13.setFont(new Font("Arial",Font.BOLD,15));
		//jt14.setFont(new Font("Arial",Font.BOLD,15));
		jt15.setFont(new Font("Arial",Font.BOLD,15));
		
		jt16.setFont(new Font("Arial",Font.BOLD,15));
		jt17.setFont(new Font("Arial",Font.BOLD,15));
		jt18.setFont(new Font("Arial",Font.BOLD,15));
		jt19.setFont(new Font("Arial",Font.BOLD,15));
		jt20.setFont(new Font("Arial",Font.BOLD,15));
		l1.setFont(new Font("Arial",Font.BOLD,20));
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l4.setFont(new Font("Arial",Font.BOLD,20));
		l5.setFont(new Font("Arial",Font.BOLD,20));
		l6.setFont(new Font("Arial",Font.BOLD,20));
		l7.setFont(new Font("Arial",Font.BOLD,20));
		l8.setFont(new Font("Arial",Font.BOLD,20));
		l9.setFont(new Font("Arial",Font.BOLD,20));
		j10.setFont(new Font("Arial",Font.BOLD,20));
		l11.setFont(new Font("Arial",Font.BOLD,20));
		l12.setFont(new Font("Arial",Font.BOLD,20));
		l13.setFont(new Font("Arial",Font.BOLD,20));
		l14.setFont(new Font("Arial",Font.BOLD,20));
		l15.setFont(new Font("Arial",Font.BOLD,20));
		l18.setFont(new Font("Arial",Font.BOLD,20));
		l19.setFont(new Font("Arial",Font.BOLD,20));
		l20.setFont(new Font("Arial",Font.BOLD,20));
		l21.setFont(new Font("Arial",Font.BOLD,30));
		l21.setForeground(Color.red);
		c.add(j1);
		c.add(j2);
		//c.add(j3);
		c.add(j4);
		c.add(j5);
		c.add(j6);
		c.add(j7);
		c.add(j8);
		c.add(j9);
		c.add(j10);
		c.add(j11);
		c.add(j12);
		///c.add(j13);
		//c.add(j14);
		c.add(j15);
		c.add(j16);
		c.add(j17);
		c.add(j18);
		c.add(j19);
		c.add(j20);
		c.add(jt1);
		c.add(jt2);
		//c.add(jt3);
		c.add(jt4);
		c.add(jt5);
		c.add(jt6);
		c.add(jt7);
		c.add(jt8);
		c.add(jt9);
		c.add(jt10);
		c.add(jt11);
		c.add(jt12);
		//c.add(jt13);
		//c.add(jt14);
		c.add(jt15);
		c.add(jt16);
		c.add(jt17);
		c.add(jt18);
		c.add(jt19);
		c.add(jt20);
		jt1.setEditable(false);
		jt2.setEditable(false);
		jt4.setEditable(false);
		jt5.setEditable(false);
		jt6.setEditable(false);
		jt7.setEditable(false);
		jt8.setEditable(false);
		jt9.setEditable(false);
		jt10.setEditable(false);
		jt11.setEditable(false);
		jt12.setEditable(false);
		jt16.setEditable(false);
		jt17.setEditable(false);
		jt15.setEditable(false);
		jt18.setEditable(false);
		jt19.setEditable(false);
		jt20.setEditable(false);
		l1.setForeground(Color.blue);
		l2.setForeground(Color.blue);
		l4.setForeground(Color.blue);
		l5.setForeground(Color.blue);
		l6.setForeground(Color.blue);
		l7.setForeground(Color.blue);
		l8.setForeground(Color.blue);
		l9.setForeground(Color.blue);
		l10.setForeground(Color.blue);
		l11.setForeground(Color.blue);
		l12.setForeground(Color.blue);
		l13.setForeground(Color.blue);
		l14.setForeground(Color.blue);
		l15.setForeground(Color.blue);
		l18.setForeground(Color.blue);
		l19.setForeground(Color.blue);
		l20.setForeground(Color.blue);
		jb1=new JButton("Account Details");
		jb1.addActionListener(this);
		jb1.setBounds(1200,30,200,30);
		//l21.setForeground(Color.blue);
		
		c.add(l1);
		c.add(l2);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		c.add(l7);
		c.add(l8);
		c.add(l9);
		c.add(l10);
		c.add(l11);
		c.add(l12);
		c.add(l13);
		c.add(l14);
		c.add(l15);
		c.add(l18);
		c.add(l19);
		c.add(l20);
		c.add(l21);
		c.add(jb1);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s90=e.getActionCommand();
		if(s90.equals("Account Details"))
		{
			Balance b=new Balance(s16,s21,s22);
		}
	}

	
	
}
