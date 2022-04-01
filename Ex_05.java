package Exe_EstCondic;

import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o codigo do produto e a quantidade");
		int codigo = sc.nextInt();
		int quant = sc.nextInt();
		
		double total;
		
		if (codigo == 1 ) {
			total = quant * 4.0;
		}
		else if (codigo == 2) {
			total = quant * 4.5;
		}
		else if (codigo == 3) {
			total = quant * 5.00;
		}
		else if (codigo == 4) {
			total = quant * 2.00;
		}
		else {
			total = quant * 1.50;
		}
		
		System.out.printf("Total a pagar: R$ %.2f%n", total);
		
		sc.close();
	}

}
