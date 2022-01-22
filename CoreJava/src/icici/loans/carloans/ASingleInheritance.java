package icici.loans.carloans;

import icici.loans.eduloans.CSingleInheritance;

//import icici.loans.eduloans.CSingleInheritance;

 public class ASingleInheritance 
{
	
	
	 void d1()
		{
			System.out.println("Class A defalut method");
		}
	 
	 public void m1()
	{
		System.out.println("Class A m1 public method");
	}
	
	protected void A1()
	{
		System.out.println("Class A A1 protected method");
	}

	public static void main(String[] args) 
	{
		ASingleInheritance a = new ASingleInheritance();
		a.m1();
		a.d1();
		a.A1();
		
		a.p3();
		a.m3();
		a.d3();
		
//		a.m2(); //b's(child) public method not accessible with a's 9partent) class object
//		a.d2(); //b's(child) default method not accessible with a's 9partent) class object
//		a.A2(); //b's(child) protected method not accessible with a's 9partent) class object
		
		a.m3();// method of class outside cannot be accessed. here c is extending A.
		
		BSingleInheritance b = new BSingleInheritance();
		
		b.m1();
		b.A1();
		b.d1();

		
		
		b.m2();  // child can access parent class public method inside Parent class in same package
		b.d2();  // child can access parent class default method inside Parent class in same package
		b.A2();  // child can access parent class protected method inside Parent class in same package
//		b.p2(); //private method of b cannot be accesses outside the class even in the same package
		
		
		ASingleInheritance a1 = new BSingleInheritance();
		
		a1.m1();
		a1.d1();
		a1.A1();
		
		a1.m2(); //b's(child) public method not accessible with a's 9partent) class object
		a1.d2(); //b's(child) default method not accessible with a's 9partent) class object
		a1.A2(); //b's(child) protected method not accessible with a's 9partent) class object
		
		
		BSingleInheritance b1 = new ASingleInheritance(); // we cannot put the parent class object to child class reference
		 
		ASingleInheritance c1 = new CSingleInheritance();
		
		c1.m1();
		c1.d1();
		c1.A1();

		CSingleInheritance c = new CSingleInheritance();
		c.m3();
		c.d3();
		c.p3(); //now this becomes a has a realation here even though a is being extended by c. for a it is has a relation
		
		c.m1();
		c.A1(); // here we are able to access protected method of a even though it is has a relation. 
		// If we create reference of child class in parent class or any class within the package of parent class
		// then protected class of Parent is accessible even though it is has a relation. But if we create the object of
		// child class in some other package other than child class package and parent class package 
		// then it will  not be able to access the protected method of parent class. See BPrintStream Class
		
		c.d1(); // only default method of parent class cannot be accessed from child class of different package with child class object
		
		
		ASingleInheritance test= new CSingleInheritance();
		
		test.m1();
		test.A1();
		test.d1(); // default method of parent class cannot be accessed from class of different package
		test.m3();
		test.d3();
		test.p3();
	}

}
