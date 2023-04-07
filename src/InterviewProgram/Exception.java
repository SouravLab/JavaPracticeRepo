package InterviewProgram;

public class Exception {
	
	public static void main(String[] args) {
		String s="sourav";

		int len=s.length();//6
		String rev="";

		for(int i=len-1;i>=0;i--){
		rev=rev+s.charAt(i);


		}
		System.out.print(rev);
		
	
		
}
	}
