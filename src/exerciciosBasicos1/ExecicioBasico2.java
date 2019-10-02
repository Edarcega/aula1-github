package exerciciosBasicos1;

import	java.util.Scanner;
import java.util.Locale;

public class ExecicioBasico2 {
	
	public static void main (String args[]) {
		double raio, pi = 3.14159, area;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		raio = sc.nextDouble();
		area = pi*(raio*raio);
		System.out.printf("A=%.4f", area);
		sc.close();
	}

}// Fim classe
