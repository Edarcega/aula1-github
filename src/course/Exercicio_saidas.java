package course;

import java.util.Locale;

public class Exercicio_saidas {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.printf("Products:%n");
		System.out.printf("%s, which prince is $%.2f%n", product1, price1);
		System.out.printf("%s which price is $%.2f%n%n", product2, price2);
		System.out.printf("Record: %d, code %d and gender: %c%n", age, code, gender);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
