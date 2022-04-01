package Exe_EstCondic;

import java.util.Locale;
import java.util.Scanner;

public class Ex_08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu salario para saber o imposto a pagar: ");
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if(salario <= 3000.00) {
			imposto = (salario - 2000.0) * 0.08;
			System.out.printf("Imposto a pagar %.2f%n", imposto);
		}
		else if(salario <= 4500.00) {
			imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
			System.out.printf("Imposto a pagar %.2f%n", imposto);
		}
		else if(salario > 4500.01) {
			imposto = (salario - 4500.00) *0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
			
			System.out.printf("Imposto a pagar %.2f%n", imposto);
		}
		
		sc.close();
	}

}
