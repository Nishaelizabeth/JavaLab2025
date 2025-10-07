import java.util.Scanner;

class Rectangle
{
  double l,b,area,perimeter;
  void area(double l,double b)
  {
    this.l = l;
    this.b = b;
    area = l*b;
    System.out.println("Area of rectangle: "+area); 
  }
  void perimeter(double l,double b) 
  {
    this.l = l;
    this.b = b;
    perimeter = 2*(l+b);
    System.out.println("Perimeter of rectangle: "+perimeter);
  }
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the Length of rectangle: ");
   double length = input.nextDouble();
   System.out.println("Enter the Breadth of rectangle: ");
   double breadth = input.nextDouble();
   System.out.println("---------------------------------");
   Rectangle r = new Rectangle();
   r.area(length,breadth);
   r.perimeter(length,breadth);
  }
}