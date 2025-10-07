abstract class Staff
{
 private double baseSalary;
 private int extraHours;

 Staff(double baseSalary, int extraHours){
  this.baseSalary = baseSalary;
  this.extraHours = extraHours;
  }

 public double getSalary(){
   return baseSalary;
 }

 public void setSalary(double baseSalary){
   this.baseSalary = baseSalary;
 }

 public int getHours(){
   return extraHours;
 }

 public void setHours(){
   this.extraHours = extraHours;
 }

 public abstract double calculateSalary();
  
}


class Doctor extends Staff
{
  public Doctor(double baseSalary, int extraHours) {
    super(baseSalary, extraHours);
  }
  
  public double calculateSalary() {
    return getSalary() + 1000 * getHours();}
}

class Nurse extends Staff{
  public Nurse(double baseSalary, int extraHours){
    super(baseSalary, extraHours);
  }
  public double calculateSalary(){
   return getSalary() + 500 * getHours();
  }
 
}

class AdminStaff extends Staff
{
   public AdminStaff(double baseSalary, int extraHours) {
        super(baseSalary, extraHours);
    }

    public double calculateSalary() {
        return getSalary();     }
}



public class HospitalTest {
    public static void main(String[] args) {
        Doctor doc = new Doctor(80000, 5); 
        Nurse nurse = new Nurse(40000, 8); 
        AdminStaff admin = new AdminStaff(30000, 0);

        System.out.println("Doctor Salary: Rs"+ doc.calculateSalary());
        System.out.println("Nurse Salary: Rs"+ nurse.calculateSalary());
        System.out.println("Admin Salary: Rs"+ admin.calculateSalary());
    }
}