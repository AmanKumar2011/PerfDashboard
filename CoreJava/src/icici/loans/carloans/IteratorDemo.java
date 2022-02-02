package icici.loans.carloans;


import java.util.ArrayList;

import java.util.Iterator;


public class IteratorDemo 
{
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
		Iterator<Integer> itr= v.iterator();
		
		while(itr.hasNext())
		{
			Integer val= itr.next();
			res=res+val;
		}
			System.out.println("Sum of the elementes are "+res);
			itr.remove();// this will delete from last
			//Iterator does not have any option to add or replace the elements of array List, also it can only 
			//move forward and cannot traverse backword
	}

}
