package stringprogram;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		System.out.println(" Enter the string to be reversed");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String rev = "";
		int length = str.length();

		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.print(" Reverse of string : " + rev);

	}

}
