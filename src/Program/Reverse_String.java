package Program;

public class Reverse_String {

	public static void main(String[] args) {
		
		String name="ram";
		name="sam";
		System.out.println(name);
		
		
		
		String s = "sourav";
		String rev = "";
		int len = s.length();
		for (int i = len -1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		// using toCharArray

		String m = "mishra";
		String chaRev = "";
		char[] c = m.toCharArray();
		int charLen = c.length;
		for (int i = charLen - 1; i >= 0; i--) {

			chaRev = chaRev + m.charAt(i);

		}
		System.out.println(chaRev);

	}
}
