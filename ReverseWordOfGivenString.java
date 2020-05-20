package stringprogram;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "Moni,Soni,Deepak";
		String[] strarr = str.split(",");
		String revword = "  ";

		for (int i = strarr.length - 1; i >= 0; i--) {
			revword = revword + strarr[i];
		}

		System.out.print(revword + "   ");

	}

}
