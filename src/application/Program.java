package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
	
		 
		 System.out.print("Quantos numeros voce vai digitar? ");
		 int positive = sc.nextInt();
		 int[] vect = new int[positive];
		 for(int i=0;i<vect.length;i++) {
			 vect[i] = sc.nextInt();
		 }
		 
		 System.out.println("NUMEROS NEGATIVOS ");
		 for(int i=0;i<vect.length;i++) {
			 if(vect[i] < 0) {
				 System.out.printf("%d\n", vect[i]);
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 sc.close();

	}

}
