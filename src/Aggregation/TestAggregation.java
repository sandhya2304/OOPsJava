package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class TestAggregation 
{
	public static void main(String[] args)
	{
		Student s1 = new Student(1,"abc","cs");
		Student s2 = new Student(2,"ha","it");
		Student s3 = new Student(3,"ck","it");
		Student s4 = new Student(4,"lmc","cs");
		
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s4);
		
		List<Student> itstudents = new ArrayList<>();
		students.add(s3);
		students.add(s2);
		
		
		Department dep = new Department("cs",students);
		Department dep2 = new Department("it",itstudents);
		
		List<Department> deptms =new ArrayList<Department>();
		deptms.add(dep);
		deptms.add(dep2);
		
		
		College col = new College("mana", deptms);
		System.out.println(col.CountTotalStudents()); 
          

	}

}
