package application;

import java.util.Locale;
import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double soma, media;
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		soma = 0;
		for(int i=0;i<vect.length;i++) {
			soma = soma + vect[i];
		}
		
		media = 0;
		for(int i=0;i<vect.length;i++) {
			media = soma / n;
		}
		
		System.out.print("VALORES: ");
		
		for(int i=0;i<vect.length;i++) {
		System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.printf("\nSOMA: %.2f%n", soma);
		System.out.printf("MEDIA: %.2f%n", media);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
