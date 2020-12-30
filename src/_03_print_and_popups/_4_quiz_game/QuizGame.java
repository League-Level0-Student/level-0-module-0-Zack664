package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String qanda = JOptionPane.showInputDialog ("What has many keys but can't open a single lock?");
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				if(qanda.equals("A piano") ) {
					JOptionPane.showMessageDialog(null, "Correct!");
				score = score + 1;
				}
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		String qanda2 = JOptionPane .showInputDialog("What is always in front of you but can't be seen? ");
		if(qanda2.equals("future") ) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
			
		// After all the questions have been asked, tell the user their final score 
		
	}
}
