package icici.loans.carloans;

public class ConstructorEmployee extends ConstructorStudent
{
	
	int a,b;

	public void m2()
	{
		System.out.println("using this keyword inside a method" + this.a);
		System.out.println("using super keyword inside a method" + super.c);
		System.out.println(" I am m2 method in Employee class");
	}


public ConstructorEmployee() 
	{

	super(44,22);
	this.m2();
	super.m1();
	this.a = 5;
	System.out.println(a);
	System.out.println("The value of super class string variable is " +super.name);
	}

	 public ConstructorEmployee(int a) 
	{
		//	this();
			this(7,8);
	//super();
int d=super.c;

System.out.println("The value of D is "+d);
	this.a = a;
	
	System.out.println("The value of a is "+ this.a);
	}

	 public ConstructorEmployee(int a, int b) {
			
			a=a;
			b=b;
			System.out.println(a);
			System.out.println(b);
			//	this.a=a;
			//	this.b=b;
			//	System.out.println(a);
			//	System.out.println(b);

		System.out.println("I am a default constructorin employee");
			}


	public static void main(String[] args) 
	{
		ConstructorEmployee c=new ConstructorEmployee(1);
		
		System.out.println(c.a);
		System.out.println(c.b);
	}
}
