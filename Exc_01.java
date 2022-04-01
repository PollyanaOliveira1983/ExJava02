package Exe_EstCondic;

import java.util.Locale;
import java.util.Scanner;

public class Exc_01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número negativo");
		int x = sc.nextInt();
		
		if (x < 0) {
			System.out.println("O numero digitado é negativo: " + x);
		}else {
			System.out.println("O numero digitado não é negativo: " );
		}
		sc.close();
	}

}
