package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules  extends JFrame implements ActionListener{
    String name;
    JButton start,back;
	Rules(String name){
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Welcome" + name + "to simple minds");
		heading.setBounds(30, 20,700,30);
		heading.setFont(new Font("mongolian Balti", Font.BOLD, 28));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel rules = new JLabel("Welcome" + name + "to simple minds");
		rules.setBounds(20, 90,700,350);
		rules.setFont(new Font("mongolian Balti", Font.PLAIN, 16));
		rules.setText("<html>\"+ \r\n"
				+ "                \"1. You are trained to be a programmer and not a story teller, answer point to point\" + \"<br><br>\" +\r\n"
				+ "                \"2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer\" + \"<br><br>\" +\r\n"
				+ "                \"3. You may have lot of options in life but here all the questions are compulsory\" + \"<br><br>\" +\r\n"
				+ "                \"4. Crying is allowed but please do so quietly.\" + \"<br><br>\" +\r\n"
				+ "                \"5. Only a fool asks and a wise answers (Be wise, not otherwise)\" + \"<br><br>\" +\r\n"
				+ "                \"6. Do not get nervous if your friend is answering more questions\" + \"<br><br>\" +\r\n"
				+ "                \"7. Brace yourself, this paper is not for the faint hearted\" + \"<br><br>\" +\r\n"
				+ "            \"<html>\"");
		add(rules);
		
		
		
	    back= new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setForeground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		start = new JButton("Start");
		start.setBounds(400, 500,100,30);
		start.setForeground(new Color(30,144,254));
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);
		
		
		setSize(800,650);
		setLocation(350,100);
		setVisible(true);
	}
	public void actionperformed(ActionEvent ae) {
		if (ae.getSource()==start) {
			setVisible(false);
			new Quiz(name);
			
		}else {
			setVisible(false);
			new Login();
		}
	}
	
	public static void main(String[] args) {
		new  Rules("user");
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
