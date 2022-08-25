import java.util.Scanner;
class vowel_switch
  {
  public static void main(String args[])
    {
    char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any character :");
    ch=sc.next().charAt(0);
       if(ch>='a'&& ch<='z' || ch>='A'&& ch<='Z')
       {
      switch(ch)
        {
          case 'a':case 'A':
          case 'e':case 'E':
          case 'i':case 'I':
           case 'o':case 'O':
             case 'u':case 'U':
            
          System.out.println("It is VOWEL"); 
            break;
          default: 
        System.out.println("It is Conconent");
        }
       }
      else
          System.out.println("enter ALPHABET only ");
    }
  }

     
    
    
  