package exerciciosBasicos2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBasico2_6 {

	public static void main(String[] args) {
		double val;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite um valor entre 0 e 100%n");
		val = sc.nextDouble();
		if (val >= 0 && val <= 25) {
			System.out.printf("Intervalo [0,25]");
		} else if (val > 25 && val <= 50) {
			System.out.printf("Intervalo [25,50]");
		} else if (val > 50 && val <= 75) {
			System.out.printf("intervalo [50,75]");
		} else if (val > 75 && val <= 100) {
			System.out.println("intervalo [75,100]");
		} else {
			System.out.println("Fora do intervalo");
		}
		sc.close();
	}// main

}// fim class
