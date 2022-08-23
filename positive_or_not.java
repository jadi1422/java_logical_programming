import java.util.Scanner;
class positive_or_not
  {
    public static void main (String args[])
    {
      int num;
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter a value:");
      num=sc.nextInt();
      
      if(num>0)
      {
        System.out.println("print num is positive:"+num);
      }
      else
      {
        System.out.println("print num is negative:"+num);
      }
    }
  }