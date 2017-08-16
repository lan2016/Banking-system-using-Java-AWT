import javax.swing.*;

import java.awt.*;

import javax.swing.event.*;

public class Balance extends JFrame {
	JTextField jt1,jt2,jt3;
	JLabel l,l1,l2,l3,l4,l5,l6;
	String s16,s21,s22;
	Balance(String s16,String s21,String s22)
	{
		
		this.setLayout(null);
		this.s16=s16;
		this.s21=s21;
		this.s22=s22;
		this.setSize(1500,1500);
		this.setVisible(true);
		jt1=new JTextField();
		jt2=new JTextField();
		jt3=new JTextField();
		l=new JLabel("Account Details");
		l1=new JLabel("Account Number");
		l2=new JLabel("Password");
		l3=new JLabel("Balance");
		l4=new JLabel(s22);
		l5=new JLabel(s16);
		l6=new JLabel(s21);
		jt1.setBounds(50,150,1200,40);
		jt2.setBounds(50,190,1200,40);
		jt3.setBounds(50,230,1200,40);
		l1.setBounds(70,150,1200,40);
		l2.setBounds(70,190,1200,40);
		l3.setBounds(70,230,1200,40);
		l4.setBounds(700,150,1200,40);
		l5.setBounds(700,190,1200,40);
		l6.setBounds(700,230,1200,40);
		l.setBounds(50,30,300,40);
		l1.setFont(new Font("Arial",Font.BOLD,20));
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l3.setFont(new Font("Arial",Font.BOLD,20));
		l4.setFont(new Font("Arial",Font.BOLD,20));
		l5.setFont(new Font("Arial",Font.BOLD,20));
		l6.setFont(new Font("Arial",Font.BOLD,20));
		l.setFont(new Font("Arial",Font.BOLD,30));
		jt1.setOpaque(false);
		jt2.setOpaque(false);
		jt3.setOpaque(false);
		Container c=this.getContentPane();
		c.setBackground(Color.pink);
		//l3.setForeground(Color.blue);
		l4.setForeground(Color.blue);
		l5.setForeground(Color.blue);
		l6.setForeground(Color.blue);
		l.setForeground(Color.red);
		jt1.setEditable(false);
		jt2.setEditable(false);
		jt3.setEditable(false);
		c.add(jt1);
		c.add(jt2);
		c.add(jt3);
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l5);
		c.add(l6);
		c.add(l);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
