import javax.imageio.IIOImage;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
class Rebank2 extends JFrame
{
	
		Rebank2()
		{	
		//Rebank2 b=new Rebank2();
		this.setSize(1500,1500);
		this.setVisible(true);
		
		Container c=this.getContentPane();	
		ImageIcon i=new ImageIcon("STAR BANK OF INDIA13.jpg");
		JLabel j=new JLabel(i);
		//j.setBounds(0, 0,1500,1500);
		c.setLayout(new BorderLayout());
		j.setSize(1500,1500);	
		
      c.setBackground(Color.white);
		c.add("North",j);
		//j.add(jb1);
		c.add(new Rajat());
     c.add("South",new Bansal());
    
//c.add(new info());
		//c.add("Center",jb1);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public static void main(String args[])
		{
			Rebank2 r=new Rebank2();
		}
}
class Rajat extends JPanel implements ActionListener
{
	JButton jb1,jb2,jb3;
	Rajat()
	{
                this.setLayout(new FlowLayout());
		jb1=new JButton("Home");
jb2=new JButton("About SBI");
jb3=new JButton("Online Services");

		jb1.setBounds(800, 1000, 200, 30);
jb1.setFont(new Font("Arial",Font.BOLD,30));
jb1.setForeground(Color.green);
jb2.setFont(new Font("Arial",Font.BOLD,30));
jb2.setForeground(Color.green);

jb3.setFont(new Font("Arial",Font.BOLD,30));
jb3.setForeground(Color.green);


 
jb1.setSize(100,100);
jb1.setBackground(Color.white);
jb2.setBackground(Color.white);
jb3.setBackground(Color.white);
jb1.addActionListener(this);
jb2.addActionListener(this);
jb3.addActionListener(this);
this.add(jb1);
this.add(jb2);
this.add(jb3);

	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("Home"))
		{
			Home h=new Home();
		//System.out.println("my name is rajat home")	;
		}
		if(s.equals("About SBI"))
		{
			System.out.println("my name is rajat sbi")	;	
		}
		if(s.equals("Online Services"))
		{
			Frame1 g=new Frame1();
			
			//System.out.println("my name is rajat online")	;
		}
	}
}
class Bansal extends JPanel implements ActionListener
{
JButton jb4;
JTextField jc1,jc2;

Bansal()
{
this.setLayout(new FlowLayout());
//this.setPreferredSize(new Dimension(1200,1000));
jb4=new JButton("Continue to login");
jc1=new JTextField("Enter Account no");
jc2=new JTextField("Enter password");

///jc1.setBounds(600,1000,30,20);
//jc1.setLocation(1200, 1000);
jb4.setFont(new Font("Arial",Font.BOLD,30));
jb4.setForeground(Color.blue);
jb4.setBackground(Color.white);
jb4.addActionListener(this);
this.add(jb4);

//this.add(jc1);
//this.add(jc2);
}
public void actionPerformed(ActionEvent e)
{
	String s=e.getActionCommand();
	System.out.println(jb4.getParent().getParent().getParent().getParent().getParent());
	if(s.equals("Continue to login"))
	{
		Login l=new Login();
		//(jb4.getParent().getParent().getParent().getParent().getParent()).setVisible(false);
	}
}

}
