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
		
		double raio;
		double pi = 3.14159;
		double area;
		System.out.println("Entre com o valor do raio");
		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);
		System.out.printf("A area do Circulo é: %.4f%n", area);
		
		int val1, val2, val3, val4, diferenca;
		System.out.println("Entre com o primeiro valor: ");
		val1 = sc.nextInt();
		System.out.println("Entre com o segundo valor: ");
		val2 = sc.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		val3 = sc.nextInt();
		System.out.println("Entre com o ultimo valor: ");
		val4 = sc.nextInt();
		diferenca = val1 * val2 - val3 * val4;
		System.out.println("A diferenca é: " + diferenca);
		
		
		
		sc.close();

	}

}
