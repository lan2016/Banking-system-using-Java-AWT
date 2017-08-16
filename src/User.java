import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import javax.swing.event.*;
public class User extends JFrame implements ActionListener {
JLabel l1,l2,l3;
JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
String  s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s17,s18,s19,s20,s21,s22,s16;
public User(String s1, String s2, String s3, String s4, String s5,String s6, String s7, String s8, String s9, String s10, String s11,String s12, String s13, String s14, String s15, String s16,	String s17, String s18, String s19, String s20, String s21,String s22) {
		System.out.println( s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12+s13+s14+s15+s17+s18+s19+s20+s21+s22+s16);
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
		this.s21=s21;
		this.s22=s22;
		
		Container c=this.getContentPane();
		this.setSize(1500,1500);
		this.setVisible(true);
		this.setLayout(null);
		c.setBackground(Color.yellow);
		l1=new JLabel("WELCOME TO STAR BANK OF INDIA");
		l1.setFont(new Font("Arial",Font.BOLD,30));
		l1.setForeground(Color.blue);
		l1.setBounds(20,40,700,30);
		//l2=new JLabel(s1);
		l3=new JLabel(s1+"(online)");
		l3.setBounds(1000,40,400,30);
		l3.setForeground(Color.RED);
		l3.setFont(new Font("Arial",Font.BOLD,20));
		JPanel p=new JPanel();
		p.add(new rect());
		
//		p.setLocation(300,300);
		
		p.setBounds(0, 100, 1500, 50);
		p.setBackground(Color.red);
		jb3=new JButton("Back",new ImageIcon("back6.png"));

		jb4=new JButton("Withdrawl Amount",new ImageIcon("withdrawal_icon1.jpg"));
		jb5=new JButton("Fund Transfer",new ImageIcon("31395892-global-money-transfer-concept-with-coins1.jpg"));
		jb6=new JButton("Check Profile",new ImageIcon("9750068-High-resolution-green-profile-icon-on-white-background--Stock-Photo1.jpg"));
		jb7=new JButton("Remove Account",new ImageIcon("delete1.png"));
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
	jb3.setBounds(50,150,250,60);
	jb4.setBounds(50,230,400,60);
	jb5.setBounds(50,310,300,50);
	jb6.setBounds(50,380,250,60);
	jb7.setBounds(50,460,250,50);
	jb3.addActionListener(this);
	jb4.addActionListener(this);
	jb5.addActionListener(this);
	jb6.addActionListener(this);
	jb7.addActionListener(this);
	ClassLoader cl=this.getClass().getClassLoader();
	ImageIcon i=new ImageIcon(cl.getResource("nam3.jpg"));
	l2=new JLabel(i);
	l2.setBounds(400, 60, 800, 720);

		this.add(p);
		//c.add(new rect());
		c.add(l1);
		c.add(l2);
		c.add(jb3);
		c.add(jb4);
		c.add(jb5);
		c.add(jb6);
		c.add(jb7);
		c.add(l3);
	}
	public void actionPerformed(ActionEvent e)
	{
	String s=e.getActionCommand();
	if(s.equals("Back"))
	{
		Login l=new Login();
		this.setVisible(false);
	}
	if(s.equals("Withdrawl Amount"))
	{
		
		Withdrawl w=new Withdrawl(s21,s22);
		//this.setVisible(false);
		this.setVisible(false);
		
	}
	if(s.equals("Fund Transfer"))
	{
		Fund f=new Fund(s21,s22);
		this.setVisible(false);
		//Login l=new Login();
	}
	if(s.equals("Check Profile"))
	{
		Check c=new Check(s22);
	}
	if(s.equals("Remove Account"))
	{
		Remove r=new Remove(s22);
		this.setVisible(false);
		Login l=new Login();
	}	
		//System.out.println( s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12+s13+s14+s15+s17+s18+s19+s20+s21+s22+s16);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}




}
class rect extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		g.setColor(Color.black);
		g.fillRect(0, 100, 1500, 50);
		this.revalidate();
		
	}
}