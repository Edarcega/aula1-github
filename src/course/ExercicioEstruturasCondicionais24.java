package course;

import java.util.Scanner;

public class ExercicioEstruturasCondicionais24 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		// System.out.printf("%d %d %d",a,b,c);
		if (a > b && a > c) {
			System.out.printf("Higher = %d", a);
		} else if (b > a && b > c) {
			System.out.printf("Higher = %d", b);
		} else if (c > a && c > b) {
			System.out.printf("Higher = %d", c);
		} else {
			System.out.printf("Higher = %d", a);
		}
		sc.close();
	}
}
