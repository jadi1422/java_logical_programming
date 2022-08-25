import java.util.Scanner;
class alphabet_digit_sc
  {
  public static void main(String args[])
    {
    char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any character :");
    ch=sc.next().charAt(0);

     
      
      if(ch>=65 && ch<=90 ||ch>=97 && ch<=122)
      {
          System.out.println("it is an ALPHABET");
        if(ch>=65 && ch<=90)
        {
           System.out.println("ALPHABET IS CAPTIAL LETTERS"); 
      }
        if(ch>=97 && ch<=122)
        {
         System.out.println("ALPHABET IS SMALL LETTERS"); 
        }
      }
      else if(ch>=48 && ch<=57)
      {
           System.out.println("it is DIGIT");
      }
      else
      {
        System.out.println("it is SPECIAL CHARECTER");
      }

    }
  }
