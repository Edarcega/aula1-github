package exerciciosBasicos2;

import java.util.Scanner;

public class ExercicioBasico2_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int fim = sc.nextInt();
		int dia = 24;
		int total;

		if (in > 24 || fim > 24 || in < 0 || fim < 0) {
			System.out.printf("Digite um valor entre 0 e 24 hora(s)");
		} else if (in < fim) {
			total = fim - in;
			System.out.printf("O Jogo durou %d hora(s)", total);
		} else if (in > fim) {
			total = (dia - in) + fim;
			System.out.printf("O jogo durou %d hora(s)", total);
		} else if (in == fim) {
			System.out.printf("O jogo durou 24 hora(s)");
		}

		sc.close();
	}// fim main

}// fim class
