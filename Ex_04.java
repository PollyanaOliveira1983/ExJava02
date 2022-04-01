package Exe_EstCondic;

import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a hora de inicio e de fim do jogo");
		
		double inicio = sc.nextDouble();
		double fim = sc.nextDouble();
		double resultado;
		
		if (inicio < fim ) {
			
			resultado = fim - inicio;
		}
		else {
				resultado = 24 - inicio + fim; 
			 }
			 System.out.println("A duração do jogo foi de:  " + resultado + " horas");
			
		sc.close();
	}

}
