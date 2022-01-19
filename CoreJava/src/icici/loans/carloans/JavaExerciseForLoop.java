package icici.loans.carloans;

import java.util.Scanner;

public class JavaExerciseForLoop {

	public static void main(String[] args) 
	{

		int tableof;
//Print a multiplication table
		
		System.out.println("Enter the number for which you wnat the multiplication table");
		Scanner sc1=new Scanner(System.in);
		tableof=sc1.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(tableof+"*"+i+"="+tableof*i);
		}
		
		//Print multiple multiplication table
		
				System.out.println("how many multiplication table you want starting from 1");
		//		Scanner sc1=new Scanner(System.in);
				int sizeof=sc1.nextInt();
				
				for(int i=1;i<=sizeof;i++)
				{
								
					for(int j=1;j<=10;j++)
					{
						
						System.out.print(i+"*"+j+"="+i*j+"    ");
					}
					
					System.out.println();
					
				} // i for loop closed
		
				
sc1.close();
	} //End of main

}
