
class Vehicle {
    public void startEngine() {
        System.out.println("Generic engine starting...");
    }
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine roaring to life!");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void startEngine() {  // Compiler will catch this error!
        System.out.println("Pedaling bicycle...");
    }
    
}
public class OverrideDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();          
        vehicle.startEngine();
        car.startEngine();
    }
}
