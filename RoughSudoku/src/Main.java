import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,500);
		frame.setLayout(new BorderLayout());
		
		ImageIcon logo = new ImageIcon("logo.png");
		
		boolean[][] isGiven = 
			{{false, true, false, false, false, false, false, false, false},
			 {true, false, false, false, false, false, false, false, false},
			 {false, false, true, false, false, false, false, false, false},
			 {false, false, false, false, false, false, false, true, false},
			 {false, true, false, false, false, false, false, false, false},
			 {false, false, false, false, false, false, true, false, false},
			 {false, false, false, false, true, false, false, false, false},
			 {false, false, false, false, false, false, false, false, false},
			 {false, false, false, false, false, false, false, false, true}};
		
		int [][] givenDigits = 
			{{0, 1, 0, 0, 0, 0, 0, 0, 0},
			 {5, 0, 0, 0, 0, 0, 0, 0, 0},
			 {0, 0, 6, 0, 0, 0, 0, 0, 0},
			 {0, 0, 0, 0, 0, 0, 0, 7, 0},
			 {0, 2, 0, 0, 0, 0, 0, 0, 0},
			 {0, 0, 0, 0, 0, 0, 8, 0, 0},
			 {0, 0, 0, 0, 5, 0, 0, 0, 0},
			 {0, 0, 0, 0, 0, 0, 0, 0, 0},
			 {0, 0, 0, 0, 0, 0, 0, 0, 9}};
		
		JPanel grid = new JPanel();
		grid.setLayout(new GridLayout(3,3,5,5));
		grid.setBackground(Color.black);
		
		JPanel box[] = new JPanel[9];
		JTextField cell[]= new JTextField[10];
		
		for(int i = 0; i < 9; i++) {
			box[i] = new JPanel();
			box[i].setLayout(new GridLayout(3,3,0,0));
			
			for(int j = 0; j < 9; j++) {
				
				cell[j] = new JTextField();
				cell[j].setPreferredSize(new Dimension(50,50));
				cell[j].setHorizontalAlignment(JTextField.CENTER);
				cell[j].setFont(new Font("Times New Roman", Font.BOLD, 25));
				if(isGiven[i][j]) {
					cell[j].setText(String.valueOf(givenDigits[i][j]));
					cell[j].setEditable(false);
				}
				box[i].add(cell[j]);
				
				
			}
			
			grid.add(box[i]);
		}

		
		JLabel label = new JLabel();
		label.setText("Sudoku Maker");
		label.setForeground(Color.white);
		label.setFont(new Font("Times New Roman", Font.BOLD, 40));
		
		JPanel title = new JPanel();
		title.setBackground(Color.DARK_GRAY);
		title.setPreferredSize(new Dimension(100, 50));
		title.add(label);
		
		frame.add(grid);
		frame.setIconImage(logo.getImage());
		frame.add(title, BorderLayout.NORTH);
		frame.setVisible(true);
		
		
	}
}
