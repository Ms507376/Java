package integerJavaProgram;

import java.util.Scanner;

public class PrimeNoOrNot {

	public static void main(String[] args) {
		int n, i, count = 0;
		System.out.println(" enter the number to check whether it is prime or  not");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.print("This is a Prime Number");
		} else {
			System.out.print("This is not a Prime Number");
		}

	}

}
