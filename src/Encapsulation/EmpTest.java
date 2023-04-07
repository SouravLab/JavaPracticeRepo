package Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 =new Employee();
		e1.setName("sourav");
		e1.setAge(20);
		e1.setSalary(23.00);
		System.out.println(e1.getName()+" "+ e1.getAge()+" "+ e1.getSalary());
		System.out.println(e1.getInfo());
		e1.SetInfo("raj", 41, 744.22);
		System.out.println(e1.getInfo());
	}

}
