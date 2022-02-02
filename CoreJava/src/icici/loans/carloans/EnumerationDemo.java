package icici.loans.carloans;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo 
{
	static Integer res=0;

	public static void main(String[] args) 
	{
		Vector<Integer> v= new Vector<Integer>();  //Vector is a legacy class so we are using enumeration
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);
		Enumeration<Integer> var= v.elements();
		while(var.hasMoreElements())
		{
			Integer val= var.nextElement();
			res=res+val;
		}
			System.out.println("Sum of the elementes are "+res);
			
			
	}

}
