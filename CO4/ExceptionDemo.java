input java.utils.*;

public class ExecptionDemo{
	public static void main(String[] args){
		int i;
		double d;
		Scanner input = new Scanner(System.in)
		try{
			System.out.println("Enter an int value: ");
			i = input.nextInt;

			System.out.println("Enter an Double value: ");
			d = input.nextDouble;
 		}
		catch(InputMismatchException e){
			System.out.println("Caught InputMismatchException"+e.getMessage())
		}
}
}