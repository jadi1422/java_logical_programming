import java.util.Scanner;
class big
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the a value :");
        a=sc.nextInt();
       System.out.println("Enter the b value :");
        b=sc.nextInt();
       System.out.println("Enter the c value :");
        c=sc.nextInt();
      if(a>b)
         {
        if(a>c)
          System.out.println("The a value is big :");
           else
          System.out.println("The c value is big :");
         }
      else
      {
        if(b>c)
       System.out.println("The b value is big :"); 
        else
          System.out.println("The c value is big :");
      }
    }
  }