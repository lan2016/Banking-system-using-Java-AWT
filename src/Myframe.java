
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
import javax.swing.event.*;
class Myframe extends JFrame implements ItemListener
{
    String a[]=new String[100];
    String str[]=new String[100];
    int i=0;
    ButtonModel s1;
	String s2,s4;
    //JCheckBoxGroup cbg;
    JCheckBox c1,c2,c3,c4,c5,c6;
    ButtonGroup bg;
    Container c;
    Myframe()
            {
    	this.setSize(1500,1500);
    	this.setVisible(true);
               
                
      //          cbg=new JCheckBoxGroup();
                c1=new JCheckBox("ADD ACCOUNT",false);
                c2=new JCheckBox("DEPOSIT AMOUNT",false);
                c3=new JCheckBox("WITHDRAWL AMOUNT",false);
                c4=new JCheckBox("FUND TRANSFER",false);
                c5=new JCheckBox("REMOVE ACCOUNT",false);
                c6=new JCheckBox("CHECK YOUR STATUS",false);
                c1.setBounds(70,220,130,30);
                c2.setBounds(70,300,130,30);
                c3.setBounds(70,370,170,30);
                c4.setBounds(70,440,130,30);
                c5.setBounds(70 ,520,140,30);
                c6.setBounds(70,590,170,30);
                bg=new ButtonGroup();
                c=this.getContentPane();
                c.setLayout(null);
                bg.add(c1);
                bg.add(c2);
                bg.add(c3);
               bg. add(c4);
               bg. add(c5);
                bg.add(c6);
                c1.setBackground(Color.green);
                c2.setBackground(Color.green);
                c3.setBackground(Color.green);
                c4.setBackground(Color.green);
                c5.setBackground(Color.green);
                c6.setBackground(Color.green);
                
                c.setBackground(Color.green);
                c1.addItemListener(this);
                c2.addItemListener(this);
                c3.addItemListener(this);
                c4.addItemListener(this);
                c5.addItemListener(this);
                c6.addItemListener(this);
                
                c.add(c1);
                c.add(c2);
                c.add(c3);
              c. add(c4);
               c. add(c5);
                c.add(c6);
    this.addWindowListener(new WindowAdapter()
		{
			 public void windowClosing(WindowEvent e){System.exit(0);}
		});}
    public void itemStateChanged(ItemEvent ae1)
    {
    	//s4=(String)ae1.getSource();
    	//System.out.println(ae1.getSource());
        repaint();
    }
public void paint(Graphics g1)
{
    //this.setBackground(Color.green);
	super.paint(g1);
    Font f6=new Font("ARIAL",Font.BOLD,30);
    g1.setFont(f6);
    g1.drawString("Please Select Any Service From menu ",100,150 );
    
   // String s2=s1.;
    //  Font f7=
      g1.setFont(new Font("ITALIC",Font.BOLD,25));
      g1.drawString("SELECTED CHOICE :: ",100,700 );
      //g1.drawString(s2, 380, 700);
     
    
}
public static void main(String args[])
{
	Myframe f=new Myframe();
}
}
