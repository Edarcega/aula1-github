package exerciciosBasicos2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBasico2_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double sal, imp;
		Scanner sc = new Scanner(System.in);
		sal = sc.nextDouble();

		if (sal >= 0 && sal <= 2000.00) {
			System.out.println("Isento");
		} else if (sal > 2000.00 && sal <= 3000.00) {
			imp = (sal - 2000.00) * 0.08;
			System.out.printf("R$%.2f ", imp);
		} else if (sal > 3000.00 & sal <=4500.00) {
			imp = (1000*0.08)+(sal-3000.00)*0.18;
			System.out.printf("R$%.2f ", imp);
		} else if (sal > 4500.00) {
			imp = (1000*0.08)+(1500*0.18)+(sal-4500.00)*0.28;
			System.out.printf("R$%.2f ", imp);
		}
		sc.close();

	}// fim main

}// Fim class
