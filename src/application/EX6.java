package application;

import java.util.Locale;
import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.printf("Quantos valores vai ter cada vetor? ");
		
		n = sc.nextInt();
		
		int[] a = new int [n];
		int[] b = new int [n];
		int[] c = new int [n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i = 0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int i = 0;i<b.length;i++) {
			b[i] = sc.nextInt();
		}
		
		System.out.println("Vetor Resultante ");
		for(int i = 0;i<c.length;i++) {
			c[i] = a[i] + b[i];
			System.out.printf("%d\n", c[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
