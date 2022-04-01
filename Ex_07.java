package Exe_EstCondic;

import java.util.Locale;
import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois valores");
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 || y == 0) {
			System.out.println("Origem");
		}
		else if(x < 0 && y < 0 ) {
			System.out.println("Q3");
		}
		else if (x > 0 && y < 0 ) {
			System.out.println("Q4");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		
		sc.close();
	}

}
