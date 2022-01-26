package icici.loans.carloans;

import java.util.Scanner;

public class StringClass {

	public static void main(String[] args) 
	{
	
//String Array
	
//		String[] s;
//		int size;
//		
//		System.out.println("Enter the size of the array");
//		
//		Scanner sc= new Scanner(System.in);
//		size= sc.nextInt();
//		
//		s= new String[size];
//		
//				for(int i=0;i<s.length;i++)
//				{
//					System.out.println("Enter the String Array "+ i +" position value");
//				s[i]= sc.next();	
//				}
//				
//		sc.close();
		
	// String Classs	
		
				Scanner sc1= new Scanner(System.in);
				
		
		System.out.println("StringBufferClass output......................");

		//String Buffer class	
		String s2="Hi String Buffer";
		StringBuffer sb = new StringBuffer(s2);
		
		for(int i=0;i<sb.length();i++)
		{
		System.out.println("Value of string sb at Index "+i+" "+sb.charAt(i));
		}
		
		System.out.println(sb.hashCode());
		System.out.println(sb.replace(0, 1,"by"));
		System.out.println(sb.hashCode());  //Hashcode always remains same for StringBuffer and String Builder class
		
		
	
		//String Class functions
		
	
		System.out.println("------------------------- String class output");
		
		
		String s1;
		
		System.out.println("Enter the normal String");
		s1=sc1.nextLine();
		
		System.out.println("You have entered "+s1);		
		sc1.close();
		
		
		
		
		for(int i=0;i<s1.length();i++)  //Here length is taken along with ()
		{
		System.out.println("Value of string s1 at Index "+i+" "+s1.charAt(i));
		}
		 s1="hi this is String Class";
		String s4="Hi This is String Class";
		String s5="change";
		String s6="trim class is nice ";
		String[] s7;
		String s3="hi";
		
		
		System.out.println("Checking for isEmpty "+s1.isEmpty());
		System.out.println("Checking the length "+s1.length());
		System.out.println("Checking the s1 hashcode "+s1.hashCode());
		System.out.println("Checking the charAt "+s1.charAt(1));
		System.out.println("Checking the IndexOf "+s1.indexOf('t'));
		System.out.println("Checking the contains "+s1.contains(s3));
		System.out.println("Checking the equals "+s1.equals(s3));
		System.out.println("Checking the equalsIgnoreCase "+s1.equalsIgnoreCase(s4));
		System.out.println("Chekcing the toUpperCase "+s1.toUpperCase());
		System.out.println("Checking the toLowerCas e"+s1.toLowerCase());
		s1=s1+" ";
		System.out.println("Checking the s1 hascode again "+s1.hashCode()); //Hascode changes as we made change in the String
		System.out.println("Checking the concat "+s1.concat(s5));
		System.out.println("Checking the hascode again "+s1.hashCode()); //Hascode changes only one time
		System.out.println("Checking the replace "+s1.replace('h', 'b'));
		System.out.println("Checking the hascode again "+s1.hashCode()); //Hascode changes only one time
		System.out.println("Checking the trim "+s6.trim()); //removing the space from both from and end
		s7=s6.split(" ");
		
		for(int i=0;i<s7.length;i++) //Here length is taken without the (). for string array () is not required
		{
		System.out.println("Value of string s6 after split at Index  "+i+" "+s7[i]);
		}
		
		System.out.println("checking the substring "+s6.substring(1,4)); //rim ..it will give starting from index 1 to index 3 including
		System.out.println("Checking Endswith "+s6.endsWith("nice"));
		System.out.println("Checking Startswith "+s6.startsWith("trim"));
		
		
		
		
	}

}
