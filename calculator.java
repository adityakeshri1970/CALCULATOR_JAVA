import java.util.Scanner;
public class calculator
{
   public static void main(String[] args)
   {
      float a, b, res;
      int choice;
      Scanner cal = new Scanner(System.in);
      
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.print("Enter Your Choice (1-4): ");
      choice = cal.nextInt();
      
      if(choice>=1 && choice<=4)
      {
         System.out.print("\nEnter any Two Number: ");
         a = cal.nextFloat();
         b = cal.nextFloat();
         
         if(choice==1)
            res = a+b;
         else if(choice==2)
            res = a-b;
         else if(choice==3)
            res = a*b;
         else
            res = a/b;
         
         System.out.println("Result = " +res);
      }
      else
         System.out.println("Invalid Choice");
   } 
}
