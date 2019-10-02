package exerciciosBasicos1;

import java.util.Scanner;

public class ExecicioBasico1 {

	public static void main(String[] args) {
		int n1, n2, soma;
		
		Scanner sc = new Scanner (System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		soma = n1 + n2;
		System.out.println("soma="+soma);
		sc.close();

	}

}
