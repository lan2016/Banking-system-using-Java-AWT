import java.awt.Container;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JTable;


public class Mytable extends JFrame {
	
	String  s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s17,s18,s19,s20,s21,s16;

	public Mytable(String s1, String s2, String s3, String s4, String s5,
			String s6, String s7, String s8, String s9, String s10, String s11,
			String s12, String s13, String s14, String s15, String s16,
			String s17, String s18, String s19, String s20, String s21) {
		
		this.setSize(1500,1500);
		this.setVisible(true);
		
		Vector v=new Vector();
		Vector data=new Vector();
		v.add("Rajat");
		v.add("bansal");
		v.add(data);
		Vector cols=new Vector();
		cols.add("Gt");
		JTable jt=new JTable(data,cols);
		jt.setRowHeight(30);
		Container c=this.getContentPane();
		c.add(jt);
		
	}

}
