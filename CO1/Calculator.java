class Calculator {
    public static void main(String[] args) {
        int a = 20, b = 10;
        char op = '+'; 

        switch (op) {
            case '+':
                System.out.println("Sum = " + (a + b));
                break;
            case '-':
                System.out.println("Difference = " + (a - b));
                break;
            case '*':
                System.out.println("Product = " + (a * b));
                break;
            case '/':
                System.out.println("Quotient = " + (a / b));
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
