package icici.loans.eduloans;

import icici.loans.carloans.ASingleInheritance;
import icici.loans.carloans.BSingleInheritance;

public class CSingleInheritance extends ASingleInheritance
{
	
	public void m3()
	{
		System.out.println("Class C m3 method");
	}
	
	 void d3()
	{
		System.out.println("Class C d3 default method");
	}

	protected void p3()
		{
			System.out.println("Class C d3 protected method");
		}

	public static void main(String[] args) 
	{
	CSingleInheritance c = new CSingleInheritance();
	c.m3();
	c.p3();
	c.d3();
	
	c.m1();
	c.A1();
	c.d1(); // only default method of parent class cannot be accessed from child class of different package with child class object
	
	ASingleInheritance a = new ASingleInheritance();
	a.m1(); //only public class method can be accessed by parent class object in other package
	a.d1();
	a.A1();
	
//a.A1(); //protected class cannot be access in class of other package by the Parent reference
	ASingleInheritance b= new CSingleInheritance();
	
	b.m1();
	b.A1();
	b.d1(); // default method of parent class cannot be accessed from class of different package
	
	
	
	CSingleInheritance test= new ASingleInheritance();
	
	}

}
