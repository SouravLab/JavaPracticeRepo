package JavaSession;

import java.lang.invoke.SwitchPoint;

public class Student {

	public static void main(String[] args) {
		Student st = new Student();
		int m=st.getStudentMarks("akash");
		System.out.println(m+5-2); 
			 m=st.getStudentMarks("dfdf");
			System.out.println(m); 
			
			
			if (m==-1) {
				System.out.println("dont generate the marks sheet for this");
			}
			
			
		int m1=	st.getStudentMarkswithAdvancereturn("ram");
		System.out.println(m1);
		
		st.getStudentMarkWithSwitch("sam");
	}
	

	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student:" + studentName);
		if (studentName.equals("sourav")) {
			return 90;
		} else if (studentName.equals("hari")) {
			return 40;
		} else if (studentName.equals("akash")) {
			return 50;
		} else if (studentName.equals("ram")) {
			return 10;
		}
		else {
			System.out.println("please pass the corrwct student name....");
			return-1;
		}
	}
	// without return statement again and again
	public int getStudentMarkswithAdvancereturn(String studentName) {
		int marks =-1;
		System.out.println("getting marks for student:" + studentName);
		if (studentName.equals("sourav")) {
			marks= 90;
		} else if (studentName.equals("hari")) {
			marks= 40;
		} else if (studentName.equals("akash")) {
			marks= 50;
		} else if (studentName.equals("ram")) {
			marks= 10+5;
		}
		else {
			System.out.println("please pass the corrwct student name....");
			
		}
		return marks;
	}
	// above scenario using switch case
	
	
	public int getStudentMarkWithSwitch( String StudentName) {
	int mark =-1;
		switch (StudentName) {
		case "akash":
			System.out.println("getting mark for student: "+StudentName +"  is 50");
			return mark;
		case "ram":
			System.out.println("getting mark for student: "+StudentName + " is 60");
			return mark;
			
		case "sam":
			System.out.println("getting mark for student: "+StudentName + " is 40");
			return mark;
			

		default:
			System.out.println("plz pass correct student name");
			return mark;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
