package icici.loans.carloans;

import java.util.Scanner;

public class ArrayStringExercise {

	public static void main(String[] args) 
	{
		int size;
	//	String str;
		String[] myArray;
		
		
		System.out.println("Enter the size of c3 array dynamically");
		Scanner sc1=new Scanner(System.in);
		size=sc1.nextInt();
		myArray= new String[size];
    System.out.println("Enter the String");
    
  //  str = sc1.nextLine();
    
  //  System.out.println(str);
    
    for(int i=0; i<size; i++) 
    {
        myArray[i] = sc1.next();
        System.out.println(myArray[i]);
   }
    
  //  System.out.println(myArray[0]);
    sc1.close();
	}

}
