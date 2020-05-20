package stringprogram;

public class Stringreverseusingbuffer {

	public static void main(String[] args) {

		// String class doesn't have reverse method ,String Buffer class have
		// reverse method

		String str = "java2blog";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse of java2blog is:" + sb.reverse());

	}

}
