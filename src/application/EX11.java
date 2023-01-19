package application;

import java.util.Locale;
import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, homens, mulheres;
		double menoraltura, maioraltura, somaalturamulheres, mediamulheres;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		double[] altura = new double [n];
		char[] genero = new char [n];
		
		for(int i=0;i<n;i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);	
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
		}
		
		menoraltura = altura[0];
		maioraltura = altura[0];
		
		for(int i=1;i<n;i++) {
			if(altura[i] > maioraltura) {
				maioraltura = altura[i];
			}
			if(altura[i] < menoraltura) {
				menoraltura = altura[i];
			}
		}
		
		homens = 0;
		mulheres = 0;
		somaalturamulheres = 0;
		mediamulheres = 0;
		
		for(int i=0;i<n;i++) {
			if(genero[i] == 'M') {
				homens++;
			} else {
			mulheres++;
			somaalturamulheres += altura[i];
		}
			mediamulheres = somaalturamulheres / mulheres;
		
		}
		
		System.out.printf("Menor Altura: %.2f\n", menoraltura);
		System.out.printf("Maior Altura: %.2f\n", maioraltura);
		System.out.printf("Media das Altura das mulheres: %.2f\n", mediamulheres);
		System.out.printf("Numero de homens: %d\n", homens);
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
