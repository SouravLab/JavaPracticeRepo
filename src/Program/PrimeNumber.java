package Program;

public class PrimeNumber {
/**
 * A Prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 *  It means it is only divisible by 1 and itself, and it start from 2. The smallest prime number is 2.
 * @param args
 * 
 */
	
	/*1. Write a program to print the Fibonacci series(0,1,1,2,3,5,8,13...)
	public class fibonacciSeries {
	public static void main(String[] args) {
	       int a =0;
	       int b = 1;
	       int sum = 0;
	       int i = 1;
	       while(i<15)
	       {
	           System.out.print(" " +a);
	           System.out.print(" ");
	           sum=a+b;
	           a=b;
	           b=sum;
	           i++;    
	       }
	   }
	}

	2. Write a program to find out 2nd largest element of an array.
	-->
	import java.util.Arrays;
	public class FindSecondLargest {
	    static void printSecondLargest(int arr[]){
	       int size = arr.length;
	       if(size<2) {
	           System.out.println("Invalid input");
	           return;
	       }
	       Arrays.sort(arr);
	       for(int i = size-2 ; i>=0;i--) {
	           if(arr[i] != arr[size-1]) {
	               System.out.println("The second largest element is: " +arr[i]);
	               return;
	           }
	       }
	       System.out.println("There is no second largest element");
	   }
	   public static void main(String[] args) {
	       int array[] = {1,2,3,4,5,6,7,7,7};
	       printSecondLargest(array);
	   }
	}

	3. Write a program to find out whether a number is prime or not.
	-->
	public class PrimeNumber {
	   public static void main(String[] args) {
	       int num =10;
	       if(isPrime(num)) {
	           System.out.println("The Number is Prime");
	       }
	       else {
	           System.out.println("The Number is not prime");
	       }
	   }
	    static boolean isPrime(int num) {
	       if(num<2) {
	           return false;    
	       }
	       for(int i =2; i<=num/2; i++) {
	           if(num % i == 0) {
	               return false;
	           }
	       }
	       return true;
	   }
	}

	4. Write a program to print all the prime numbers between 1 to 100.
	-->
	public class PrimeNumber {
	   public static void main(String[] args) {
	       int num =10;
	       for(int i= 0; i<=100; i++) {
	           if(isPrime(i)) {
	               System.out.println(i + " is a prime Number");
	           }
	       }    
	   }
	    static boolean isPrime(int num) {
	       if(num<2) {
	           return false;    
	       }
	       for(int i =2; i<=num/2; i++) {
	           if(num % i == 0) {
	               return false;
	           }
	       }
	       return true;    
	   }
	}

	5. Write a program to print 1 to 100 without using any number.
	-->
	public class InterviewProgram {

	   public static void main(String[] args) {
	       int one = 'a' / 'a';
	       int ten = "**********".length();
	       for(int i = one ; i<= ten * ten; i++) {
	           System.out.println(i);
	       }    
	   }
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("6 is prime number: " + isPrimeNumber(6));
		System.out.println("9 is prime number: " + isPrimeNumber(11));
		getPrimeNumber(13);
	}
	
	public static void getPrimeNumber(int num){
		for(int i=2;i<=num;i++) {
			if(isPrimeNumber(i));
			System.out.print(i);
		}
		
		
	}
	
	

}
