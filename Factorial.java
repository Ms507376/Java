package integerJavaProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(" enter the no whose factorial to be found");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1, i;
		for (i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println(" facotorial of given no :" + fact);

	}

}
