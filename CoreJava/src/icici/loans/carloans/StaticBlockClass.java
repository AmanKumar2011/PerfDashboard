package icici.loans.carloans;

import java.util.Date;

public class StaticBlockClass 
{
	final int a;
	final static int b;
	
	static
	{
		b=10;// blank final static can only be assigned at static block. It cannot be assigned at constructor
		// a= 10;
	}
	
	StaticBlockClass()
	{
		a=10; // blank final can only be assigned at constructor. It cannot be assigned at static block
	//	b=10;
	}
	
public static void a()
{
	System.out.println("I am inside static void method");
}
	static
	{
	System.out.println("I am inside static block");
	
	}
	
	static
	{
	
	Date dt= new Date();
	System.out.println(dt);
	
	}

	public static void main(String[] args) 
	{
	
		System.out.println( "I am inside main");
		StaticBlockClass.a();
		a();
	//	System.out.println("Testing Completed for Static");
	}
}
