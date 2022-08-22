import java.util.Scanner;
  class powerbill
  {
    public static void main(String args [])
    {
      int cno;
      String cname;
      int pmr;
      int lmr;
      double bill;
      Scanner sc=new Scanner(System.in);
      
      System.out.println("The Given CUS Number is:");
      cno=sc.nextInt();
      System.out.println("The Given CUS Name is:");
      cname=sc.next();
      System.out.println("The Given PRESENT MONTH READING is:");
      pmr=sc.nextInt();
      System.out.println("The Given LAST MONTH READING is:");
      lmr=sc.nextInt();
      float u=3.40f;
      int tu;
      tu=pmr-lmr;
      
      bill=tu*+u;
      
      System.out.println("The Given CUS Number is:"+cno);
      System.out.println("The Given CUS Name is:"+cname);
      System.out.println("The Given PRESENT MONTH READING is:"+pmr);
      System.out.println("The Given LAST MONTH READING is:"+lmr);
      System.out.println("The Given bill is:"+bill);
    }
  }