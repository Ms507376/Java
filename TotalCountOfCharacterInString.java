package stringprogram;

public class TotalxountOfCharacter {

	public static void main(String[] args) {
		String str = "My name is moni singh";
		int count = 0;
		for (int i = 0; i < (str.length()); i++) {
			if (str.charAt(i) != ' ')
				count++;

		}

		System.out.println("Count of charcter is :" + count);

	}

}
