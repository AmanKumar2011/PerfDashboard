package icici.loans.carloans;

import java.util.ArrayList;

public class ArrayMultiDimensional {

	public static void main(String[] args) 
	
	{

int[][] a= {
			{1,2,3},
			{4,5},
			{6,7,8,9}
		   };	

				for(int i=0;i<3;i++)
				{
					
						for(int j=0;j<a[i].length;j++)
						{
						System.out.print(a[i][j]+" ");	
						}
				System.out.println();
				}
				
				//for each loop is used where the size of array is dynamic. we can use it in normal array also
		System.out.println("using the for each loop for single dimensional array");
		
		
		int[] b= {11,12,13};
		
					for(int z:b) // here q is a variable is holding all the values of single dimensional array p one by one
					{
						System.out.print(z+" ");	
					}
		
		
		System.out.println();
		System.out.println("using the for each loop for multi dimensional array");
		
		
				for(int[] p:a) // Here p is holding all the rows one by one. on 1st iteration p is {1,2,3}..2nd iteration it
					//is {4,5} and third iteration it is {6,7,8,9}. so everytime a single array is getting passed .
				{
					for(int q:p) // here q is a variable is holding all the values of single dimensional array p one by one
					{
						System.out.print(q+" ");	
					}
					System.out.println();
				}

				
				System.out.println("how to use for each for string array");
				
				String[] str= {"hi","this","is","Poonam"};
				for(String s:str)
				{
					System.out.print(s+" ");
				}
				System.out.println();
				
				ArrayList<String> s1 =new ArrayList<String>();
				s1.add("Hi");
				s1.add("this");
				s1.add("is");
				s1.add("Aman");
				
				for(String s2:s1)
				{
					System.out.print(s2+" ");
				}
				System.out.println();
				
	}

}
