abstract class Appliance{
  private int powerRating;
  
  Appliance(int powerRating){
     this.powerRating = powerRating;
  } 

  public int getRating(){
    return powerRating;
  }
  
  public void setRating(){
    this.powerRating = powerRating;
  }
 
  public abstract void turnOn();
  public abstract void turnoff();
}

class Fan extends Appliance{
  public Fan(int powerRating){
   super(powerRating);
  }

  public void turnOn(){
    System.out.println("Fan is turned on: " +getRating());
 
  }
 public void turnoff(){
    System.out.println("Fan turned off");
  }
}



class Light extends Appliance{
   public Light(int powerRating){
     super(powerRating);
   }
 
   public void turnOn(){
     System.out.println("Light turned ON:" +getRating());

}
   public void turnoff(){
     System.out.println("Light turned off");
   }
}


class AC extends Appliance{
     public AC(int powerRating){
     super(powerRating);

   }
 
   public void turnOn(){
     System.out.println("AC turned ON:" +getRating());

}
   public void turnoff(){
     System.out.println("AC turned off");
   }
 }


public class Working{
  public static void main(String[] args){
   Fan fan = new Fan(50);
   Light light = new Light(100);
   AC ac = new AC(5000);

   System.out.println("-------------------");
   System.out.println("Fan");
   System.out.println("-------------------");
   fan.turnOn();
   fan.turnoff();

   System.out.println("-------------------");
   System.out.println("Light");
   System.out.println("-------------------");
   light.turnOn();
   light.turnoff();

   System.out.println("-------------------");
   System.out.println("AC");
   System.out.println("-------------------");
   ac.turnOn();
   ac.turnoff();
   
}
}

