import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.*;
import java.util.*;
import java.text.*;
import java.io.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
class M extends JFrame implements ActionListener
{
	Container c;
  	ImageIcon i1;
	JMenuBar mb;
	JMenu file,edit,report,ls; 
  	JMenuItem ci,sh,end,exd,logout,vt,bl;
	Vector vdata = new Vector();
	Vector  vrow = new Vector();
	Vector  col = new Vector();
	JTableHeader head;
	JTable jt;
	JButton b1= new JButton("Signin");
	JButton b2 = new JButton("Save");
	JButton b3= new JButton("Display");
	JButton b4= new JButton("Update");
	JButton b5= new JButton("save");
	JButton b6= new JButton("display");
	JButton b7= new JButton("update");
	JButton b8= new JButton("save.");
	JButton b9= new JButton("display.");
	JButton b10= new JButton("update.");
	JButton b11= new JButton("display..");
	JButton b12= new JButton("update..");
	JButton b13= new JButton("ok");
	JButton b14= new JButton("cancel");
	JButton b15= new JButton("Show");
	JButton b16= new JButton("show");
	JButton b17= new JButton("show.");
	JButton b18= new JButton("Change");
	JButton b19= new JButton("show");
	JButton b20= new JButton("change");
	JButton b21= new JButton("change.");
	JPanel p1= new JPanel();
	JPanel p2= new JPanel();
	JPanel p3= new JPanel();
	JPanel p4= new JPanel();
	JPanel p5= new JPanel();
	JPanel p6= new JPanel();
	JPanel p7= new JPanel();
	JPanel p8= new JPanel();
	JPanel p9= new JPanel();
	JPanel p10= new JPanel();
	JPanel p11= new JPanel();
	JPanel p12= new JPanel();
	JPanel p13= new JPanel();
	JPanel p14= new JPanel();
	JPanel p15= new JPanel();
	JPanel p16= new JPanel();
	JPanel p17= new JPanel();
	JPanel p18= new JPanel();
	JPanel p19= new JPanel();
	JPanel p20= new JPanel();

