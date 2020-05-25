package stringprogram;

public class CompareRemovewhitspaceConcat {

	public static void main(String[] args) {

		String a = "My Name is";
		String b = " Khan";

		if (a.equals(b)) {
			System.out.println(" Both strings are equal");
		}

		else {
			System.out.println(" Both strings are not equal");
		}

		// Concating two string

		String c = a.concat(b);
		System.out.println(c);

		// Remove white space

		String d = "  Monika  ";
		System.out.println(d.trim());

		// convert string into integer

		String e = "910888654";
		int i = Integer.parseInt(e);
		System.out.println("Converted string is " + i);

	}

}
