package exerciciosBasicos3;

import java.util.Scanner;

public class ExerciciosBasicos3_2 {

	public static void main(String[] args) {
		int cod = 0;
		int alc=0,gas =0, die=0; 
		Scanner sc = new Scanner(System.in);

		while (cod != 4) {
			System.out.printf("Qual combustivel abasteido?%n");
			System.out.printf("1 - Álcool%n");
			System.out.printf("2- Gasolina%n");
			System.out.printf("3 - Diesel%n");
			System.out.printf("4 - Fim%n%n");
			cod = sc.nextInt();
			
			if (cod <= 0 || cod > 4) {
				System.out.println("Digite um código válido");
			} else {
				switch (cod) {
				case 1:
					alc ++;
					break;
				case 2:
					gas ++;
					break;
				case 3:
					die ++;
					break;

				}// fim switch
				
			} // fim else

		} // fim while

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcaool: "+ alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);
		
		sc.close();

	} // fim main

} // fim class
