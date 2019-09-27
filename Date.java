
public class Date 
{
	private int month; 
	private int day; 
	private int year; 
	
	Date ()
	{
		month = 1; 
		day = 1; 
		year = 1; 
	}
	
	public void setMonth (int num)
	{
		if ( 1 <= num && num <= 12)
		{
			month = num;
		}
		 
	}
	
	public void setDay (int num)
	{
		if(1 <= num && num <= 31)
		{
			day = num; 
		}
	}
	
	
	public void setYear (int num)
	{
		year = num; 
	}
	
	public int getMonth ()
	{
		return month; 
	}
	
	public int getDay ()
	{
		return day; 
	}
	
	public int getYear ()
	{
		return year; 
	}
	
	public void Print ()
	{
		System.out.println(month + "/" + day + "/" + year);
	}
	
	public void test()
	{
		Date first = new Date ();
		
		first.setDay(1);
		first.setMonth(1);
		first.setYear(2000);
		
		first.Print();
		
		
	}

}
