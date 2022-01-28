package icici.loans.carloans;

import java.util.NoSuchElementException;

public class ExceptionHandling {

	public static void main(String[] args) 
	{
		//unchecked exception or runtime exception
		int a=5,b=0;
		int c;
	//	c=a/b;
		try {
			c=a/b;
			System.out.println(c);
		}
		//we cannot keep Exception Parent class on top.
		//however we can keep it on the bottom. Child classes exception should be before Parent. 
		//As parent class reference can store sub classes reference so Exception alone is capable to handle all the sub classes Exception
		
//		catch(Exception e) //Here we can write catch(ArithmeticException e) as well. since Exception is parent class of Arithmetic class so it can hold the object of arithmetic classs.
//		{
//			System.out.println("divide by zero");
//			e.printStackTrace();
//		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero");
			e.printStackTrace();
		}
		catch(NoSuchElementException e) 
		{
			System.out.println("divide by zero");
			e.printStackTrace();
		}
		catch(NullPointerException e) 
		{
			System.out.println("divide by zero");
			e.printStackTrace();
		}
		catch(Exception e) //Here we can write catch(ArithmeticException e) as well. since Exception is parent class of Arithmetic class so it can hold the object of arithmetic classs.
		{
			System.out.println("divide by zero");
			e.printStackTrace();
		}
		
	}

}
