import java.util.Scanner;
public class Sum
{
        int a,b,sum;
	int add(int num1,int num2)
        {
          this.a = num1;
          this.b = num2;
          sum = a + b;
          return sum;
        }
        public static void main(String[] args)
        {
          Scanner input = new Scanner(System.in);
          System.out.println("Enter a number: ");
          int num1 = input.nextInt();
  	  System.out.println("Enter a number: ");
          int num2 = input.nextInt();
          Sum sum = new Sum();
          int result = sum.add(num1, num2);
          System.out.println("Sum = " +result);
       }
}