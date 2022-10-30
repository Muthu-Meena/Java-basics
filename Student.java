
public class Student {
	
	//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	
	
	public void getStudentInfo( int id) {
		
		System.out.println("Student id:"  +id);	
	}
	
	public void getStudentInfo(float id,String name) {
		System.out.println("Senior Student id:"  +id);
		System.out.println("name of the student:" +name);
	}
	
	public void getStudentInfo(String email,int phonenumber) {
		System.out.println("email id of the student" +email);
		System.out.println("students phonenumber:"  +phonenumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student m=new Student();
		m.getStudentInfo(19);
		m.getStudentInfo(25,"Saravanan");
		m.getStudentInfo("meenaganesan",25190802);
		
	}

}
