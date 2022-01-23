package icici.loans.carloans;

import java.util.Scanner;

public class ArrayStringExercise {

	public static void main(String[] args) 
	{
		int size;
	//	String str;
		String[] myArray;
//		char ch;
	//	String s;
		
		//System.out.println(s);
		
		System.out.println("Enter the size of c3 array dynamically");
		Scanner sc1=new Scanner(System.in);
		size=sc1.nextInt();
	//	ch=sc1.next().charAt(0);
	//	System.out.println(ch);
	//	System.out.println("Enter the string s");
	//	s=sc1.next();
	////	 s=sc1.nextLine();
	//	System.out.println(s);
		
		
		myArray= new String[size];
 //   System.out.println("Enter the String");
    
  //  str = sc1.nextLine();
    
  //  System.out.println(str);
    
    for(int i=0; i<myArray.length; i++) 
    {
        myArray[i] = sc1.next();
       
        System.out.println(myArray[i]);
   }
    
  //  System.out.println(myArray[0]);
    sc1.close();
	}

}
