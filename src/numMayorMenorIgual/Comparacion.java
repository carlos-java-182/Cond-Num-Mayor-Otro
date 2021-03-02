package numMayorMenorIgual;

import javax.swing.JOptionPane;

public class Comparacion {

	public static void main(String[] args) {
		
		double num1, num2;
		
		num1= Integer.parseInt(JOptionPane.showInputDialog("Digita un número"));
		
		num2= Integer.parseInt(JOptionPane.showInputDialog("Digita otro número"));
		
		if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "El número "+num1+" es mayor que "+num2);
		}
		else if (num1<num2) {
			JOptionPane.showMessageDialog(null, "El número "+num1+" es menor que "+ num2);
		}
		else {
			JOptionPane.showMessageDialog(null, "El número "+num1+" es igual que "+ num2);
			
		}
	
	}
	
}
