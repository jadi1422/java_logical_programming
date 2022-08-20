import java.util.Scanner;

class SWAPPING{

//main method
  public static void main(String[]args)
  {
    int a;
    int b;
    Scanner num=new Scanner(System.in);
  System.out.println("entre first number");
     a=num.nextInt();
  System.out.println("entre second number");
     b=num.nextInt();
    System.out.println("Befoe swapping");
    System.out.println("a="+a);
   System.out.println("b="+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping");
    System.out.println("a="+a);
    System.out.println("b="+b);
  }
}