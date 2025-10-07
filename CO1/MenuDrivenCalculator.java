class MenuDrivenCalculator {
    public static void main(String[] args) {
        int a = 15, b = 5;
        int choice = 3; 
        switch (choice) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;
            case 2:
                System.out.println("Difference = " + (a - b));
                break;
            case 3:
                System.out.println("Product = " + (a * b));
                break;
            case 4:
                System.out.println("Quotient = " + (a / b));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
