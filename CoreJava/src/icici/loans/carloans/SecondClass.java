package icici.loans.carloans;

public class SecondClass 
{
	//Data properties------ for input data like int a, float b etcc...
	//Behaviors ---- methods are known as behaviors
	
	int a=20, b=10, result;
	
	//quick outline window ----ctrl+o
	public void add()
	{
		result=a+b;
		System.out.println("Addition of A and B is"+ result);
	}
	
	public void sub()
	{
		result=a-b;
		System.out.println("Subtraction of A and B is"+ result);
	}
	
	public void multiply()
	{
		result=a*b;
		System.out.println("Multiplication of A and B is"+ result);
	}
	
	public void division()
	{
		result=a/b;
		System.out.println("Division of A and B is"+ result);
	}
	
	public void m5()
	{
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello.... we are in main");
		
	SecondClass obj1 = new SecondClass();
	
	obj1.add();
	obj1.sub();
	obj1.multiply();
	obj1.division();
	
	}

	

}
