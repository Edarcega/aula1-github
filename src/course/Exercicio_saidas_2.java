package course;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_saidas_2 {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name");
		String fullname = sc.nextLine();
		System.out.println("How many bedrooms are ther in your house");
		int n1 = sc.nextInt();// qtd de quartos
		System.out.println("Enter product price");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line)");
		String name2 = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		System.out.println(fullname);
		System.out.println(n1);
		System.out.printf("%.2f%n",price);
		System.out.println(name2);
		System.out.println(age);
		System.out.println(height);
		sc.close();
		
	}// Fim main

}// Fim classe
