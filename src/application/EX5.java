package application;

import java.util.Locale;
import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, posmaior;
		double maior;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		maior = vect[0];
		posmaior = 0;	
		
		for(int i=1;i<vect.length;i++) {
			if(vect[i] > maior) {
				maior = vect[i];
				posmaior = i;
			}
		}
		
		System.out.printf("Maior valor: %.2f\n", maior);
		System.out.printf("Posição do maior valor: %d\n", posmaior);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
