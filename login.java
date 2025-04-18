package quiz.application;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	
	JButton rules,back;
	JTextField tfname;
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.jpeg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0,0,600,500);
		add(image);
		
		JLabel heading = new JLabel("simle minds");
		heading.setBounds(810, 150,300,20);
		heading.setFont(new Font("mongolian Balti", Font.BOLD, 18));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		JLabel name = new JLabel("Enter Your name");
		name.setBounds(750, 60,300,45);
		name.setFont(new Font("mongolian Balti", Font.BOLD, 40));
		name.setForeground(Color.BLUE);
		add(name);
		
	    tfname = new JTextField();
		tfname.setBounds(915,200,300,25);
		tfname.setFont(new Font("Times new Roman",Font.BOLD,20));
		add(tfname);
		
	    rules = new JButton("Rules");
		rules.setBounds(735,270,125,25);
		rules.setForeground(new Color(30,144,254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
	    back= new JButton("Back");
		back.setBounds(735,270,120,25);
		back.setForeground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		setSize(1200,500);
		setLocation(200,200);
		setVisible(true);
		
	}
	public void actionperformed(ActionEvent ae) {
		if (ae.getSource()== rules) {
			String name = tfname.getText();
			setVisible(false);
			new Rules(name);
			
		} else if (ae.getSource()== back) {
			
		}
		
	}
	
	public static void main(String[] args) {
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
