import java.sql.*;

import javax.swing.JOptionPane;
public class Remove {
	

	String s22;
Remove(String s22)
{
this.s22=s22;
try
{
	

	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdata","root","mysql");
	Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	ResultSet rs=st.executeQuery("select * from emp");	
		
      // int c=st.executeUpdate(updateemp);
	while(rs.next())
	{
	if(rs.getString("s22").equals(s22))
	{
		rs.deleteRow();
		JOptionPane.showMessageDialog(null,"Successfully Removed");
		JOptionPane.showMessageDialog(null,"thanks For using our Services");
	}
}
}
catch(Exception e){
	JOptionPane.showMessageDialog(null,e);
	
}
}
}
