import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Frame1 extends Frame implements ItemListener
{
    String a[]=new String[100];
    String str[]=new String[100];
    int i=0;
    String s1,s2;
    CheckboxGroup cbg;
    Checkbox c1,c2,c3,c4,c5,c6;
    Frame1()
            {
    	this.setSize(1500,1500);
    	this.setVisible(true);
                this.setLayout(null);
                this.setBackground(Color.green);
                cbg=new CheckboxGroup();
                this.setFont(new Font("Forte",Font.BOLD,20));
                c1=new Checkbox("ADD ACCOUNT",cbg,false);
                c2=new Checkbox("DEPOSIT AMOUNT",cbg,false);
                c3=new Checkbox("WITHDRAWL AMOUNT",cbg,false);
                c4=new Checkbox("FUND TRANSFER",cbg,false);
                c5=new Checkbox("REMOVE ACCOUNT",cbg,false);
                c6=new Checkbox("CHECK YOUR STATUS",cbg,false);
                c1.setBounds(70,220,400,30);
                c3.setBounds(70,300,400,30);
                c4.setBounds(70,370,400,30);
                c5.setBounds(70,440,400,30);
                c6.setBounds(70 ,520,400,30);
                c1.setFont(new Font("Forte",Font.BOLD,15));
                c3.setFont(new Font("Forte",Font.BOLD,15));
                c4.setFont(new Font("Forte",Font.BOLD,15));
                c5.setFont(new Font("Forte",Font.BOLD,15));
                c6.setFont(new Font("Forte",Font.BOLD,15));
                //c6.setBounds(70,590,170,30);
               
              //  c6.setBackground(Color.red);
                c1.setForeground(Color.blue);
                c3.setForeground(Color.blue);
                c4.setForeground(Color.blue);
                c5.setForeground(Color.blue);
                c6.setForeground(Color.blue);
                add(c1);
                //add(c2);
                add(c3);
                add(c4);
                add(c5);
                add(c6);
                
                
                c1.addItemListener(this);
                c2.addItemListener(this);
                c3.addItemListener(this);
                c4.addItemListener(this);
                c5.addItemListener(this);
                c6.addItemListener(this);
    this.addWindowListener(new WindowAdapter()
		{
			 public void windowClosing(WindowEvent e){System.exit(0);}
		});}
    public void itemStateChanged(ItemEvent ae1)
    {
        repaint();
    }
public void paint(Graphics g1)
{
    //this.setBackground(Color.green);
    Font f6=new Font("ARIAL",Font.BOLD,30);
    g1.setFont(f6);
    g1.drawString("Please Select Any Service From menu ",100,150 );
    s1=cbg.getSelectedCheckbox().getLabel();
      Font f7=new Font("Forte",Font.BOLD,25);
      g1.setFont(f7);
      g1.drawString("SELECTED CHOICE :: ",100,700 );
      g1.drawString(s1, 380, 700);
      if(s1.equals("ADD ACCOUNT"))
      {
    	  this.setVisible(false);
    	  Signup s=new Signup();
      }
      
      //  add();
      else if(s1.equals("DEPOSIT AMOUNT"));
       //   deposit();
      else if(s1.equals("WITHDRAWL AMOUNT"))
      {
    	  //this.setVisible(false);
    	  Login l=new Login();
      }
        //  withdrawl();
          else if(s1.equals("FUND TRANSFER"))
             
      {
    	  Login l=new Login();
      }
              else if(s1.equals("REMOVE ACCOUNT"))
              {
            	  Login l=new Login();
              }
                  //remove();
              else if (s1.equals("CHECK YOUR STATUS"))
              {
            	  Login l=new Login();
              }
      
}
}