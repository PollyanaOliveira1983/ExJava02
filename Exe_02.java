package Exe_EstCondic;

import java.util.Scanner;

public class Exe_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		int x = sc.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("O numero digitado é par: " + x);
		}else {
			System.out.println("O numero digitado é impar: " + x );
		}

		
		sc.close();
	}

}
