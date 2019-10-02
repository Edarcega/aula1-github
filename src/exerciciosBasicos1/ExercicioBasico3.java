package exerciciosBasicos1;

import java.util.Scanner;

public class ExercicioBasico3 {
	
	public static void main (String [] args) {
	int A, B, C, D;
	Scanner sc = new Scanner (System.in);
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();
	D = sc.nextInt();
	double diferenca = (A*B-C*D);
	System.out.printf("DIFERENCA=%.2f", diferenca);
	sc.close();
		
	}/*fim main*/

}
