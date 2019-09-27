
public class Employee 
{
	private String first;
	private String last;
	private double salary; 
	
	public Employee ()
	{
		first = ""; 
		last = ""; 
		salary = 0.0; 
	}
	
	public void setName (String nam)
	{
		first = nam; 
	}
	
	public void setLast (String nam)
	{
		last = nam; 
	}
	
	public void setSalary (double pay)
	{
		if (pay > 0)
		{
			salary = pay; 
		}
	}
	
	public String getName ()
	{
		return first; 
	}
	
	public String getLast()
	{
		return last; 
	}
	
	public double getSalary()
	{
		return salary; 
	}
	
	public void giveRaise ()
	{
		double bounus = salary * .10; 
		
		salary += bounus; 
	}
	
	public void Info ()
	{
		System.out.println("Name " + first + " " + last);
		System.out.println("Montly income: " + salary);
		System.out.println("Yearly income: " + salary * 12);
		
	}
	
	public void test ()
	{
		Employee steve = new Employee (); 
		Employee Bob = new Employee (); 
		
		steve.setName("Steve");
		steve.setLast("Burns");
		steve.setSalary(1000.00);
		
		Bob.setName("Bob");
		Bob.setLast("Beanz");
		Bob.setSalary(2000.00);
		
		steve.Info(); 
		Bob.Info();
		
		steve.giveRaise(); 
		Bob.giveRaise();
		
		steve.Info();
		Bob.Info();
		
		
	}
	

}
