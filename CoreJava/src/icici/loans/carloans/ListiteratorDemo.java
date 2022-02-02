package icici.loans.carloans;

import java.util.ArrayList;

import java.util.ListIterator;

public class ListiteratorDemo {

	static Integer res=0;
	public static void main(String[] args) 
	{
		ArrayList<Integer> v= new ArrayList<Integer>();  //Vector is a legacy class so we are using enumeration
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
		ListIterator<Integer> itr= v.listIterator();
		
		
		while(itr.hasNext())
		{
			Integer val= itr.next();
			if(val==20)
			{
				itr.set(25);
			}
			res=res+val;
		}
			System.out.println("Sum of the elementes are "+res);
			itr.remove();
			itr.add(45);
			
			System.out.println(v);
			System.out.println(itr.previous());
			System.out.println(itr.previousIndex());
			
		
		
		
			

	}

}
