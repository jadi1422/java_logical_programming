import java.util.Scanner;

public class SIMPLE_CALCULATOR 
{
  public static void main(String[]args)
  {
       int a=0,b=0,choice,c;
         Scanner sc=new Scanner(System.in);
    System.out.println("[1].Addition");
     System.out.println("[2].Subtraction");
    System.out.println("[3].Multiplication");
    System.out.println("[4].Division");
    System.out.println("[5].Remainder");
    
    System.out.println("Enter your choice");
    choice=sc.nextInt();
      if(choice>=1 && choice<=5)
    {
     System.out.println("enter the first number");
         a=sc.nextInt();
    System.out.println("enter the second number");
    b=sc.nextInt();
    }  
    switch(choice)
      
       {
         case 1:   
    System.out.println("to find the addiction");
       c=a+b;
    System.out.println("the addiction is : "+c);
           
       break;

     case 2:   
    System.out.println("to find the Subtraction");
       c=a-b;
    System.out.println("the Subtraction is : "+c);
           
       break;
        
      case 3:   
    System.out.println("to find the Multiplication");
       c=a*b;
    System.out.println("the Multiplication is : "+c);
           
       break;     
      
  case 4:   
    System.out.println("to find the Division");
       c=a/b;
    System.out.println("the Division is : "+c);
           
       break;
           case 5:   
    System.out.println("to find the Remainder");
       c=a%b;
    System.out.println("the Remainder is : "+c);
           
         default:
         System.out.println("Enter wrong number");
       }
  }
}



           
           