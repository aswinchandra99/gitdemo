
public class ThrowTest {
	
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("You are ineligible to vote");
		}
		else 
		{
			System.out.println("Welcome to voting");
		}
	}
	
	public static void main(String args[])
	{
		validate(10);
	}

}
