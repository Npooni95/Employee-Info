
public class Invoice 
{
	private String serialNumber; 
	private String productName; 
	private int amount; 
	private double price; 
	
	public Invoice ()
	{
		serialNumber = ""; 
		productName = ""; 
		amount = 0; 
		price = 0.0; 
	}
	
	public void setSerialNumber (String num)
	{
		serialNumber = num; 
	}
	
	public void setProductName (String nam)
	{
		productName = nam; 
	}
	
	public void setAmount (int am)
	{
		amount = am; 
	}
	
	public void setPrice (double p)
	{
		price = p; 
	}
	
	public String getSerialNumber ()
	{
		return serialNumber; 
	}
	
	public String getName ()
	{
		return productName; 
	}
	
	public int getAmount ()
	{
		return amount; 
	}
	
	public double getPrice ()
	{
		return price; 
	}
	
	public double getInvoiceAmount ()
	{
		double newamount = amount * price; 
		
		return newamount; 
	}
	
	public void Print ()
	{
		System.out.println("Serial number: "+ serialNumber );
		System.out.println("Product name: "+ productName );
		System.out.println("Price "+ price);
		System.out.println("Amount: "+ amount );
		System.out.println("Total Price "+ getInvoiceAmount());
		
	}
	
	public void Invoicetest ()
	{
		Invoice screws = new Invoice(); 
		
		screws.setPrice(.99);
		screws.setAmount(10);
		screws.setProductName("Screws");
		screws.setSerialNumber("123242");
		
		screws.Print();
		
	}

}
