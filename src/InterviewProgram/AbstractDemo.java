package InterviewProgram;

public abstract class AbstractDemo {

	public AbstractDemo() {
		System.out.println("hi  AbstractDemo constrocter");
	}
      public abstract void M1();
      
    public void   M2(){
    	System.out.println(" concrete method");
    	  
      }
	
}

class B extends AbstractDemo{
	
	public static void main(String[] args) {
		B obj =new B();
	}

	@Override
	public void M1() {
		System.out.println("m1 in b class");
	}
	

	
}