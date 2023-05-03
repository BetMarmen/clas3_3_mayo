package practica;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner (System.in);
		int num;
		factorial op = new factorial();
		do {
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero"));
		}
		while(num<0);
	
		System.out.println("El factorial del numero es "+op.factor(num));
	}

}
