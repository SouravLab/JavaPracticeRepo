package WrapperClass;

public class Test {

	public static void main(String[] args) {
//		String s = "Sourav";
//		Integer s1 = Integer.valueOf(s);//
//		System.out.println(s1);//lang.NumberFormatException
		
		String  x="100";
		System.out.println(Integer.parseInt(x));
		
		
		
		
		//int to String
		int bal=500;
		String s3=String.valueOf(bal);
		System.out.println(s3);
		//Substring
		
		String msg="your order id is 1234";
		String order=msg.substring(msg.indexOf("is")+3);
		System.out.println(order);
		System.out.println(msg.substring(1, 11));//1 to 10;
		
		
	}

}
