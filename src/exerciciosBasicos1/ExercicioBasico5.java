package exerciciosBasicos1;

import java.util.Scanner;
import java.util.Locale;

public class ExercicioBasico5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codp1, codp2;
		double npecas1, npecas2, vpecas1, vpecas2, total;
		Locale.setDefault(Locale.US);
		

		// peca 1
		codp1 = sc.nextInt();
		npecas1 = sc.nextDouble();
		vpecas1 = sc.nextDouble();

		// peca 2
		codp2 = sc.nextInt();
		npecas2 = sc.nextDouble();
		vpecas2 = sc.nextDouble();

		// Calculo
		total = (npecas1 * vpecas1 + npecas2 * vpecas2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);
		sc.close();
	}// Fim main

}// Fim class
