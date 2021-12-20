package icici.loans.carloans;

import java.util.Date;

public class StaticBlockClass 
{
	
	
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
	}
}
