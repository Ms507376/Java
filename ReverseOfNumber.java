package integerJavaProgram;

import java.util.Scanner;

public class ReverseOfNo {

	public static void main(String[] args) {
		int num, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number whose reverse is to be found");
		num = sc.nextInt();

		while (num != 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}

		System.out.println(" Reversed of a  number is : " + rev);
	}

}
