import java.sql.*;
import java.util.*;

import javax.swing.JOptionPane;
public class Data_Base  {
	String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20;
	int s21,s22;
	Data_Base(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15,String s16,String s17,String s18,String s19,String s20)
	{
		
		this.s21=0;
		this.s22=0;
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		this.s4=s4;
		this.s5=s5;
		this.s6=s6;
		this.s7=s7;
		this.s8=s8;
		this.s9=s9;
		this.s10=s10;
		this.s11=s11;
		this.s12=s12;
		this.s13=s13;
		this.s14=s14;
		this.s15=s15;
		this.s16=s16;
		this.s17=s17;
		this.s18=s18;
		this.s19=s19;
		this.s20=s20;
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","mysql");
    		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    		String insertValue="insert into emp values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"','"+s14+"','"+s15+"','"+s16+"','"+s17+"','"+s18+"','"+s19+"','"+s20+"','"+s21+"','"+s21+"')";
    		int up=st.executeUpdate(insertValue);
    		ResultSet rs=st.executeQuery("select * from emp");	
    		
    			rs.last();
    		String s0=rs.getString("s22");
    		System.out.println(s0);
    		
    		
    		String s=" Your Account Succesfully Created,Your Account No .is "+s0;
    		
    		JOptionPane.showMessageDialog(null,s);
    	
    		
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
			JOptionPane.showMessageDialog(null,e);
		}
	}
}
