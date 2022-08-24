import java.util.Scanner;
class vowel2
  {
  public static void main(String args[])
    {
    char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any character :");
    char a=sc.next().charAt(0);
    if(a=='a'||a=='A')
    {
      System.out.println("Its vowel");
    }
    else  if(a=='e'||a=='E')
    {
      System.out.println("Its vowel");
    }
     else  if(a=='i'||a=='I')
    {
      System.out.println("Its vowel");
    } 
      else  if(a=='O'||a=='O')
    {
      System.out.println("Its vowel");
    }
      else  if(a=='u'||a=='U')
    {
      System.out.println("Its vowel");
    }
      else
    {
     System.out.println("It is Conconent"); 
    }
    }
  }