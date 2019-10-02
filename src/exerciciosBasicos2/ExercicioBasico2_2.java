package exerciciosBasicos2;

import java.util.Scanner;

public class ExercicioBasico2_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.printf("Par");
		} else {
			System.out.printf("Impar");
		}
		sc.close();
	}// fim main

}// fim class
