import java.util.Scanner;
class WEEK
  {
    public static void main(String args[])
    {
      int wd;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the a weekday :");
        wd=sc.nextInt();
      
      if(wd==1)
      {
      System.out.println("monday");
      }
      else if(wd==2)
      {
         System.out.println("tuesday");
      }
          
           else if(wd==3)
      {
         System.out.println("wednsday");
      }
           else if(wd==4)
      {
         System.out.println("thursday");
      }
           else if(wd==5)
      {
         System.out.println("fridayday");
      }   
           else if(wd==6)
      {
         System.out.println("saturday");
      }
           else if(wd==7)
      {
         System.out.println("sundayday");
      }
            

      else if(wd>7)
      {
         System.out.println("wrong choise");
      }

         
    }


  }

    