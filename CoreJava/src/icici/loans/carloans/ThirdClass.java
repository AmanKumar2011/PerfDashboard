package icici.loans.carloans;

public class ThirdClass 
{
	
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

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		int x=100;
		String s="Ravi";
		System.out.println("String is" + s + "value is " + x);
		
	ThirdClass obj = new ThirdClass();
	obj.add();
	obj.sub();
	
	}

}
