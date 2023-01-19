package application;

import java.util.Locale;
import java.util.Scanner;

public class EX8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, total, npares;
		double media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		int[] vect = new int[n];
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		total=0;
		media=0;
		npares=0;
		
		for(int i=0;i<vect.length;i++) {
			if(vect[i] % 2 == 0) {	
				total = total + vect[i];
				npares++;
				
			} 	
		}
		
		if(npares == 0) {
			System.out.print("Nenhum numero par");
		} else {
			media = (double)total / npares;
			System.out.printf("Media dos numeros pares: %.1f\n", media);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
