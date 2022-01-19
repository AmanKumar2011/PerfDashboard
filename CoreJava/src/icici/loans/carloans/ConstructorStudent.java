package icici.loans.carloans;

public class ConstructorStudent 
{
	
	String name="Aman";
	int c=10;
	
public ConstructorStudent() 
{
			//System.out.println("I am inside Super default constructor");

System.out.println("I am a default constructor in student");
	}
	
	public ConstructorStudent(int a, int b) 
	{
		
		a=a;
		b=b;
		System.out.println(a);
		System.out.println(b);

System.out.println("I am a 2 argument constructor in student");
	}
	
	public void m1()
	{
		System.out.println("method m1 in student class");
	}

	public static void main(String[] args) 
	{
		ConstructorStudent c=new ConstructorStudent(0, 0);
	}

}
