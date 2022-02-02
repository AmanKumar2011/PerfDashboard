package icici.loans.carloans;

import java.util.HashSet;

public class HashSetCollection 
{

	public static void main(String[] args) 
	{

		HashSet<Integer> h= new HashSet<Integer>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(40);
		h.add(40);// Duplicate value addition is not possible in hashSet
		System.out.println(h); //insertion order is not preserved
		h.remove(40);
		System.out.println("Size is "+h.size());
		System.out.println(h);
		h.removeAll(h);
		System.out.println(h);
		System.out.println("Size is "+h.size());
	}

}
