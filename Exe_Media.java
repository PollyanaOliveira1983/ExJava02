package Exe_EstCondic;

import java.util.Locale;
import java.util.Scanner;

public class Exe_Media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as duas notas para obter a media" );
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		
		double notaFinal = nota1 + nota2;

		System.out.printf("Nota final = %.1f%n", notaFinal);
		
		if (notaFinal < 60.0) {
			System.out.println("Reprovado");
		}else
			System.out.println("Aprovado");
		
		sc.close();
	}

}
