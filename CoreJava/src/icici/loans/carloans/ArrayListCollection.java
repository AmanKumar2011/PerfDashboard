package icici.loans.carloans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCollection {
	
	int a, b;	
	/*
	 * public void aa(int x,int y) { }
	 */
	
	/*
	 * protected void aa(float x,int y) { System.out.println("I am inside float"); }
	 */
	
	
		
	public static void main(String[] args) 
	{
	
		//	Collections coll= new Collections();
		//	coll.aa(10,10);
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		
		a1.add(5);
		a1.add(2);
		a1.add(6);
		a1.add(6);
		a1.add(9);
		a1.add(10);
		System.out.println("Index is"+a1.indexOf(2));
		
		System.out.println(a1);
		a1.add(1, 12);
		System.out.println(a1);
		a1.set(1, 11);
		System.out.println(a1);
		a1.remove(0);
		a1.remove("6");  //this will work if arraylist is object type
		System.out.println(a1);
		
		System.out.println("Does it contains 9 " + a1.contains(9));
		System.out.println("What is the index of 6  " +a1.indexOf(6));
		System.out.println("Is it empty " + a1.isEmpty());
		System.out.println("What is the size of Arraylist "+a1.size());
		System.out.println("sublist is " +a1.subList(1,4));
		
		
		ArrayList<Integer> a2= (ArrayList<Integer>) a1.clone();
		System.out.println("a2 values  "+a2);
	
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3=(ArrayList<Integer>) a1.clone();
		System.out.println("Values of a3 "+ a3);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
			
		}
		
		System.out.println("------------------");
		
		Iterator<Integer> itr= a1.iterator();
		System.out.println(itr.hasNext());
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//	a2= a1.clone();
		System.out.println("------------------");
		a1.clear();
		System.out.println(a1);
		
		System.out.println("------------------");
		
	//converting normal array to arraylist
		
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the size of the array :: ");
	      int size = sc.nextInt();
	      String myArray[] = new String[size];
	      System.out.println("Enter elements of the array (Strings) :: ");
	      for(int i=0; i<size; i++) {
	         myArray[i] = sc.next();
	      }
	 //     System.out.println(myArray);
	      System.out.println(Arrays.toString(myArray));
	      ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
	      System.out.println(myList);
	      for(int i=0;i<myList.size();i++)
			{
				System.out.println(myList.get(i));
				
			}
	      
	    //converting arraylist to normal array
	      
	      System.out.println("Enter the element that is to be added:");
	      String element;
	      element= sc.next();
	      
	      myList.add(element);
	      myArray = myList.toArray(myArray);
	      System.out.println(Arrays.toString(myArray));
	}

}
