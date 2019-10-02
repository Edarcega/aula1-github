package exerciciosBasicos2;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBasico2_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		int cod, qtd;
		double prec1 = 4.00, prec2 = 4.50, prec3 = 5.00, prec4 = 2.00, prec5 = 1.50, total = 0;
		System.out.printf("Escolha o produto e quantidade%n%n");
		System.out.printf("CODIGO - ESPECIFICAÇÃO - PREÇO%n");
		System.out.printf("1 - Cachorro quente - R$4,00%n");
		System.out.printf("2 - X-Salada - R$4,50%n");
		System.out.printf("3 - XBacon - R$5,00%n");
		System.out.printf("4 - Torrada Simples - R$2,00%n");
		System.out.printf("5 - Refrigerante - R$1.50%n%n");
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if(cod == 1 ) {
			total = prec1*qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if(cod == 2) {
			total = prec2*qtd;
			System.out.printf("Total: R$ %.2f", total);
		}else if(cod == 3) {
			total = prec3*qtd;
			System.out.printf("Total: R$ %.2f", total);
		}else if(cod == 4) {
			total = prec4*qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else if (cod == 5){
			total = prec5*qtd;
			System.out.printf("Total: R$ %.2f", total);
		} else {
			System.out.println("Digite um código válido");
		}
		sc.close();
	}// fim main

}// fim class
