package application;

import java.util.Locale;
import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n;
		double soma ,media;
		
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		String[] nome = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %o aluno:\n", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
				nota1[i] = sc.nextDouble();
				nota2[i] = sc.nextDouble();
		}
		
		media = 0;
		soma = 0;
		
		System.out.println("Alunos Aprovados: ");
		
		for(int i=0;i<n;i++) {
			soma = nota1[i] + nota2[i];
			media = soma / 2;
			
			if(media >= 6.0) {
 				System.out.printf("%s\n", nome[i]);
 			}
		}
		
 		
 		
 		
 			
 		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
