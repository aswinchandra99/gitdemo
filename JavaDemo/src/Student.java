import java.io.*;

public class Student {
	
	void studentDetails()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter the student name:");
		String sname=br.readLine();
		System.out.println("your name is:"+sname);
		
	}
	public static void main(String args[])throws IOException
	{
		Student s1=new Student();
		s1.studentDetails();
				
	}

}
