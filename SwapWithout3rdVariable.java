package integerJavaProgram;

import java.util.Scanner;

public class SwapNoWithout3rdvariable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter value of b: ");
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" after swapping " + " a = " + a + " b = " + b);
	}

}
