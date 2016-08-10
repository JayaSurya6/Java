import java.util.Scanner;
 public class Employee
 {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    public Employee()
    {
        firstName=null;
        lastName=null;
        monthlySalary=0;
    }
    public void setFirstName()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first name");
        firstName=s.nextLine();
    }
    public void setLastName()
    {
        Scanner t=new Scanner(System.in);
        System.out.println("Enter second name");
        lastName=t.nextLine();
    }
    public void setMonthlySalary()
   {
       Scanner u=new Scanner(System.in);
       System.out.println("Enter monthly salary");
       monthlySalary=u.nextDouble();
       if(monthlySalary<0)
        monthlySalary=0;
   }
   public String getFirstName()
   {
       return firstName;
   }
   public String getLastName()
   {
       return lastName;
   }
   public double getMonthlySalary()
   {
       return monthlySalary;
   }
   public double getYearlySalary()
   {

       return monthlySalary*12;
   }
   public double getModifiedSalary()
   {
       return monthlySalary*12+(monthlySalary*12)/10;
   }


 }
