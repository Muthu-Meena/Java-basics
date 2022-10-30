package orgStudent;




import orgdepartment.Department;

public class Student extends Department  {

	
	//Methods   :studentName(),studentDept(),studentId()
	  
	public void studentName()
	{
		System.out.println("every student has a unique name");
	}
	public static void main(String[] args) {
		
		Student m=new Student();
		m.studentName();
		m.collegeName();
		m.collegeCode();
		m.collegeRank();
		m.deptName();
		
	
		
	}
}