	JPanel p22= new JPanel();
	JPanel p23= new JPanel();
	JPanel p24= new JPanel();
	JPanel p25= new JPanel();
	JPanel p26= new JPanel();
	JPanel p27= new JPanel();
	JPanel p28= new JPanel();
	JPanel p29= new JPanel();
	JPanel p30= new JPanel();
	JPanel p31= new JPanel();
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25,tf26,tf27,tf28,tf29,tf30,tf31,tf32,tf33,tf34,tf35,tf36,tf37,tf38,tf39,tf40,tf41,tf42,tf43,tf44,tf45,tf46,tf47,tf48,tf49,tf50,tf51,tf52,tf53,tf54,tf55,tf56,tf57,tf58,tf59,tf60,tf61,tf62,tf63;
	JPasswordField tf2;
	String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27,s28,s29,s30,s31,s32,s33,s34,s35,s36,s37,s38,s39,s40,s41,s42,s43,s44,s45,s46,s47,s48,s49,s50,s51,s52,s53,s54,s55,s56,s57,s58,s59,s60,s61,s62,s63,s64="";
	JLabel l = new JLabel("Welcome to VSP STEEL Plant",JLabel.LEFT);
	JLabel l5 = new JLabel("Entered Details Doesn't Match",JLabel.LEFT);
	JLabel l6 = new JLabel("VISAKHAPATNAM STEEL PLANT",JLabel.CENTER);
	JLabel l7 = new JLabel("CENTRAL INDUSTRIAL SECURITY FORCE",JLabel.CENTER);
	JLabel l8 = new JLabel("VEHICLE REGISTRATION SYSTEM",JLabel.CENTER);
	JLabel l9 = new JLabel("LSGP Entry Registration",JLabel.CENTER);
	JLabel l10 = new JLabel("IN-SLNO:",JLabel.LEFT);
	JLabel l11 = new JLabel("DATE:",JLabel.CENTER);
	JLabel l12 = new JLabel("IN-TIME:",JLabel.RIGHT);
	JLabel l13 = new JLabel("LSGP-NO:",JLabel.LEFT);
	JLabel l14 = new JLabel("PARTY:",JLabel.CENTER);
	JLabel l15 = new JLabel("VHC-NO:",JLabel.RIGHT);
	JLabel l16 = new JLabel("VHC-TYPE:",JLabel.LEFT);
	JLabel l17 = new JLabel("IN-PERSON:",JLabel.CENTER);
	JLabel l18 = new JLabel("SHIFT I/C:",JLabel.RIGHT);
	JLabel l19 = new JLabel("SHIFT:",JLabel.LEFT);
	JLabel l20 = new JLabel("DO-NO:",JLabel.CENTER);
	JLabel l21 = new JLabel("MATERIAL",JLabel.RIGHT);
	JLabel l22 = new JLabel("LICENCE-NO:",JLabel.LEFT);
	JLabel l23 = new JLabel("DRIVER-NAME:",JLabel.CENTER);
	JLabel l24 = new JLabel("DESTINATION:",JLabel.RIGHT);
	JLabel l25 = new JLabel("");
	JLabel l26 = new JLabel("");
	JLabel l27 = new JLabel("");
	JLabel l28 = new JLabel("");
	JLabel l29 = new JLabel("");
	JLabel l30 = new JLabel("");
	JLabel l31 = new JLabel("LSGP EXIT REGISTRATION",JLabel.CENTER);
	JLabel l32 = new JLabel("LSGP-NO:",JLabel.CENTER);
	JLabel l33 = new JLabel("IN-SLNO:",JLabel.CENTER);
	JLabel l34 = new JLabel("OUT-SLNO:",JLabel.CENTER);
	JLabel l35 = new JLabel("IN-DATE:",JLabel.CENTER);
	JLabel l36 = new JLabel("OUT-DATE:",JLabel.CENTER);
	JLabel l37 = new JLabel("IN-TIME:",JLabel.CENTER);
	JLabel l38 = new JLabel("OUT-TIME:",JLabel.CENTER);
	JLabel l39 = new JLabel("VHC-NO:",JLabel.CENTER);
	JLabel l40 = new JLabel("VHC-TYPE:",JLabel.CENTER);
	JLabel l41 = new JLabel("D0-NO:",JLabel.CENTER);
	JLabel l42 = new JLabel("MATERIAL:",JLabel.CENTER);
	JLabel l43 = new JLabel("IN-PERSON:",JLabel.CENTER);
	JLabel l44 = new JLabel("IN-SHIFT:",JLabel.CENTER);
	JLabel l45 = new JLabel("OUT-PERSON:",JLabel.CENTER);
	JLabel l46 = new JLabel("OUT-SHIFT:",JLabel.CENTER);
	JLabel l47 = new JLabel("SHIFT I/C:",JLabel.CENTER);
	JLabel l48 = new JLabel("PARTY:",JLabel.CENTER);
	JLabel l49 = new JLabel("DC-NO:",JLabel.CENTER);
	JLabel l50 = new JLabel("QTY:",JLabel.CENTER);
	JLabel l51 = new JLabel("CUST.REP:",JLabel.CENTER);
	JLabel l52 = new JLabel("DESTINATION:",JLabel.CENTER);
	JLabel l53 = new JLabel("LICENCE-NO:",JLabel.CENTER);
	JLabel l54 = new JLabel("DRIVER-NAME:",JLabel.CENTER);
	JLabel l55= new JLabel("REMARKS",JLabel.CENTER);
	JLabel l56= new JLabel("CISF PERSON ENTRY DETAILS",JLabel.CENTER);
	JLabel l57= new JLabel("CISF-PERSON-NO:",JLabel.LEFT);
	JLabel l58= new JLabel("CISF-PERSON-NAME:",JLabel.LEFT);
	JLabel l59= new JLabel("DATE",JLabel.LEFT);
	JLabel l60= new JLabel("TIME",JLabel.LEFT);
	JLabel l61= new JLabel("IN-DETAILS:",JLabel.LEFT);
	JLabel l62= new JLabel("LSGP-DETAILS:",JLabel.LEFT);
	JLabel l63= new JLabel("TARE-DETAILS:",JLabel.LEFT);
	JLabel l64= new JLabel("YARD-IN-DETAILS:",JLabel.LEFT);
	JLabel l65= new JLabel("YARD-OUT-DETAILS:",JLabel.LEFT);
	JLabel l66= new JLabel("GROSS-DETAILS:",JLabel.LEFT);
	JLabel l67= new JLabel("DC-DETAILS:",JLabel.LEFT);
	JLabel l68= new JLabel("OUT-DETAILS:",JLabel.LEFT);
	JLabel l69= new JLabel("CISF VEHICLE TRACKING:",JLabel.CENTER);
	JLabel l70= new JLabel("VHC-NO::",JLabel.LEFT);
	JLabel l71= new JLabel("LSGP-NO:",JLabel.RIGHT);
	JLabel l72= new JLabel("");
	JLabel l73= new JLabel("ENTER VEHICLE NUMBER:",JLabel.CENTER);
	JLabel l74= new JLabel("ENTER VEHICLE NUMBER TO BLACK LIST:",JLabel.CENTER);
	JLabel l75= new JLabel("ENTER VEHICLE_NO:",JLabel.CENTER);
	JLabel l76= new JLabel("ENTER Details to Update:",JLabel.CENTER);
	
	
		M()
	{
	     i1 = new ImageIcon("a.jpg");
		JTextArea ta = new JTextArea(5,100);
		 tf1= new JTextField(20);
		 tf2 = new JPasswordField(20);
		 tf3 = new JTextField(2);
		 tf4 = new JTextField(2);
		 tf5 = new JTextField(2);
		 tf6 = new JTextField(2);
		 tf7 = new JTextField(2);
		 tf8 = new JTextField(2);
		 tf9 = new JTextField(2);
		 tf10 = new JTextField(2);
		 tf11 = new JTextField(2);
		 tf12 = new JTextField(2);
		 tf13 = new JTextField(2);
		 tf14 = new JTextField(2);
		 tf15 = new JTextField(2);
		 tf16 = new JTextField(2);
		 tf17 = new JTextField(2);
		 tf18 = new JTextField(2);
		 tf19 = new JTextField(2);
		 tf20 = new JTextField(2);
		 tf21 = new JTextField(2);
		 tf22 = new JTextField(2);
		 tf23 = new JTextField(2);
		 tf24 = new JTextField(2);
		 tf25 = new JTextField(2);
		 tf26 = new JTextField(2);
		 tf27 = new JTextField(2);
		 tf28 = new JTextField(2);
		 tf29 = new JTextField(2);
		 tf30 = new JTextField(2);
		 tf31 = new JTextField(2);
		 tf32 = new JTextField(2);
		 tf33 = new JTextField(2);
		 tf34 = new JTextField(2);
		 tf35 = new JTextField(2);
		 tf36 = new JTextField(2);
		 tf37 = new JTextField(2);
		 tf38 = new JTextField(2);
		 tf39 = new JTextField(2);
		 tf40 = new JTextField(2);
		 tf41 = new JTextField(2);
		 tf42 = new JTextField(2);
		 tf43 = new JTextField(2);
		 tf44 = new JTextField(12);
		 tf45 = new JTextField(12);
		 tf46 = new JTextField(2);
		 tf47 = new JTextField(2);
		 tf48 = new JTextField(2);
		 tf49 = new JTextField(2);
		 tf50 = new JTextField(2);
		 tf51 = new JTextField(2);
		 tf52 = new JTextField(2);
		 tf53 = new JTextField(2);
		 tf54 = new JTextField(2);
		 tf55 = new JTextField(2);
		 tf56 = new JTextField(2);
		 tf57 = new JTextField(2);
		 tf58 = new JTextField(2);
		 tf59 = new JTextField(2);
		 tf60 = new JTextField(2);
		 tf61 = new JTextField(2);
		 tf62 = new JTextField(2);
		 tf63 = new JTextField(16);
		l1=new JLabel("User Name:");
		l2= new JLabel("Password:");
		l3= new JLabel("");
		l4= new JLabel(i1);
		 c=getContentPane();
   		// c.setLayout(new BorderLayout());
		p1.setLayout(new GridLayout(3,2));
		
		p4.setLayout(null);
		p7.setLayout(null);
		p12.setLayout(null);
		p16.setLayout(null);
		p20.setLayout(null);
		p23.setLayout(null);
		p26.setLayout(null);
		p5.setLayout(new GridLayout(4,0));
		p9.setLayout(new GridLayout(4,1));
		p10.setLayout(new GridLayout(4,1));
		p14.setLayout(new GridLayout(4,1));
		p18.setLayout(new GridLayout(4,1));
		p11.setLayout(new GridLayout(2,2));
		p13.setLayout(new GridLayout(1,3));
		p19.setLayout(new GridLayout(2,2));
		p6.setLayout(new GridLayout(7,6));
		p8.setLayout(new GridLayout(13,4));
		p17.setLayout(new GridLayout(9,3));
		p1.setBounds(1024,500,300,100);
		
		//p1.setBackground(new Color(100,100,100));
		p1.setOpaque(false);
		c.setBackground(new Color(100,200,100));
		p2.setBackground(new Color(100,200,100));
		// p4.setBackground(new Color(50,200,150));
		p5.setBackground(new Color(50,100,150));
		p9.setBackground(new Color(50,100,150));
		p7.setBackground(new Color(50,100,150));
		// p12.setBackground(new Color(50,100,150));
		p10.setBackground(new Color(50,100,150));
		p18.setBackground(new Color(50,100,150));
		p19.setBackground(new Color(50,100,150));
		l1.setForeground(new Color(120,220,130));
		l2.setForeground(new Color(120,220,130));
		p1.setFont(new Font("arial",Font.BOLD,20));
		l5.setFont(new Font("arial",Font.BOLD,40));
		l6.setFont(new Font("arial",Font.BOLD,40));
   		mb=new JMenuBar();
		p1.add(l1);

		p1.add(tf1);
		p1.add(l2);
		p1.add(tf2);
		p1.add(l3);
		p1.add(b1);
		p2.add(l);
		
   		//c.add("North",mb);
		c.add(p1);
		c.add(p2);
		p2.add(l4);
   		file=new JMenu("VRS Details Entry");
   		edit=new JMenu("Vehicle Details");
		report=new JMenu("Report");
		//quit=new JMenu("Quit");
		logout=new JMenuItem("Logout");
   		mb.add(file);
		mb.add(edit);
		mb.add(report);
		mb.add(logout);
		//b.setBounds(600,0,15,10);
		p13.setBounds(100,100,100,100);
   		ci= new JMenuItem("CISF Person Entry Details");
   		sh=new JMenuItem("Shift Closing");
   		end=new JMenuItem("Entry Details");
   		exd=new JMenuItem("Exit Details");
   		vt=new JMenuItem("Vehicle Tracking Details");
   		bl=new JMenuItem("Black List Of Vehicles");
   		edit.add(vt);
		edit.addSeparator();
   		edit.add(bl);
		ls=new JMenu("LSGP Details Entry");
  		file.add(ls);
		file.addSeparator();
		file.add(ci);
		file.addSeparator();
  		file.add(sh);
  		ls.add(end);
		ls.addSeparator();
  		ls.add(exd);
		ci.addActionListener(this);
		sh.addActionListener(this);
		end.addActionListener(this);
		exd.addActionListener(this);
		vt.addActionListener(this);
		bl.addActionListener(this);
		logout.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		b21.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
 	public void actionPerformed(ActionEvent e)
	{
		String f=e.getActionCommand();
		System.out.println(f);
		if(f=="Signin")
		{
		String uname=tf1.getText();
		String pass=tf2.getText();
		Connection con=null;
		try
		{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from ud where name=\'"+uname+"\' and pas=\'"+pass+"\'");
if(!rs.next())
{
p2.setVisible(false);
p3.setVisible(true);
p3.add(l5);
c.add(p3);

}
else
{
	p1.setVisible(false);
		p2.setVisible(false);
		p3.setVisible(false);
		mb.setVisible(true);
		c.add("North",mb);
		}
		}
		catch(Exception ex)
{
}
}
		if(end.isArmed())
 		{
		b18.setVisible(false);
		tf3.setText("");tf4.setText("");tf5.setText("");tf6.setText("");tf7.setText("");tf8.setText("");tf9.setText("");tf10.setText("");tf11.setText("");tf12.setText("");tf13.setText("");tf14.setText("");tf15.setText("");tf16.setText("");tf17.setText("");
		// p6.setOpaque(false);
		p6.setBounds(300,200,800,300);
		p5.setBounds(0,0,1366,200);
		l6.setForeground(Color.white);
		c.remove(b12);
		p23.setVisible(false);
		p24.setVisible(false);
		p25.setVisible(false);
		p7.setVisible(false);
		p12.setVisible(false);
		p16.setVisible(false);
		p20.setVisible(false);

		p4.setVisible(true);
		p5.setVisible(true);
		p6.setVisible(true);
		p5.add(l6);
		p5.add(l7);
		p5.add(l8);
		p5.add(l9);
		p6.add(l25);
		p6.add(l26);
		p6.add(l27);
		p6.add(l28);
		p6.add(l29);
		p6.add(l30);
		p6.add(l10);
		p6.add(tf3);
		p6.add(l11);
		p6.add(tf4);
		p6.add(l12);
		p6.add(tf5);
		p6.add(l13);
		p6.add(tf6);
		p6.add(l14);
		p6.add(tf7);
		p6.add(l15);
		p6.add(tf8);
		p6.add(l16);
		p6.add(tf9);
		p6.add(l17);
		p6.add(tf10);
		p6.add(l18);
		p6.add(tf11);
		p6.add(l19);
		p6.add(tf12);
		p6.add(l20);
		p6.add(tf13);
		p6.add(l21);
		p6.add(tf14);
		p6.add(l22);
		p6.add(tf15);
		p6.add(l23);
		p6.add(tf16);
		p6.add(l24);
		p6.add(tf17);
		p6.add(b2);
		p6.add(b3);
		p6.add(b4);
		p4.add(p5);
		p4.add(p6);
		c.add(p4);
		mb.setVisible(false);
		
		}
		if(exd.isArmed())
		{
		tf18.setEditable(true);
		b18.setVisible(false);
		p23.setVisible(false);
		p24.setVisible(false);
		p25.setVisible(false);
		p4.setVisible(false);
		p12.setVisible(false);
		p16.setVisible(false);
		p20.setVisible(false);
		c.remove(b12);
		p8.setBounds(300,200,800,300);
		p9.setBounds(0,0,1366,200);		
        tf18.setText("");tf19.setText("");tf20.setText("");tf21.setText("");tf22.setText("");tf23.setText("");tf24.setText("");tf25.setText("");tf26.setText("");tf27.setText("");tf28.setText("");tf29.setText("");tf30.setText("");tf31.setText("");tf32.setText("");tf33.setText("");tf34.setText("");tf35.setText("");tf36.setText("");tf37.setText("");tf38.setText("");tf39.setText("");tf40.setText("");tf41.setText("");
		p7.setVisible(true);
		p9.setVisible(true);
		p8.setVisible(true);
			p9.add(l6);
			p9.add(l7);
			p9.add(l8);
			p9.add(l31);
			p8.add(l32);
			p8.add(tf18);
			p8.add(l33);
			p8.add(tf19);
			p8.add(l34);
			p8.add(tf20);
			p8.add(l35);
			p8.add(tf21);
			p8.add(l36);
			p8.add(tf22);
			p8.add(l37);
			p8.add(tf23);
			p8.add(l38);
			p8.add(tf24);
			p8.add(l39);
			p8.add(tf25);
			p8.add(l40);
			p8.add(tf26);
			p8.add(l41);
			p8.add(tf27);
			p8.add(l42);
			p8.add(tf28);
			p8.add(l43);
			p8.add(tf29);
			p8.add(l44);
			p8.add(tf30);
			p8.add(l45);
			p8.add(tf31);
			p8.add(l46);
			p8.add(tf32);
			p8.add(l47);
			p8.add(tf33);
			p8.add(l48);
			p8.add(tf34);
			p8.add(l49);
			p8.add(tf35);
			p8.add(l50);
			p8.add(tf36);
			p8.add(l51);
			p8.add(tf37);
			p8.add(l52);
			p8.add(tf38);
			p8.add(l53);
			p8.add(tf39);
			p8.add(l54);
			p8.add(tf40);
			p8.add(l55);
			p8.add(tf41);
			p8.add(b5);
			p8.add(b6);
			p8.add(b7);
			p7.add(p9);
			p7.add(p8);
			c.add(p7);
		mb.setVisible(false);
		}
 				
		if(logout.isArmed())
		{
		b18.setVisible(false);
		mb.setVisible(false);
		p4.setVisible(false);
		p7.setVisible(false);
		p12.setVisible(false);
		p16.setVisible(false);
		p20.setVisible(false);
		p23.setVisible(false);
		p24.setVisible(false);
		p25.setVisible(false);
		c.remove(b12);
		tf1.setText("");
		tf2.setText("");
		p1.setVisible(true);
		p2.setVisible(true);
		
			}
		if(ci.isArmed())
		{
		b18.setVisible(false);
		c.remove(b12);
		p23.setVisible(false);
		p24.setVisible(false);
		p25.setVisible(false);
		p4.setVisible(false);
		p7.setVisible(false);
		p16.setVisible(false);
		p20.setVisible(false);
		tf42.setText("");tf43.setText("");
		mb.setVisible(false);
			p11.setBounds(400,400,250,50);
			p13.setBounds(650,400,250,50);
     		p10.setBounds(0,0,1366,400);
			p10.setVisible(true);
			p11.setVisible(true);
			p12.setVisible(true);
			p13.setVisible(true);
			p10.add(l6);
			p10.add(l7);
			p10.add(l8);
			p10.add(l56);
			p11.add(l57);
			p11.add(tf42);
			p11.add(l58);
			p11.add(tf43);
			p13.add(b8);
			p13.add(b9);
			p13.add(b10);
			p12.add(p10);
			p12.add(p11);
			p12.add(p13);
			c.add(p12);
			}
			if(vt.isArmed())
		{
		b18.setVisible(false);
		p23.setVisible(false);
		p24.setVisible(false);
		p25.setVisible(false);
		p4.setVisible(false);
		p16.setVisible(false);
		p17.setVisible(false);
		p20.setVisible(false);
		p7.setVisible(false);
		tf44.setText("");tf45.setText("");
		tf44.setEditable(true);
		mb.setVisible(false);
		p15.setBounds(300,200,800,100);
		b12.setBounds(1000,520,100,30);
		p14.setBounds(0,0,1366,200);			
		p14.setVisible(true);
			p15.setVisible(true);
			p16.setVisible(true);
			p14.add(l6);
			p14.add(l7);
			p14.add(l8);
			p14.add(l69);
			p15.add(l70);
			p15.add(tf44);
			p15.add(l71);
			p15.add(tf45);
			p15.add(b11);
			// p15.add(b12);
			p16.add(p14);
			p16.add(p15);
			c.add(b12);
			c.add(p16);
			}
			if(bl.isArmed())
		{
		b18.setVisible(false);
		c.remove(b12);
		p23.setVisible(false);
		p24.setVisible(false);
		p25.setVisible(false);
		p4.setVisible(false);
		p7.setVisible(false);
		p12.setVisible(false);
		p16.setVisible(false);
		tf62.setText("");
			p19.setBounds(500,300,350,75);	
     		p18.setBounds(0,0,1366,200);		
		mb.setVisible(false);
		p18.setVisible(true);
		p19.setVisible(true);
		p20.setVisible(true);
			p18.add(l6);
			p18.add(l7);
			p18.add(l8);
			p18.add(l74);
			p19.add(l73);
			p19.add(tf62);
			p19.add(b13);
			p19.add(b14);
			p20.add(p18);
			p20.add(p19);
			c.add(p20);
			}
			if(f.equals("Save"))
			{
			b18.setVisible(false);
			s1=tf3.getText();s2=tf4.getText();s3=tf5.getText();s4=tf6.getText();s5=tf7.getText();s6=tf8.getText();s7=tf9.getText();s8=tf10.getText();s9=tf11.getText();s10=tf12.getText();s11=tf13.getText();s12=tf14.getText();s13=tf15.getText();s14=tf16.getText();s15=tf17.getText();
			if(s1.equals("")||s2.equals("")||s3.equals("")||s4.equals("")||s5.equals("")||s6.equals("")||s7.equals("")||s8.equals("")||s9.equals("")||s10.equals("")||s11.equals("")||s12.equals("")||s13.equals("")||s14.equals("")||s15.equals(""))
			{
			String message ="NO FIELD SHOULD BE LEFT EMPTY";
			JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
			}
			else
			{

			p4.setVisible(false);
			p5.setVisible(false);
			p6.setVisible(false);
			p7.setVisible(false);
			p8.setVisible(false);			
			mb.setVisible(true);
			
			Connection con2=null;
		try
		{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con2=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=con2.createStatement();
ResultSet rs=st.executeQuery("select * from bl where vehicle_no=\'"+s6+"\'");
if(!rs.next())
{
System.out.println("hello");
System.out.println("came");
Connection co=null;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
co=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
PreparedStatement pstmt = co.prepareStatement("insert into lsgp_entry_reg values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
pstmt.setString(1,s1);
pstmt.setString(2,s2);
pstmt.setString(3,s3);
pstmt.setString(4,s4);
pstmt.setString(5,s5);
pstmt.setString(6,s6);
pstmt.setString(7,s7);
pstmt.setString(8,s8);
pstmt.setString(9,s9);
pstmt.setString(10,s10);
pstmt.setString(11,s11);
pstmt.setString(12,s12);
pstmt.setString(13,s13);
pstmt.setString(14,s14);
pstmt.setString(15,s15);
int i=pstmt.executeUpdate();
if(i==1)
{
String message="Saved";
JOptionPane.showMessageDialog(new JFrame(), message, "Dialog",
        JOptionPane.ERROR_MESSAGE);
return;
}
}
else
{
						String message ="Entered vehicle is in black list con'nt save";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}
}
catch(Exception exnd)
{
String message=exnd+"";
JOptionPane.showMessageDialog(new JFrame(), message, "Not Saved",
        JOptionPane.ERROR_MESSAGE);
System.out.println(exnd);
}
			}
			}
			
			if(f.equals("save."))
			{
			b18.setVisible(false);
			s40=tf42.getText();s41=tf43.getText();
			if(s40.equals("")||s41.equals(""))
			{
						String message ="NO FIELD SHOULD BE LEFT EMPTY";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
			}
			else
			{
			p10.setVisible(false);
			p11.setVisible(false);
			p12.setVisible(false);
			mb.setVisible(true);
			try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
PreparedStatement pstmt1 = con.prepareStatement("insert into cisf_entry_details values(?,?)");
pstmt1.setString(1,s40);
pstmt1.setString(2,s41);
int i=pstmt1.executeUpdate();
if(i==1)
{
			String message ="Saved Successfully";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);
}

}
catch(Exception ex)
{
			String message =ex+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}
			
			
			
			}
			}
			if(f.equals("save"))
			{
			b18.setVisible(false);
			s16=tf18.getText();s17=tf19.getText();s18=tf20.getText();s19=tf21.getText();s20=tf22.getText();s21=tf23.getText();s22=tf24.getText();s23=tf25.getText();s24=tf26.getText();s25=tf27.getText();s26=tf28.getText();s27=tf29.getText();s28=tf30.getText();s29=tf31.getText();s30=tf32.getText();s31=tf33.getText();s32=tf34.getText();s33=tf35.getText();s34=tf36.getText();s35=tf37.getText();s36=tf38.getText();s37=tf39.getText();s38=tf40.getText();s39=tf41.getText();
			if(s16.equals("")||s17.equals("")||s18.equals("")||s19.equals("")||s20.equals("")||s21.equals("")||s22.equals("")||s23.equals("")||s24.equals("")||s25.equals("")||s26.equals("")||s27.equals("")||s28.equals("")||s29.equals("")||s30.equals("")||s31.equals("")||s32.equals("")||s33.equals("")||s34.equals("")||s35.equals("")||s36.equals("")||s37.equals("")||s38.equals("")||s39.equals(""))
			{
			String message ="NO FIELD SHOULD BE LEFT EMPTY";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
			}
			else
			{
			p4.setVisible(false);
			p9.setVisible(false);
			p6.setVisible(false);
			p7.setVisible(false);
			p8.setVisible(false);
			mb.setVisible(true);
			Connection con1=null;
		try
		{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con1=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=con1.createStatement();
ResultSet rs=st.executeQuery("select * from bl where vehicle_no=\'"+s23+"\'");
if(!rs.next())
{
System.out.println("came");
Connection conn=null;
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
conn=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
PreparedStatement pstmt = conn.prepareStatement("insert into lsgp_exit_registration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
pstmt.setString(1,s16);
pstmt.setString(2,s17);
pstmt.setString(3,s18);
pstmt.setString(4,s19);
pstmt.setString(5,s20);
pstmt.setString(6,s21);
pstmt.setString(7,s22);
pstmt.setString(8,s23);
pstmt.setString(9,s24);
pstmt.setString(10,s25);
pstmt.setString(11,s26);
pstmt.setString(12,s27);
pstmt.setString(13,s28);
pstmt.setString(14,s29);
pstmt.setString(15,s30);
pstmt.setString(16,s31);
pstmt.setString(17,s32);
pstmt.setString(18,s33);
pstmt.setString(19,s34);
pstmt.setString(20,s35);
pstmt.setString(21,s36);
pstmt.setString(22,s37);
pstmt.setString(23,s38);
pstmt.setString(24,s39);
int i=pstmt.executeUpdate();
if(i==1)
{
			String message ="SUCCESSFULLY SAVED";
			JOptionPane.showMessageDialog(new JFrame(), message, "MESSAGE",
        JOptionPane.ERROR_MESSAGE);
}
}
}
catch(Exception ex)
{
			String message =ex+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
System.out.println(ex);
}
			}
			}
			
			if(f.equals("save."))
			{
			b18.setVisible(false);
			s40=tf42.getText();s41=tf43.getText();
			if(s40.equals("")||s41.equals(""))
			{
			
			}
			else
			{
			p4.setVisible(false);
			p7.setVisible(false);
			p12.setVisible(false);
			p16.setVisible(false);
			p20.setVisible(false);
			p11.setVisible(false);
			p23.setVisible(false);
			p26.setVisible(false);
			mb.setVisible(true);
			try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
PreparedStatement pstmt1 = con.prepareStatement("insert into cisf_entry_details values(?,?)");
pstmt1.setString(1,s40);
pstmt1.setString(2,s41);
int i=pstmt1.executeUpdate();
if(i==1)
{
return;
}

}
catch(Exception ex)
{
System.out.println("exception");
}
			}
			}

			if(f.equals("display.."))
			{
			b18.setVisible(false);
			tf46.setText("");tf47.setText("");tf48.setText("");tf49.setText("");tf50.setText("");tf51.setText("");tf52.setText("");tf53.setText("");tf54.setText("");tf55.setText("");tf56.setText("");tf57.setText("");tf58.setText("");tf59.setText("");tf60.setText("");tf61.setText("");
			s42=tf44.getText();s43=tf45.getText();
			mb.setVisible(true);
		p17.setBounds(300,300,800,200);
			p4.setVisible(false);
			p7.setVisible(false);
			p12.setVisible(false);
			p20.setVisible(false);
			p23.setVisible(false);
			p24.setVisible(false);
			p25.setVisible(false);
			p14.setVisible(false);
			p15.setVisible(false);
			p17.setVisible(true);
			// p16.setVisible(false);
			p17.add(l72);
			p17.add(l59);
			p17.add(l60);
			p17.add(l61);
			p17.add(tf46);
			p17.add(tf47);
			p17.add(l62);
			p17.add(tf48);
			p17.add(tf49);
			p17.add(l63);
			p17.add(tf50);
			p17.add(tf51);
			p17.add(l64);
			p17.add(tf52);
			p17.add(tf53);
			p17.add(l65);
			p17.add(tf54);
			p17.add(tf55);
			p17.add(l66);
			p17.add(tf56);
			p17.add(tf57);
			p17.add(l67);
			p17.add(tf58);
			p17.add(tf59);
			p17.add(l68);
			p17.add(tf60);
			p17.add(tf61);
			p16.add(p17);
			p14.setVisible(true);
			p15.setVisible(true);
			c.add(p16);
			Connection con=null;


try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from vt where vehicle_no=\'"+s42+"\'");
while(rs.next())
{
tf44.setText(rs.getObject(1)+"");
tf45.setText(rs.getObject(2)+"");
tf46.setText(rs.getObject(3)+"");
tf47.setText(rs.getObject(4)+"");
tf48.setText(rs.getObject(5)+"");
tf49.setText(rs.getObject(6)+"");
tf50.setText(rs.getObject(7)+"");
tf51.setText(rs.getObject(8)+"");
tf52.setText(rs.getObject(9)+"");
tf53.setText(rs.getObject(10)+"");
tf54.setText(rs.getObject(11)+"");
tf55.setText(rs.getObject(12)+"");
tf56.setText(rs.getObject(13)+"");
tf57.setText(rs.getObject(14)+"");
tf58.setText(rs.getObject(15)+"");
tf59.setText(rs.getObject(16)+"");
tf60.setText(rs.getObject(17)+"");
tf61.setText(rs.getObject(18)+"");
}
}
catch(Exception ex1)
{
}
tf44.setEditable(false);
			}
			if(f.equals("ok"))
			{
			b18.setVisible(false);
			s46=tf62.getText();
			if(s46.equals(""))
			{
						String message ="No Field Should Be Left Empty";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
			}
			else
			{
			System.out.println("xp");
			p19.setVisible(false);
			p18.setVisible(false);
			p20.setVisible(false);
			mb.setVisible(true);
			try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection conn=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
PreparedStatement pstmt = conn.prepareStatement("insert into bl values(?)");
pstmt.setString(1,s46);
int i=pstmt.executeUpdate();
if(i==1)
{
			String message ="Black List Updated Successfully";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);
}

}
catch(Exception ex)
{
System.out.println("exception");
}
			
			}			
}

			if(f.equals("Display"))
			{
			b18.setVisible(false);
			l75.setBounds(500,300,180,32);
			tf63.setBounds(680,300,280,32);
			b15.setBounds(960,300,128,32);
			p23.setVisible(true);
			p4.setVisible(false);
			p5.setVisible(false);
			p6.setVisible(false);
			p7.setVisible(false);
			p8.setVisible(false);			
			mb.setVisible(true);
			p23.add(l75);
			p23.add(tf63);
			p23.add(b15);
			c.add(p23);
			}
			if(f.equals("Show"))
			{
			System.out.println(s64);
			if(s64.equals("Update"))
			{
			b21.setVisible(true);
			s64="";
			}
			b18.setVisible(false);
		p6.setBounds(300,220,800,300);
		p5.setBounds(0,20,1366,200);
			p6.remove(b1);
			p6.remove(b2);
			p6.remove(b3);
			p6.remove(b4);
			p4.setVisible(true);
			p5.setVisible(true);
			p6.setVisible(true);
			mb.setVisible(true);
			p23.setVisible(false);
			p30.setVisible(false);
			s47=tf63.getText();
			System.out.println(s47);
			Connection cond1=null;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
cond1=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=cond1.createStatement();
ResultSet rs=st.executeQuery("select * from lsgp_entry_reg where vehicle_no=\'"+s47+"\'");
while(rs.next())
{
tf63.setText("");
System.out.println("came");
tf3.setText(rs.getObject(1)+"");
 tf4.setText(rs.getObject(2)+"");
 tf5.setText(rs.getObject(3)+"");
 tf6.setText(rs.getObject(4)+"");
 tf7.setText(rs.getObject(5)+"");
 tf8.setText(rs.getObject(6)+"");
tf9.setText(rs.getObject(7)+"");
 tf10.setText(rs.getObject(8)+"");
 tf11.setText(rs.getObject(9)+"");
 tf12.setText(rs.getObject(10)+"");
 tf13.setText(rs.getObject(11)+"");
 tf14.setText(rs.getObject(12)+"");
 tf15.setText(rs.getObject(13)+"");
 tf16.setText(rs.getObject(14)+"");
 tf17.setText(rs.getObject(15)+"");

		
}
}
catch(Exception te)
{
}
tf6.setEditable(false);			
			
			
			}
			
			if(f.equals("display"))
			{
			b18.setVisible(false);
			p24.setVisible(true);
			l75.setBounds(500,300,180,32);
			tf63.setBounds(680,300,280,32);
			b16.setBounds(960,300,128,32);
			p24.setVisible(true);
			p7.setVisible(false);
			p8.setVisible(false);
			p9.setVisible(false);
			mb.setVisible(true);
			p24.add(l75);
			p24.add(tf63);
			p24.add(b16);
			c.add(p24);
			}
			
			if(f.equals("show"))
			{
			System.out.println("hai"+s64);
			if(s64.equals("update"))
			{
			System.out.println("hfgfgfjhfhf");
			b20.setVisible(true);
			s64="";
			}
			tf18.setEditable(false);
		p8.setBounds(300,220,800,300);
		p9.setBounds(0,20,1366,200);
			b18.setVisible(false);
			// p6.remove(b4);
			p7.setVisible(true);
			p8.setVisible(true);
			p9.setVisible(true);
			mb.setVisible(true);
			p28.setVisible(false);
			p24.setVisible(false);
			p8.remove(b5);
			p8.remove(b6);
			p8.remove(b7);
			s47=tf63.getText();
			System.out.println(s47);
			Connection cond1=null;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
cond1=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=cond1.createStatement();
ResultSet rs=st.executeQuery("select * from lsgp_exit_registration where ls_no=\'"+s47+"\'");
while(rs.next())
{ 
tf63.setText("");
System.out.println("came");
tf18.setText(rs.getObject(1)+"");
 tf19.setText(rs.getObject(2)+"");
 tf20.setText(rs.getObject(3)+"");
 tf21.setText(rs.getObject(4)+"");
 tf22.setText(rs.getObject(5)+"");
 tf23.setText(rs.getObject(6)+"");
tf24.setText(rs.getObject(7)+"");
 tf25.setText(rs.getObject(8)+"");
 tf26.setText(rs.getObject(9)+"");
 tf27.setText(rs.getObject(10)+"");
 tf28.setText(rs.getObject(11)+"");
 tf29.setText(rs.getObject(12)+"");
 tf30.setText(rs.getObject(13)+"");
 tf31.setText(rs.getObject(14)+"");
 tf32.setText(rs.getObject(15)+"");
  tf33.setText(rs.getObject(16)+"");
tf34.setText(rs.getObject(17)+"");
 tf35.setText(rs.getObject(18)+"");
 tf36.setText(rs.getObject(19)+"");
 tf37.setText(rs.getObject(20)+"");
 tf38.setText(rs.getObject(21)+"");
 tf39.setText(rs.getObject(22)+"");
 tf40.setText(rs.getObject(23)+"");
 tf41.setText(rs.getObject(24)+"");

		
}

}
catch(Exception te)
{
			String message =te+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}
			
			
			
			}
			
			

			
	if(f.equals("display."))
			{
			b18.setVisible(false);
			l75.setBounds(500,300,180,32);
			tf63.setBounds(680,300,280,32);
			b17.setBounds(960,300,128,32);
			p25.setVisible(true);
			p10.setVisible(false);
			p11.setVisible(false);
			p12.setVisible(false);
			p13.setVisible(false);
			mb.setVisible(true);
			p25.add(l75);
			p25.add(tf63);
			p25.add(b17);
			c.add(p25);
			}
			
			if(f.equals("show."))
			{
			System.out.println(s64);
			if(s64.equals("update."))
			{
			b18.setVisible(true);
			s64="";
			}
			System.out.println("came");
			p11.setBounds(400,420,250,50);
			p10.setBounds(0,20,1366,400);
			p10.setVisible(true);
			p11.setVisible(true);
			p12.setVisible(true);
			mb.setVisible(true);
			p25.setVisible(false);
			p13.setVisible(false);
			p26.setVisible(false);
			s47=tf63.getText();
			System.out.println(s47);
			Connection cond1=null;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
cond1=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=cond1.createStatement();
ResultSet rs=st.executeQuery("select * from cisf_entry_details where cisf_person_no=\'"+s47+"\'");
while(rs.next())
{
tf63.setText("");
System.out.println("came");
tf42.setText(rs.getObject(1)+"");
 tf43.setText(rs.getObject(2)+"");
		
}
}
catch(Exception te)
{
			String message =te+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}
			
	tf42.setEditable(false);		
			}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//=====================================================================update===============================================================================
