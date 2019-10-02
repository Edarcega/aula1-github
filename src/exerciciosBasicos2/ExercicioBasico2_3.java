package exerciciosBasicos2;

import java.util.Scanner;

public class ExercicioBasico2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a >= b && a % b == 0) {
			System.out.printf("Sao Multiplos");
		} else {
			if (b % a == 0) {
				System.out.printf("Sao Multiplos");
			} else {
				System.out.printf("Nao Sao Multiplos");
			}
		}
		sc.close();

	}// fim main

}// fim class
