package edu.nyu.Inheritance;

import javax.swing.JOptionPane;

public class GraphicalUser {
	public static void main(String[] args) {
		String fn=JOptionPane.showInputDialog("Enter the first number");
		String sn=JOptionPane.showInputDialog("Enter second number");
				int number1=Integer.parseInt(fn);
				int number2=Integer.parseInt(sn);
				int sum=number1+number2;
				JOptionPane.showMessageDialog(null,"The answer is "+ sum);
	}

}
