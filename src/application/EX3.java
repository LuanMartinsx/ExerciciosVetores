package application;

import java.util.Locale;
import java.util.Scanner;

import entities.exerciciotres;

public class EX3 {

	public static void main(String[] args) {
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		int n;
		double altura;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		exerciciotres[] vect = new exerciciotres[n]; 
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			vect[i] = new exerciciotres(nome, idade, altura);
			
		}
		
		
		double alturatotal = 0;
		
		double mediaAltura = 0;
		for(int i=0;i<vect.length;i++) {
			alturatotal = alturatotal + vect[i].getAltura();
			mediaAltura = alturatotal / n;
		}
		
		System.out.printf("Altura Média: %.2f%n", mediaAltura);
		
		
		int menores = 0;
		double percentual =0;
		for(int i=0;i<vect.length;i++) {
			if(vect[i].getIdade() < 16) {
				menores++;
				
			}
			percentual = ((double)menores / n) * 100.00;
		}
		 	 
		 System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentual);
		 
		 for(int i=0;i<vect.length;i++) {
				if(vect[i].getIdade() < 16) {
					System.out.printf("%s\n", vect[i].getNome());
				}
		 
		 }
		 
		 
		 
		 
		 
		 
		 sc.close();

	}

}