if(f.equals("update.."))
{
b18.setVisible(false);
p16.setVisible(false);
mb.setVisible(true);
c.remove(b12);
Connection conn=null;
try
{
s42=tf44.getText();s43=tf45.getText();s48=tf46.getText();s49=tf47.getText();s50=tf48.getText();s51=tf49.getText();s52=tf50.getText();s53=tf51.getText();s54=tf52.getText();s55=tf53.getText();s56=tf54.getText();s57=tf55.getText();s58=tf56.getText();s59=tf57.getText();s60=tf58.getText();s61=tf59.getText();s62=tf60.getText();s63=tf61.getText();
System.out.println("value"+s42);
SimpleDateFormat formatter ; 
   formatter = new SimpleDateFormat("yyyy-MM-dd");
  java.util.Date d1 =formatter.parse(s48); 
  java.util.Date d2 =formatter.parse(s50); 
  java.util.Date d3 =formatter.parse(s52); 
  java.util.Date d4 =formatter.parse(s54); 
  java.util.Date d5 =formatter.parse(s56); 
  java.util.Date d6 =formatter.parse(s58); 
  java.util.Date d7 =formatter.parse(s60); 
  java.util.Date d8 =formatter.parse(s62); 
  java.sql.Date nd1= new java.sql.Date(d1.getTime());
  java.sql.Date nd2= new java.sql.Date(d2.getTime());
  java.sql.Date nd3= new java.sql.Date(d3.getTime());
  java.sql.Date nd4= new java.sql.Date(d4.getTime());
  java.sql.Date nd5= new java.sql.Date(d5.getTime());
  java.sql.Date nd6= new java.sql.Date(d6.getTime());
  java.sql.Date nd7= new java.sql.Date(d7.getTime());
  java.sql.Date nd8= new java.sql.Date(d8.getTime());
conn=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
PreparedStatement pstmt1 = conn.prepareStatement("update vt set ls_no =?,in_date=?,in_time=?,ls_date=?,ls_time=?,tare_date=?,tare_time=?,yard_in_date=?,yard_in_time=?,yard_out_date=?,yard_out_time=?,gross_date=?,gross_time=?,dc_date=?,dc_time=?,out_date=?,out_time=? where vehicle_no=?");
pstmt1.setString(1,s43);
pstmt1.setDate(2,nd1);
pstmt1.setString(3,s49);
pstmt1.setDate(4,nd2);
pstmt1.setString(5,s51);
pstmt1.setDate(6,nd3);
pstmt1.setString(7,s53);
pstmt1.setDate(8,nd4);
pstmt1.setString(9,s55);
pstmt1.setDate(10,nd5);
pstmt1.setString(11,s57);
pstmt1.setDate(12,nd6);
pstmt1.setString(13,s59);
pstmt1.setDate(14,nd7);
pstmt1.setString(15,s61);
pstmt1.setDate(16,nd8);
pstmt1.setString(17,s63);
pstmt1.setString(18,s42);
int j=pstmt1.executeUpdate();
if(j>=1)
{
			String message ="Updated Successfully";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);
}
}
catch(Exception  eu)
{
			String message =eu+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}
}
if(f.equals("update."))
{
p26.setVisible(true);
b18.setVisible(false);
s64=f;
			l76.setBounds(500,300,180,32);
			tf63.setBounds(680,300,280,32);
			b17.setBounds(960,300,128,32);
			p27.setBounds(650,418,250,32);
p12.setVisible(false);
p26.add(l76);
p26.add(tf63);
p26.add(b17);
p27.add(b18);
c.add(p27);
c.add(p26);

}
if(f.equals("Change"))
{
b18.setVisible(false);
Connection connu=null;
try
{
s40=tf42.getText();s41=tf43.getText();
connu=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
PreparedStatement pstmt1 = connu.prepareStatement("update cisf_entry_details set cisf_person_name=? where cisf_person_no=?");
pstmt1.setString(1,s41);
pstmt1.setString(2,s40);
int j=pstmt1.executeUpdate();
if(j>=1)
{
			String message ="Updated Successfully";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);
}
}
catch(Exception  enu)
{
			String message =enu+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}

}
if(f.equals("update"))
{
p7.setVisible(false);
p28.setVisible(true);
b20.setVisible(false);
s64=f;
			l76.setBounds(500,300,180,32);
			tf63.setBounds(680,300,280,32);
			b19.setBounds(960,300,128,32);
			p29.setBounds(800,532,250,32);
p12.setVisible(false);
p28.add(l76);
p28.add(tf63);
p28.add(b19);
p29.add(b20);
c.add(p29);
c.add(p28);

}


