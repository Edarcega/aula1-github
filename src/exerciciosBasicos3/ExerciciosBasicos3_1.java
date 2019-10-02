package exerciciosBasicos3;

import java.util.Scanner;

public class ExerciciosBasicos3_1 {

	public static void main(String[] args) {
		int senha;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite a senha");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.printf("Senha inválida%n");
			System.out.printf("Digite a senha%n");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		sc.close();
	}// fim main

}// fim classe
