package icici.loans.carloans;
import java.util.Scanner;

public class JavaExerciseSwitchCase {

	public static void main(String[] args) 
	{
		int a=5 , b=6;
		char ch1;
		
		
		Scanner sc= new Scanner(System.in);
	
		do {
		
		System.out.println("1 for addition");
		System.out.println("2 for substraction");
		System.out.println("3 for Exit");
		
		System.out.println("Enter your choice");
		ch1= sc.next().charAt(0);
	//	System.out.println("Enter any string");
	//	ch=sc.next(ch);
	//	System.out.println("Value of char is"+ch);
		
		switch(ch1)
		{
		case '1':
			System.out.println("sum is"+(a+b));
			break;
		case '2':
			System.out.println("subtraction is"+ (a-b));
			break;
		case '3':
			System.out.println("you have exited");
			break;
		default:
		System.out.println("Enter the correct choice");
		
		
		}
		
		}while(ch1 != '3');
		
		sc.close();
	}

}
