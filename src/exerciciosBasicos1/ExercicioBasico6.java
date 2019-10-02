package exerciciosBasicos1;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBasico6 {

	public static void main(String[] args) {
		double a, b, c, tri, circ, trap, quad, ret;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Entrada de dados
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		// Calculo trianguro
		tri = (a * c)/2;

		// Calculo circulo
		double pi = 3.14159;
		circ = pi * c * c;

		// Calculo trapesio
		trap = (a + b) / 2 * c;

		// Calculo quadrado
		quad = b * b;

		// Calculo retangulo
		ret = a * b;

		// impressão
		System.out.printf("TRIANGULO: %.3f%n", tri);
		System.out.printf("CIRCULO : %.3f%n", circ);
		System.out.printf("TRAPEZIO :%.3f%n", trap);
		System.out.printf("QUADRADO :%.3f%n", quad);
		System.out.printf("RETANGULO :%.3f%n", ret);
		sc.close();
	}

}