if(f.equals("change"))
{
b20.setVisible(false);
Connection connu=null;
try
{

s16=tf18.getText();s17=tf19.getText();s18=tf20.getText();s19=tf21.getText();s20=tf22.getText();s21=tf23.getText();s22=tf24.getText();s23=tf25.getText();s24=tf26.getText();s25=tf27.getText();s26=tf28.getText();s27=tf29.getText();s28=tf30.getText();s29=tf31.getText();s30=tf32.getText();s31=tf33.getText();s32=tf34.getText();s33=tf35.getText();s34=tf36.getText();s35=tf37.getText();s36=tf38.getText();s37=tf39.getText();s38=tf40.getText();s39=tf41.getText();
SimpleDateFormat formatter ; System.out.println("ohihhsdhevudu"+s19);
   formatter = new SimpleDateFormat("yyyy-MM-dd");
  java.util.Date d1 =formatter.parse(s19); 
  java.util.Date d2 =formatter.parse(s20); 
  java.sql.Date nd1= new java.sql.Date(d1.getTime());
  java.sql.Date nd2= new java.sql.Date(d2.getTime());
connu=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
PreparedStatement pstmt1 = connu.prepareStatement("update lsgp_exit_registration set vehicle_no=?,in_slno=?,out_slno=?,in_date=?,out_date=?,in_time=?,out_time=?,vehicle_type=?,do_no=?,material=?,person_in_no=?,shift_in=?,person_out_no=?,shift_out=?,person_ic_no=?,party=?,dc_no=?,out_qty=?,customer=?,destination=?,lc_no=?,driver=?,remarks=? where ls_no=?");
pstmt1.setString(1,s25);
pstmt1.setString(2,s17);
pstmt1.setString(3,s18);
pstmt1.setDate(4,nd1);
pstmt1.setDate(5,nd2);
pstmt1.setString(6,s21);
pstmt1.setString(7,s22);
pstmt1.setString(8,s23);
pstmt1.setString(9,s24);
pstmt1.setString(10,s26);
pstmt1.setString(11,s27);
pstmt1.setString(12,s28);
pstmt1.setString(13,s29);
pstmt1.setString(14,s30);
pstmt1.setString(15,s31);
pstmt1.setString(16,s32);
pstmt1.setString(17,s33);
pstmt1.setString(18,s34);
pstmt1.setString(19,s35);
pstmt1.setString(20,s36);
pstmt1.setString(21,s37);
pstmt1.setString(22,s38);
pstmt1.setString(23,s39);
pstmt1.setString(24,s16);
int j=pstmt1.executeUpdate();
if(j>=1)
{
			String message ="Updated Successfully";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);
}
}
catch(Exception  exu)
{
			String message =exu+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);

}

}
if(f.equals("Update"))
{
p4.setVisible(false);
p30.setVisible(true);
b21.setVisible(false);
s64=f;
			l76.setBounds(500,300,180,32);
			tf63.setBounds(680,300,280,32);
			b15.setBounds(960,300,128,32);
			p31.setBounds(800,532,250,32);
p12.setVisible(false);
p30.add(l76);
p30.add(tf63);
p30.add(b15);
p31.add(b21);
c.add(p31);
c.add(p30);
}


