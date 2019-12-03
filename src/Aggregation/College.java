package Aggregation;

import java.util.List;

public class College 
{
	
	String CName;
	
	List<Department> department;

	public College(String cName, List<Department> department) {
		super();
		CName = cName;
		this.department = department;
	}
	
	public int CountTotalStudents()
	{
		int noOfStudents = 0;
		List<Student> students;
		for(Department dept:department)
		{
			students = dept.getStudents();
			for(Student s: students)
			{
				noOfStudents++;
			}
		}
		return noOfStudents;		
	}
	
	

}
