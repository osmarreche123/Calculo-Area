package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a, b, soma;
		
		System.out.println("Entre com o primeiro valor");
		a = sc.nextInt();		
		System.out.println("Entre com o segundo valor");
		b = sc.nextInt();
		soma = a + b;
		System.out.println("A soma dos valores é: " + soma);
		
		
		sc.close();

	}

}
