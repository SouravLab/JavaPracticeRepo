package Fresh;

public class PalindromeNumberString {

	public static void main(String[] args) {
    int num=1911;
    int originalNum=num;
    int rev = 0;
    while(num>0) {
    	rev=rev*10+num%10;
    	num=num/10;
    	
    }
    if(originalNum==rev) {
    	System.out.println(rev+" : it is a palindrome number");
    } else
    {
    	System.out.println(rev+" : it is not a palindrome");
    }

	
	
	String s= "madam";
	String originalString=s;
	String rev1="";
	for(int i=s.length()-1;i>=0;i--) {
		rev1=rev1+s.charAt(i);
	}
	if(rev1.equals(originalString)) {
		System.out.println("palindrome");
	
	}
	else {System.out.println("not palindrome");}

}
}
