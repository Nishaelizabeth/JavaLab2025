public class ExceptionExample{
	public static void main(String[] args){
	System.out.println("Program started.....");
	try{
		System.out.println("will this line work?");
		int a = 10/0;
		System.out.println("Result: "+a);
	}
	catch (ArithmeticException ex){
		System.out.println("Caught exception: " +ex.getMessage());
			
	}
	System.out.println("Program works after execution");
	
	}

}