package icici.loans.carloans;

public class Engine {
	public void start(){
		System.out.println("Engine Started:");
	}
	public void stop(){
		System.out.println("Engine Stopped:");
	}
	
	public static void main(String[] args) {
		
		ASingleInheritance a = new ASingleInheritance();
		a.m1();
		a.d1();
		a.A1();
//		a.m2(); //b's(child) public method not accessible with a's 9partent) class object
//		a.d2(); //b's(child) default method not accessible with a's 9partent) class object
//		a.A2(); //b's(child) protected method not accessible with a's 9partent) class object
			
		
BSingleInheritance b = new BSingleInheritance();
		
		b.m1();
		b.A1();
		b.d1();
		
		b.m2();  // child can access parent class public method inside Parent class in same package
		b.d2();  // child can access parent class default method inside Parent class in same package
		b.A2();  // child can access parent class protected method inside Parent class in same package
	
		ASingleInheritance a1 = new BSingleInheritance();
		
		a1.m1();
		a1.d1();
		a1.A1();
		
		a1.m2(); //b's(child) public method not accessible with a's 9partent) class object
		a1.d2(); //b's(child) default method not accessible with a's 9partent) class object
		a1.A2(); //b's(child) protected method not accessible with a's 9partent) class object
	
		BSingleInheritance b1 = new ASingleInheritance(); // we cannot put the parent class object to child class reference
		 
		
	}
	
	
	
	
}
