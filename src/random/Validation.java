//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
	//	System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
 
if( randomNumber ==0) { 
	
	for (int i = 0; i < 10; i++) {
		JOptionPane.showMessageDialog(null, "You're AMAZING!");	
		
	}

}
if( randomNumber ==1) {
	for (int i = 0; i < 10; i++) {
		JOptionPane.showMessageDialog(null, "Your so Genrous!");
	}
	
	
}
if( randomNumber ==2) {
	for (int i = 0; i < 10; i++) {
	JOptionPane.showMessageDialog(null, "You're Positive!");	
	}
}
if( randomNumber ==3) {
	for (int i = 0; i < 10; i++) {
	JOptionPane.showMessageDialog(null, "You're Cool!");	
	}
}
if( randomNumber ==4) {
	for (int i = 0; i < 10; i++) {
	JOptionPane.showMessageDialog(null, "You're a True Bro");	
	}
	}
	}
	}


