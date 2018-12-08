class MyThread extends Thread
{

	public void run()
	{
		System.out.println("Welcome to USA");
	}
	
}

class ThreadDemo
{
	public static void main(String args[])
	{
		MyThread m=new MyThread();
		m.start();
	}
	
}
