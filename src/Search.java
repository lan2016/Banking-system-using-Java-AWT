import java.sql.*;

import javax.swing.JOptionPane;
public class Search  {
String s16,s22;
String  s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s17,s18,s19,s20,s21;
	Search(String s22,String s16)
	{
		this.s22=s22;
		this.s16=s16;
		try
		{
			
		
			Class.forName("com.mysql.jdbc.Driver");
    		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","mysql");
    		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
    		ResultSet rs=st.executeQuery("select * from emp");	
    		    		    		
    		while(rs.next())
    		{
    			
    			if((rs.getString("s22").equals(s22))&&(rs.getString("s16").equals(s16)))
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
    				//s16=rs.getString("s16");
    				s17=rs.getString("s17");
    				s18=rs.getString("s18");
    				s19=rs.getString("s19");
    				s20=rs.getString("s20");
    				s21=rs.getString("s21");
    			//s22=rs.getString("s22");
    				System.out.println(s16+s22);			
    				JOptionPane.showMessageDialog(null,"ACCOUNT FOUND");
    				
    				User u1=new User(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22);
 System.out.println( s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12+s13+s14+s15+s17+s18+s19+s20+s21+s22+s16);
 System.out.println(s22);
// System.exit(0);
 

    		   		//JOptionPane.showMessageDialog(null,"ACCOUNT FOUND");
    					}
    			
    			
    		}
    	
    		rs.first();	
    		System.out.println(s22+s16);
    		System.out.println(rs.getString("s22")+rs.getString("s16"));
    	    if(!(rs.getString("s22").equals(s22))&&!(rs.getString("s16").equals(s16)))
    	    		{
    	    	
    	    			
			}
		else
		{
			JOptionPane.showMessageDialog(null,"Invalid User ID or PassWord");
    	
 }
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
			JOptionPane.showMessageDialog(null,e);
		}
	}
}
