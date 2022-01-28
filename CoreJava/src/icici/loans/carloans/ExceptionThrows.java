package icici.loans.carloans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionThrows 
{

	public static void m1() throws Exception
	{
		int a=5,b=0;
		int c;
		c=a/b;
		
//		try {    // If we are handling it inside the local method then it is fine. but if we are using throws in local method then when we access 
//					//it in main method then it will again show error and will ask to use throw in main method
//			c=a/b;
//			System.out.println(c);
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
	}
	
	public static void main(String[] args) throws Exception //throws IOException 
	{
		m1(); // Since we have added throws Exception so it is handling both arithmetic and ioexception.
		//best thing is to handle the exception in local method itself with try catch block
		//checked Exception
		
		// Creating a file and reading from local repository
        FileReader file = new FileReader("C:\\test\\a.txt");
  
        // Reading content inside a file
        BufferedReader fileInput = new BufferedReader(file);
  
        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());
  
        // Closing all file connections
        // using close() method
        // Good practice to avoid any memory leakage
        fileInput.close();
		
        
        //unchecked exception 
        
        
        

	}

}
