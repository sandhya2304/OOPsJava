package Association;

public class Test
{
	public static void main(String[] args)
	{
		Bank bb = new Bank("SBI");
		Employee ee = new Employee("Sandhya");

		System.out.println(bb.getName()+" : "+ee.getEname());
		
	}

}
