import javax.swing.*;

import org.jdesktop.swingx.JXDatePicker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test_Date extends JPanel{


public static void main(String args[])

{
	Test_Date t=new Test_Date();
	JXDatePicker p=new JXDatePicker();
	p.setDate(Calendar.getInstance().getTime());;
	p.setFormats(new SimpleDateFormat("dd/MM/yyyy")); 
	//p.setBounds(270,210,200,30);	c.add(p);
	JFrame j=new JFrame();
	j.getContentPane().setLayout(new FlowLayout());
	j.setSize(200,200);
	j.setVisible(true);
	j.getContentPane().add(p);

	


}}
