import java.util.Scanner;	
import java.lang.*;
public class ABSOLUTE
  {

	public static void main(String args[]) 
    {
      
	  Scanner in = new Scanner(System.in);
    float number = in.nextFloat();
	  float absNumber =number;
	  if (absNumber < 0)
	  {
		  absNumber = absNumber * (-1);
	  }
    System.out.println("Absolute Value");
	  System.out.println("-----------------------------");
	  
	  System.out.print("Enter float number: ");
	  
	  System.out.println("Absolute numeric to given numeric '"+number+"': "+absNumber);
	}
 }