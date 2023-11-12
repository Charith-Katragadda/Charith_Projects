package org.cherry;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GameFrame() {
		GamePanel gp1= new GamePanel();
		 gp1.setLayout(new BorderLayout());
		
		this.add(gp1, BorderLayout.CENTER);
		
		/*JButton startButton= new JButton("Restart");
		this.add(startButton, BorderLayout.NORTH);
		
		JButton xyzButton= new JButton("xyz");
		this.add(xyzButton, BorderLayout.SOUTH);*/
		
		this.addKeyListener(gp1.new MyKeyAdapter());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(650, 650));
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		

	}
	
	public void testMethod() {
		
	}

}