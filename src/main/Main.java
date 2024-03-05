package main;

import javax.swing.JFrame;

public class Main {

public static void main(String[] args) {
			
			JFrame window = new JFrame();
			window.setTitle("Dragon_invaders of YisiniT_HoanDuy");
			window.setResizable(false);
			window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			GamePanel gamePanel = new GamePanel();
			window.add(gamePanel);
			
			window.pack();
			
			window.setLocationRelativeTo(null);
			window.setVisible(true);
			
			gamePanel.startGameThread();
		}
	}
