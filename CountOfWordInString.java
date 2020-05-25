package stringprogram;

public class TotalCounofwordsInString {

	public static void main(String[] args) {
		String str = "welcome to grand finale tcs";
		int countofWord = 0;

		for (int i = 0; i < (str.length() - 1); i++) {
			if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
				countofWord++;

			}

		}

		System.out.println(" Total count of words are : " + (countofWord + 1));

	}

}
