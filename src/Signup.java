import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.jdatepicker.util.*;
import org.jdesktop.swingx.JXDatePicker;
public class Signup extends JFrame implements ActionListener,ItemListener{
	JLabel jl,j;
	JRadioButton jr1,jr2,jr3,jr4;
JComboBox jc15,jc10;
ButtonGroup b,b1;
	JLabel j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11,j12,j13,j14,j15,j16,j17,j18,j19,j20;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22;
	JXDatePicker p,p1;
	JButton jb1,jb2,jb3;
	int a;
	JTextField jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10,jt11,jt12,jt13,jt14,jt15,jt16,jt17,jt18,jt19,jt20;
Signup()
{
	
	this.setSize(1500,1500);
	this.setVisible(true);
	
	//this.setBackground(Color.GRAY);
	j=new JLabel("New Account Opening Form");
	j.setFont(new Font("Arial",Font.BOLD,30));
	j.setBounds(500,28,500,40);
	j.setForeground(Color.blue);
	jl=new JLabel("Account Holder Details");
	jl.setFont(new Font("Arial",Font.BOLD,20));
	jl.setForeground(Color.blue);
	jl.setBounds(10,80,500,30);
	j1=new JLabel("Name");
	j2=new JLabel("Father's/Husband's Name");
	j3=new JLabel("Date Of Birth");
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
	j13=new JLabel("Enter password");
	j14=new JLabel("Opening Date");
	j15=new JLabel("Account Type");
	j16=new JLabel("Nominees Name");
	j17=new JLabel("Relation");
	Container c=this.getContentPane();
	//c.setLayout(null);
	jt1=new JTextField();
	jt2=new JTextField();
	jt3=new JTextField();
	jt4=new JTextField();
	jt5=new JTextField();
	jt6=new JTextField();
	jt7=new JTextField();
	jt8=new JTextField();
	jt9=new JTextField();
	jt10=new JTextField();
	jt11=new JTextField();
	jt12=new JTextField();
	jt13=new JTextField();
	jt14=new JTextField();
	jt15=new JTextField();
	jt16=new JTextField();
	jt17=new JTextField();
	jt18=new JTextField();
	jt19=new JTextField();
	jt20=new JTextField();
	jb1=new JButton("Submit");
	jb2=new JButton("Reset");
	jb3=new JButton("Close");
	
	b=new ButtonGroup();
	b1=new ButtonGroup();
	jr1=new JRadioButton("Male");
	jr2=new JRadioButton("Female");
	jr3=new JRadioButton("Yes");
	jr4=new JRadioButton("No");
	b.add(jr1);
	b.add(jr2);
	b1.add(jr3);
	b1.add(jr4);
	j1.setBounds(20,110,200,30);
	j2.setBounds(20,160,250,30);
	j3.setBounds(20,210,200,30);
	j18.setBounds(20,260,200,30);
	j19.setBounds(20,310,200,30);
	j20.setBounds(20,360,200,30);
	j4.setBounds(20,410,200,30);
	j5.setBounds(20,460,200,30);
	j6.setBounds(20,510,200,30);
	j7.setBounds(20,560,200,30);
	j8.setBounds(800,110,200,30);
	j9.setBounds(800,160,200,30);
	j10.setBounds(800,210,200,30);
	j11.setBounds(800,260,200,30);
	j12.setBounds(800,310,250,30);
	j13.setBounds(800,360,200,30);
	j14.setBounds(800,410,200,30);
	j15.setBounds(800,460,200,30);
  j16.setBounds(800,510,200,30);
	j17.setBounds(800,560,200,30);
	jt1.setBounds(270,110,200,30);
	jt2.setBounds(270,160,200,30);
	jt3.setBounds(270,210,200,30);
	jt18.setBounds(270,260,200,30);
	//jt19.setBounds(270,310,200,30);
	
	jr1.setBounds(270,310,100,30);
	jr2.setBounds(370,310,100,30);
//	jt20.setBounds(270,360,200,30);
	jr3.setBounds(270,360,100,30);
	jr4.setBounds(370,360,100,30);
	jt4.setBounds(270,410,200,30);
	jt5.setBounds(270,460,200,30);
	jt6.setBounds(270,510,200,30);
	jt7.setBounds(270,560,200,30);
	jt8.setBounds(1050,110,200,30);
	jt9.setBounds(1050,160,200,30);
//	jt10.setBounds(1050,210,200,30);
	
	jc10=new JComboBox();
	jc10.addItem("Choose Occupation");
	jc10.addItem("IAS/IPS/VIP Ranking");
	jc10.addItem("Goverment Employee");
	jc10.addItem("Own Business");
	jc10.addItem("Private Employee");
	jc10.setBounds(1050,210,200,30);
	jt11.setBounds(1050,260,200,30);
	jt12.setBounds(1050,310,200,30);
	jt13.setBounds(1050,360,200,30);
	jt14.setBounds(1050,410,200,30);
	//jt15.setBounds(1050,460,200,30);
	
	jc15=new JComboBox();
	jc15.addItem("Account Type");
	jc15.addItem("Saving");
	jc15.addItem("Current");
	jc15.setBounds(1050,460,200,30);
	jt16.setBounds(1050,510,200,30);
	jt17.setBounds(1050,560,200,30);
	  
	jb1.setBounds(800,650,100,40);
	jb2.setBounds(900,650,100,40);
	jb3.setBounds(1000,650,100,40);
		
	jr1.setBackground(Color.white);
	jr2.setBackground(Color.white);
	jr3.setBackground(Color.white);
	jr4.setBackground(Color.white);
	
	jb1.setForeground(Color.blue);
	jb2.setForeground(Color.blue);
	jb3.setForeground(Color.blue);
	j1.setFont(new Font("Arial",Font.BOLD,20));
	j2.setFont(new Font("Arial",Font.BOLD,20));
	j3.setFont(new Font("Arial",Font.BOLD,20));
	j4.setFont(new Font("Arial",Font.BOLD,20));
	j5.setFont(new Font("Arial",Font.BOLD,20));
	j6.setFont(new Font("Arial",Font.BOLD,20));
	j7.setFont(new Font("Arial",Font.BOLD,20));
	j8.setFont(new Font("Arial",Font.BOLD,20));
	j9.setFont(new Font("Arial",Font.BOLD,20));
	j10.setFont(new Font("Arial",Font.BOLD,20));
	j11.setFont(new Font("Arial",Font.BOLD,20));
	j12.setFont(new Font("Arial",Font.BOLD,20));
	j13.setFont(new Font("Arial",Font.BOLD,20));
	j14.setFont(new Font("Arial",Font.BOLD,20));
	j15.setFont(new Font("Arial",Font.BOLD,20));
	j16.setFont(new Font("Arial",Font.BOLD,20));
	j17.setFont(new Font("Arial",Font.BOLD,20));
	j18.setFont(new Font("Arial",Font.BOLD,20));
	j19.setFont(new Font("Arial",Font.BOLD,20));
	jr1.setFont(new Font("Arial",Font.BOLD,20));
	jr2.setFont(new Font("Arial",Font.BOLD,20));
	j20.setFont(new Font("Arial",Font.BOLD,20));
	jr3.setFont(new Font("Arial",Font.BOLD,20));
	jr4.setFont(new Font("Arial",Font.BOLD,20));
	
	jt1.setFont(new Font("Arial",Font.BOLD,15));
	jt2.setFont(new Font("Arial",Font.BOLD,15));
	jt3.setFont(new Font("Arial",Font.BOLD,15));
	jt4.setFont(new Font("Arial",Font.BOLD,15));
	jt5.setFont(new Font("Arial",Font.BOLD,15));
	jt6.setFont(new Font("Arial",Font.BOLD,15));
	jt7.setFont(new Font("Arial",Font.BOLD,15));
	jt8.setFont(new Font("Arial",Font.BOLD,15));
	jt9.setFont(new Font("Arial",Font.BOLD,15));
	jt10.setFont(new Font("Arial",Font.BOLD,15));
	jc10.setFont(new Font("Arial",Font.BOLD,15));
	jt11.setFont(new Font("Arial",Font.BOLD,15));
	jt12.setFont(new Font("Arial",Font.BOLD,15));
	jt13.setFont(new Font("Arial",Font.BOLD,15));
	jt14.setFont(new Font("Arial",Font.BOLD,15));
	jt15.setFont(new Font("Arial",Font.BOLD,15));
	jc15.setFont(new Font("Arial",Font.BOLD,15));
	jt16.setFont(new Font("Arial",Font.BOLD,15));
	jt17.setFont(new Font("Arial",Font.BOLD,15));
	jt18.setFont(new Font("Arial",Font.BOLD,15));
	jt19.setFont(new Font("Arial",Font.BOLD,15));
	jt20.setFont(new Font("Arial",Font.BOLD,15));
	p=new JXDatePicker();
	 p1=new JXDatePicker();
	p.setDate(Calendar.getInstance().getTime());;
	p.setFormats(new SimpleDateFormat("dd/MM/yyyy")); 
	p.setBounds(270,210,200,30);	
	c.add(p);
	p1.setDate(Calendar.getInstance().getTime());;
	p1.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
	p1.setBounds(1050,410,200,30);
	c.add(p1);
	
	p.addActionListener(new ActionListener()
	{

	public void actionPerformed(ActionEvent e)
	{
		s3=p.getDate().toString();
		System.out.println(p.getDate());
	}
	

	
});
	p1.addActionListener(new ActionListener()
	{

	public void actionPerformed(ActionEvent e)
	{
		s17=p1.getDate().toString();
		System.out.println(p1.getDate());
	}

	
});

	
	
	c.add(jl);
	c.add(j);
	c.add(j1);
	c.add(j2);
	c.add(j3);
	c.add(j4);
	c.add(j5);
	c.add(j6);
	c.add(j7);
	c.add(j8);
	c.add(j9);
	c.add(j10);
	c.add(j11);
	c.add(j12);
	c.add(j13);
	c.add(j14);
	c.add(j15);
	c.add(j16);
	c.add(j17);
	c.add(j18);
	c.add(j19);
	c.add(j20);
	c.add(jt1);
	c.add(jt2);
	c.add(jt3);
	c.add(jt4);
	c.add(jt5);
	c.add(jt6);
	c.add(jt7);
	c.add(jt8);
	c.add(jt9);
	c.add(jt10);
	c.add(jt11);
	c.add(jt12);
	c.add(jt13);
	c.add(jt14);
	c.add(jt15);
	c.add(jt16);
	c.add(jt17);
	c.add(jt18);
	c.add(jt19);
	c.add(jt20);
c.add(jb1);
c.add(jb2);
c.add(jb3);
c.add(jr1);
c.add(jr2);
c.add(jr3);
 c.add(jr4);
 c.add(jc15);
 c.add(jc10);
	this.add(new Form());
	this.setBackground(Color.blue);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	jb3.addActionListener(this);
	jt1.addActionListener(this);
	jt2.addActionListener(this);
	jt3.addActionListener(this);
	jt4.addActionListener(this);
	jt5.addActionListener(this);
	jt6.addActionListener(this);
	jt7.addActionListener(this);
	jt8.addActionListener(this);jt9.addActionListener(this);
	jt10.addActionListener(this);
	jt11.addActionListener(this);
	jt12.addActionListener(this);
	jt13.addActionListener(this);
	jt14.addActionListener(this);
	jt15.addActionListener(this);
	jt16.addActionListener(this);
	jt17.addActionListener(this);
	jt18.addActionListener(this);
	jt19.addActionListener(this);
	jt20.addActionListener(this);
	jr1.addActionListener(this);
	jr2.addActionListener(this);
	jr3.addActionListener(this);
	jr4.addActionListener(this);
	jc10.addActionListener(this);
	jc15.addActionListener(this);
	jr1.addItemListener(this);
	jr2.addItemListener(this);
	jr3.addItemListener(this);
	jr4.addItemListener(this);
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
public void itemStateChanged(ItemEvent i)
{

	
}
public void actionPerformed(ActionEvent e)
{
	
	//s1=jt1.getText();
	//s1=jt1.getText();
	String s=e.getActionCommand();
	
	if(s.equals("Close"))
	{
		this.setVisible(false);
	}
	if(s.equals("Submit"))
	{
		s13=(String)jc10.getSelectedItem();
		//System.out.println(s13);
		s18=(String)jc15.getSelectedItem();
		System.out.println(s18);
		if(jr1.getModel().isSelected())
		{
			s5="Male";
			System.out.println(s5);
		}
		if(jr2.getModel().isSelected())
		{
			s5="Female";
			System.out.println(s5);
		}
		if(jr3.getModel().isSelected())
		{
			s6="yes";
			System.out.println(s6);
		}
		if(jr4.getModel().isSelected())
		{
			s6="No";
			System.out.println(s6);
		}
		
		s1=jt1.getText().trim();
		s2=jt2.getText().trim();
		s4=jt18.getText().trim();
		///s5=jt5.getText();
		//s6=jt1.getText();
		s7=jt4.getText().trim();
		s8=jt5.getText().trim();
		s9=jt6.getText().trim();
		s10=jt7.getText().trim();
		s11=jt8.getText().trim();
		s12=jt9.getText().trim();
		//s1=jt1.getText();
		s14=jt11.getText().trim();
		s15=jt12.getText().trim();
		s16=jt13.getText().trim();
		//s1=jt1.getText();
		//s18=jt15.getText().trim();
		s19=jt16.getText().trim();
		s20=jt17.getText().trim();
		
		System.out.println(s1+s2);
		
		Data_Base Data_base =new Data_Base(s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20);	
	 this.setVisible(false);
	}
	if(s.equals("Reset"))
	{
	jt1.setText(null);
	jt2.setText(null);
	jt3.setText(null);
	jt4.setText(null);
	jt5.setText(null);
	jt6.setText(null);
	jt7.setText(null);
	jt8.setText(null);
	jt9.setText(null);
	jt10.setText(null);
	jt11.setText(null);
	jt12.setText(null);
	jt13.setText(null);
	jt14.setText(null);
	jt15.setText(null);
	jt16.setText(null);
	jt17.setText(null);
	jt18.setText(null);
	jt19.setText(null);
	jt20.setText(null);
	jr1.setSelected(false);
	jr2.setSelected(false);
	jr3.setSelected(false);
	jr4.setSelected(false);
	jc10.setActionCommand("Choose Occupation");
	//s1=jt1.getText();
	
	}
}
}
class Form extends JPanel
{
	JLabel jl;
	Form()
	{
		//this.setLayout(null);
		
	}
	public void paint(Graphics g)
	{
	
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(10, 80, 1340, 600);
	}
}