if(f.equals("change."))
{
b21.setVisible(false);
Connection connu=null;
try
{
s1=tf3.getText();s2=tf4.getText();s3=tf5.getText();s4=tf6.getText();s5=tf7.getText();s6=tf8.getText();s7=tf9.getText();s8=tf10.getText();s9=tf11.getText();s10=tf12.getText();s11=tf13.getText();s12=tf14.getText();s13=tf15.getText();s14=tf16.getText();s15=tf17.getText();
SimpleDateFormat formatter ; 
   formatter = new SimpleDateFormat("yyyy-MM-dd");
  java.util.Date d1 =formatter.parse(s2); 
  java.sql.Date nd1= new java.sql.Date(d1.getTime());
connu=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
PreparedStatement pstmt1 = connu.prepareStatement("update lsgp_entry_reg set in_slno=?,in_date=?,in_time=?,party=?,vehicle_no=?,vehicle_type=?,person_in_no=?,person_ic_no=?,shift_in=?,do_no=?,material=?,lc_no=?,driver=?,destination=? where ls_no=?");
pstmt1.setString(1,s1);
pstmt1.setDate(2,nd1);
pstmt1.setString(3,s3);
pstmt1.setString(4,s5);
pstmt1.setString(5,s6);
pstmt1.setString(6,s7);
pstmt1.setString(7,s8);
pstmt1.setString(8,s9);
pstmt1.setString(9,s10);
pstmt1.setString(10,s11);
pstmt1.setString(11,s12);
pstmt1.setString(12,s13);
pstmt1.setString(13,s14);
pstmt1.setString(14,s15);
pstmt1.setString(15,s4);
int j=pstmt1.executeUpdate();
if(j>=1)
{
return;
}
}
catch(Exception  exu)
{
System.out.println("Exception :"+exu); 
}

}
if(f.equals("cancel"))	
{
p20.setVisible(false);
mb.setVisible(true);
}
if(sh.isArmed())
{
Connection consh1=null;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
consh1=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=consh1.createStatement();
int rs=st.executeUpdate("delete bl");
if(rs==1)
{
String message =" Shift Closing Done On Black List";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);
}

}
catch(Exception sh1)
{
			String message =sh1+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}
