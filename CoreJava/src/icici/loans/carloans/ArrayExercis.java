package icici.loans.carloans;

import java.util.Scanner;

public class ArrayExercis 
{
//int i;
	static int[] a= {1,2,3,4,5,};
//	int b[5]={6,7,8,9,10};
	int[] a1;//int e[5];//int[5] e; //does not work these ways
	int[] a2= {1,2,3,4,5,};
	int[] a3= new int[10];
	int[] a4= new int[]{11,12,13,14,15,16};
	int b1[];
	int b2[]= {1,2,3,4,5};
	int b3[]= new int[10];
	int b4[]= new int[] {1,2,3,4,5};
	

	
	public static void main(String[] args)
	{
		
		int[] c1= {5,6,7,8,9} ;
		int size=0;
	//	int[] c2= new int[size];
		int[] c2= new int[] {1,2,3,4,5};
		int[] c3;
		
		
	//	c3.length=50;
	//	c2[1]=10;
	//	System.out.println("value of c2[1]"+c2[1]);
		
	
		for(int i=0;i<c1.length;i++)
		{
			System.out.println("Value of Array c1 is c1["+i+"]= "+c1[i]);
		}
		
		System.out.println("------------------------------------------");
/*		
		for(int i=0;i<c2.length;i++)
		{
		System.out.println("Enter the Value of Array c2["+i+"]= ");
			Scanner sc= new Scanner(System.in);
			c2[i]=sc.nextInt();
			System.out.println("Value of Array c2 is c2["+i+"]= "+c2[i]);
		}
		
		System.out.println("------------------------------------------");
*/		
		System.out.println("Enter the size of c3 array dynamically");
		Scanner sc1=new Scanner(System.in);
		size=sc1.nextInt();
		int sum=0;
		c3=new int[size];
		
		// Initialize the array
		
			for(int j=0;j<c3.length;j++)
		{
				System.out.println("Enter the Value of Array c3["+j+"]= ");
			//	Scanner sc= new Scanner(System.in);
				c3[j]=sc1.nextInt();
				
		}
			//sum of array

			for(int j=0;j<c3.length;j++)
			{
					sum=sum+c3[j];
					
					System.out.println("Value of Array c3 is c3["+j+"]= "+c3[j]);
			}

			System.out.println("Sum of Array c3 "+sum);
			sc1.close();
			
		System.out.println("------------------------------------------");
		
		System.out.println("Class level static Array a[]");
			
		for(int j=0;j<a.length;j++)
		{
			System.out.println("Value of Array a is a["+j+"]= "+a[j]);
		}

		System.out.println("------------------------------------------");
		
		System.out.println("Class level normal Array a4[]");
		
		ArrayExercis obj=new ArrayExercis();

		for(int j=0;j<obj.a4.length;j++)
		{
			System.out.println("Value of Array a4 is a4["+j+"]= "+obj.a4[j]);
		}

		
		
	}

}
