import java.util.Scanner;

class Shape{
	void draw(){
		System.out.println("Shape drawing program");
		System.out.println("---------------------");
	}
}

class Circle extends Shape{
	void draw(){
		System.out.println("OK!	yours favourite shape is Circle...start drawing circle");
		System.out.println("Drawing Circle...");
        	System.out.println("     .......     ");
        	System.out.println("   ...........   ");
        	System.out.println("  .............  ");
        	System.out.println(" ............... ");
        	System.out.println(" ............... ");
        	System.out.println("  .............  ");
        	System.out.println("   ...........   ");
        	System.out.println("     .......     ");

	}
}

class Square extends Shape{
	void draw(){
		System.out.println("OK!	yours favourite shape is Square...start drawing Square");
		System.out.println("Drawing Square...");
		System.out.println("...........");
		System.out.println("...........");
		System.out.println("...........");
		System.out.println("...........");
		System.out.println("...........");
	}
}

class Triangle extends Shape{
	void draw(){
		System.out.println("OK!	yours favourite shape is Triangle...start drawing Triangle");
		System.out.println("Drawing Triangle...");
        	System.out.println("     .     ");
        	System.out.println("    ...    ");
        	System.out.println("   .....   ");
        	System.out.println("  .......  ");
        	System.out.println(" ......... ");
        	System.out.println("...........");
	}
}

public class DrawShape{
	public static void main(String[] args){
 	Scanner input = new Scanner(System.in);
	Shape s;
	int choice;
   while(true){
	System.out.println("Welcome to the world of Shapes. Draw your favourite shape here");
	System.out.println("---------------------------------------------------------------");

	System.out.println("Which shape so you want to draw: 1.CIRCLE, 2.SQUARE, 3.TRIANGLE?");
	choice = input.nextInt();

        switch(choice){
		case 1:
		s = new Circle();
		break;

		case 2:
		s = new Square();
		break;

		case 3:
		s = new Triangle();
		break;

		default: 
		System.out.println("Invalid Input. please try agian\n");
		continue;	

	}
       break;
  }
	s.draw();
	}
}



