Connection consh2=null;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
consh2=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=consh2.createStatement();
int rs=st.executeUpdate("delete cisf_entry_details");
if(rs==1)
{
String message =" Shift Closing Done On CISF PERSON ENTRY DETAILS";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);
}

}
catch(Exception sh2)
{
			String message =sh2+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}
Connection consh3=null;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
consh3=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=consh3.createStatement();
int rs=st.executeUpdate("delete lsgp_exit_registration");
if(rs==1)
{
String message =" Shift Closing Done On LSGP EXIT REGISTRATION";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);
}

}
catch(Exception sh3)
{
			String message =sh3+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}
Connection consh4=null;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
consh4=DriverManager.getConnection("jdbc:odbc:dinu","system","tiger");
Statement st=consh4.createStatement();
int rs=st.executeUpdate("delete lsgp_entry_reg");
if(rs==1)
{
String message =" Shift Closing Done On LSGP ENTRY REGISTRATION";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);
}

}
catch(Exception sh4)
{
			String message =sh4+"";
			JOptionPane.showMessageDialog(new JFrame(), message, "Error",
        JOptionPane.ERROR_MESSAGE);
}
String message =" Temporary Data got Erased Using Shift Closing";
			JOptionPane.showMessageDialog(new JFrame(), message, "Message",
        JOptionPane.ERROR_MESSAGE);

}

}

	public static void main(String args[])
	{
  		M md=new M();
  		md.setTitle("CISF VEHICLE REGISTRATION SYSTEM");
  		md.setSize(1366,768);
  		md.show();
	}
}