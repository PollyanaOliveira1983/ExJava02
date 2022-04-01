package Exe_EstCondic;

import java.util.Scanner;

public class Exc_MenorMaior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite tres valores");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c) {
			System.out.println("Menor = " + a);
		}
		else {
			if (b < c) {
			System.out.println("Menor = " + b);
			}
			else {
				System.out.println("Menor = " + c);
			}
		}
		
		sc.close();
	}	
}
