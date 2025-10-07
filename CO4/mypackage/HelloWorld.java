package mypackage;
import newpackage.Printer;  // Import from another package

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello from mypackage!");
        Printer.printMessage();  // Use imported class
    }
}
