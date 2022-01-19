package icici.loans.carloans;


//This class is for Wrapper class, Data types and Typecasting
public class WrapperClass 
{
//All wrapper classes belong to java.lang package
	int a;  //Wrapper class is Integer
	float b;   //Wrapper class is Float
	long c;  //Wrapper class is Long
	short d;   //Wrapper class is  Short
	double e;  //Wrapper class is Double
	char f;   //Wrapper class is Character
	boolean g;  //Wrapper class is Boolean
	byte h;  //Wrapper class is Byte
	String s="Aman";
	String i;
	static String j;
	static float k;
	
	public static void main(String[] args) 
	{
		
		//int l;
		WrapperClass obj= new WrapperClass();


System.out.println(obj.a);
System.out.println(obj.b);
System.out.println(obj.c);
System.out.println(obj.d);
System.out.println(obj.e);
System.out.println(obj.f);
System.out.println(obj.g);
System.out.println(obj.h);
System.out.println("the string value is " +obj.i);
System.out.println("the string value is " +obj.s);
System.out.println("the string value is " +WrapperClass.j);
System.out.println("the string value is " +WrapperClass.k);
//System.out.println(l);

int l=67;
System.out.println((char) l); //type casting printing the ASCII value of 67

char m ='a';
System.out.println((int) m);

int n=10;
Integer o=n;  //This is called Autoboxing. Converting primitive type to object type
System.out.println(o);
int p=12;
Integer q= new Integer(p);  //This is called Autoboxing. Converting primitive type to object type
System.out.println("Value of Integer is " +q);
System.out.println("-----------------------");
System.out.println(q.toString(p));
String s= q.toString(p);

System.out.println(s);

String s1 ="470.00";
String s2= "425.25";

System.out.println(Double.parseDouble(s1) + Double.parseDouble(s2));
System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2));// This will give number format exception as the type is not same



	}

}
