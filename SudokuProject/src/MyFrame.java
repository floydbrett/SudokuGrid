import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
	
	MyFrame(){
		
		JLayeredPane pane = new JLayeredPane();
		
		JPanel startScreen = new JPanel();
		startScreen.setOpaque(true);
		startScreen.setBounds(0,0,600,600);
		startScreen.setBackground(Color.LIGHT_GRAY);
		startScreen.setLayout(new FlowLayout(FlowLayout.CENTER, 200,200));
		
		MyPuzzle puzzle = new MyPuzzle();
		
		JButton start = new JButton("Start");
		start.setPreferredSize(new Dimension(150,50));
		start.setFont(new Font("Times New Roman", Font.BOLD, 30));
		start.setFocusable(false);
		
		start.addActionListener(e -> pane.remove(startScreen));
		start.addActionListener(e -> pane.add(puzzle));
		start.addActionListener(e -> pane.validate());
		start.addActionListener(e -> pane.repaint());
		
		startScreen.add(start);
		
		pane.add(startScreen);
		pane.setBounds(0,0,500,600);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(615,640);
		this.setResizable(false);
		this.add(pane);
		this.setVisible(true);
		
		
		
		
		
		
		
		
		
	}

}
