import java.util.Scanner;
class week_switch
  {
    public static void main(String args[])
    {
      int wd;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the a weekday :");
        wd=sc.nextInt();
      
      switch(wd)
        {
         case 1:
           System.out.println("monday"); 
           break;
        
       
         case 2:
           System.out.println("tuesday"); 
           break;
        
       
         case 3:
           System.out.println("wednsday"); 
           break;
      
       
         case 4:
           System.out.println("thursday"); 
           break;
        
       
         case 5:
           System.out.println("friday"); 
           break;
        
         case 6:
           System.out.println("satruday"); 
           break;
        
         case 7:
           System.out.println("sunnday"); 
           break;
         
         default:   
         System.out.println("wrong choice");
        }
         
    }


  }