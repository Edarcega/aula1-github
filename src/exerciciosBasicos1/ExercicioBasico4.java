package exerciciosBasicos1;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioBasico4 {
	
	public static void main (String [] args) {
		int mat;
		double wh,vh,salary;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		mat = sc.nextInt();
		wh = sc.nextDouble();
		vh = sc.nextDouble();
		salary = (wh*vh);
		System.out.printf("NUMBER%n", mat);
		System.out.printf("SALARY = U$%.2f ", salary);
		sc.close();
		
	}// fim main

}//fim classe
