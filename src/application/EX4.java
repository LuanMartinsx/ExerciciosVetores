package application;

import java.util.Locale;
import java.util.Scanner;

public class EX4 {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		int qntpar;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
	
		System.out.println("\nNumeros Pares: ");
		qntpar= 0;
		
		
			for(int i=0;i<vect.length;i++) {
				if(vect[i] % 2 == 0) {
					System.out.printf("%d ", vect[i]);
					qntpar++;
				}
				
			}
			
			System.out.printf("\n\nQuantidade de numeros pares: %d\n", qntpar);
		
		
		
		
		
		
		sc.close();
}

	
}