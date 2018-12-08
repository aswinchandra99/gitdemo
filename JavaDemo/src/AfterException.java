
public class AfterException {
	public static void main(String args[])
	{
		System.out.println("Hyderabad");
		
		try 
		{
			System.out.println(100/0);	
		}
		catch(Exception e) 
		{
			
			System.out.println("A divison with denominator as zero is not allowed");
		}
		finally 
		{
			
			System.out.println("block is executed successfully");
		}
		
		System.out.println("Ashwin");
		
	}

}
