package exerciciosBasicos2;

import java.util.Scanner;

public class ExercicioBasico2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a > 0) {
			System.out.printf("Positivo");
		} else {
			System.out.printf("Negativo");
		}
		sc.close();
	}

}
