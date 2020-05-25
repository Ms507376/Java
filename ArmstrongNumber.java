package integerJavaProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	// 153=1^3+5^3+3^3
	public static void main(String[] args) {

		int c = 0, a, temp;
		System.out.println(" Enter the number to be checked armstrong or not");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c)
			System.out.println("armstrong number");
		else
			System.out.println("Not armstrong number");

	}

}
