import java.util.Scanner;
class vowel
  {
  public static void main(String args[])
    {
    char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any character :");
    char a=sc.next().charAt(0);
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
    {
      System.out.println("Its vowel");
    }
    else
    {
     System.out.println("It is Conconent"); 
    }
    }
  }