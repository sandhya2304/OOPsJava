package Aggregation;

import java.util.List;

public class Department 
{
	
	private String DeptName;
	List<Student> students ;
	public Department(String deptName, List<Student> students) {
		super();
		DeptName = deptName;
		this.students = students;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}	
	
	
	
	

}
