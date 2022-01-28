package icici.loans.carloans;

import java.util.Scanner;

public class ExceptionUserDefined extends Exception
{

	public static void main(String[] args) 
	{
		int a=5,b=1;
		int c;
		
		Scanner sc= new Scanner(System.in);
		
		
		
		while (true) {
			
			System.out.println("Enter the valuee of a");
			a=sc.nextInt();
			
			
							try {
								if (a != 5) 
								{
									throw new ExceptionUserDefined();
				
								}
								else 
								{
									
								System.out.println("a is not equal to 5 so we are good");
								break;
								}
							} catch (ExceptionUserDefined e) 
							{
								
								e.printStackTrace();
							} 
							finally
							{
								System.out.println("I am inside Finally class");
							}
					}
		System.out.println("Hello there! I am the code after Exception");
	}

}
