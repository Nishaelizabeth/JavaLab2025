class Swap {
    public static void main(String[] args) {

	  // swapping with third variable

        int a = 10, b = 20;
	System.out.println("swapping with third variable");
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = " + a + ", b = " + b);
      
	  // swapping without third variable

        int c = 10, d = 20;
	System.out.println("swapping without third variable");
        System.out.println("Before Swap: c = " + c + ", d = " + d);

        c = c + d;
        d = c - d;
        c = c - d;

        System.out.println("After Swap: c = " + c + ", d = " + d);
    }
}

