class MyRunnable implements Runnable {
 private int count;

 public MyRunnable(int count) {
        this.count = count;
  }
    @Override
    public void run() {
        System.out.println("Count: " + count + " from " + Thread.currentThread().getName());
    }
}

public class RunnableeDemo {
    public static void main(String[] args) {
         
      	Thread t1 = new Thread(new MyRunnable(1));
        Thread t2 = new Thread(new MyRunnable(2));
        Thread t3 = new Thread(new MyRunnable(3));


        t1.start();
        t2.start();
        t3.start();

        System.out.println("Main ends.");
    }
}

