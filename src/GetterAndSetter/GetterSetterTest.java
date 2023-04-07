package GetterAndSetter;

public class GetterSetterTest {

	public static void main(String[] args) {
		
		GetterSetterTest obj =new GetterSetterTest();
	PrivateVariables obj1 =new PrivateVariables();
	obj1.setAge(50);
	obj1.setName("abc");
	
		System.out.println(obj1.getAge());
		System.out.println(obj1.getName());
		

	}

}
