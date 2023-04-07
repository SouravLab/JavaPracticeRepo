package String;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("hello");
		s.append("java");
		System.out.println(s);
		
		
		String s1="hello";
		String s2=s1.concat("sourav");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("------");
		String s3="india";
		
		String s4=new String ("india");
		
		String s5="india";
		System.out.println(s3.equals(s4));//true--contain comparision 
		System.out.println(s3==s4);//false
		System.out.println(s3==s5);//true
		System.out.println(s3.equals(s5));//
		
		String s6=new String ("india");
		
		System.out.println(s4.equals(s6));
		System.out.println(s4==s6);
		
		int i=10;
		int j=10;
		
		
		System.out.println(i==j);
		
		
		StringBufferExample obj =new StringBufferExample();
		
		
		
	}

}
