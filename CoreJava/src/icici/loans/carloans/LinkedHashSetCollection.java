package icici.loans.carloans;


import java.util.LinkedHashSet;

public class LinkedHashSetCollection 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h= new LinkedHashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(40);// Duplicate value addition is not possible in LinkedhashSet
		System.out.println(h); //insertion order is  preserved in Linked Hash Set
		h.remove(40);
		System.out.println("Size is "+h.size());
		System.out.println(h);
		h.removeAll(h);
		System.out.println(h);
		System.out.println("Size is "+h.size());

	}

}
