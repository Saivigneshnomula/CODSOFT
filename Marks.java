import java.util.*;

public class Marks {
    public static void main(String[] args) {
        
  

    Scanner sc = new Scanner(System.in);
    int Sub1,Sub2,Sub3,Sub4,Sub5;
    System.out.println("Enter your marks in Sub1 :" );
    Sub1 = sc.nextInt();
    System.out.println("Enter your marks in Sub2 :" );
    Sub2 = sc.nextInt();
    System.out.println("Enter your marks in Sub3 :" );
    Sub3 = sc.nextInt();
    System.out.println("Enter your marks in Sub4 :" );
    Sub4 = sc.nextInt();
    System.out.println("Enter your marks in Sub5 :" );
    Sub5 = sc.nextInt();
   int Total = Sub1+Sub2+Sub3+Sub4+Sub5;
   System.out.println("Total Marks is :"+Total);
   int Average = Total/5;
   System.out.println("Average Marks is :"+Average);
   int Percentage = Total*100/500;
System.out.println("Percentage is :"+Percentage+"%");
   if(Average > 90)
   {
    System.out.println("Obtained Grade is A");
   }
   else if (Average>80)
   {
    System.out.println("Obtained Grade is B");
   }
   else
   {
    System.out.println("Obtained Garde is C");
   }
    {
    
   }
}



}