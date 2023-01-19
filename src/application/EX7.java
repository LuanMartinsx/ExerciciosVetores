package application;

import java.util.Locale;
import java.util.Scanner;

public class EX7 {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double total, media;
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		double[] vect = new double[n];
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		total = 0;
		for(int i=0;i<vect.length;i++) {
			total += vect[i];
		}
		
		media = total / n;
		System.out.printf("Media do Vetor: %.3f\n", media);
		
		System.out.println("Elementos abaixo da média: ");
		for(int i=0;i<vect.length;i++) {
			if(vect[i] < media) {
				System.out.printf("%.2f\n", vect[i]);
			}
		}
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
}
}