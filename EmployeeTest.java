   public class EmployeeTest extends Employee
   {

   public static void main(String args[])
     {
         Employee e1=new Employee();
         Employee e2=new Employee();
         e1.setFirstName();
         e1.setLastName();
         e1.setMonthlySalary();
         e2.setFirstName();
         e2.setLastName();
         e2.setMonthlySalary();
         String a,b;
         double c,d;
        System.out.println(e1.getFirstName()+" "+e1.getLastName()+"\nYearly Salary:"+e1.getYearlySalary()+"\nUpdated Salary:"+e1.getModifiedSalary());
        System.out.print(e2.getFirstName()+" "+e2.getLastName()+"\nYearly Salary:"+e2.getYearlySalary()+"\nUpdated Salary:"+e2.getModifiedSalary());

             }
}

