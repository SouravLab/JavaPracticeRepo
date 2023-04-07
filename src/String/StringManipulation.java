package String;

public class StringManipulation {
public static void main(String[] args) {
	
	
	String  str = "Hello this is my java code";
	System.out.println(str.length());//26
	
	System.out.println(str.charAt(25));//e
	System.out.println(str.charAt(str.length()-1));//e
//	System.out.println(str.charAt(26));//java.lang.StringIndexOutOfBoundsException:
	System.out.println("-");
	System.out.println(str.indexOf('l'));
	System.out.println(str.indexOf('l',str.indexOf('l')+1));//2nd occurrence of l
	System.out.println(str.indexOf("world"));//-1
	String msg= "Hello sourav";
	if(msg.indexOf("sourav")!=-1) {
		System.out.println("msg is correct");
	}else {
		System.out.println("msg is incorrect");
	}
	//
	String test ="welconme to java";
	System.out.println(test.toLowerCase());
	System.out.println(test.toUpperCase());
	
	// String literals
	String s1 ="Hello World";
	String s2 ="Hello World";
	System.out.println(s1==s2);
	String s3= new String ("Hello java");
	String s4= new String ("Hello java");
	System.out.println(s3==s4);
	
	
	
	System.out.println("-------------------");
	int a=10;
	int b=20;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
