import java.util.Scanner;
public class Date
{
    private int date,month,year;
    public Date()
    {
        date=0;
        month=0;
        year=0;
    }
    public void setDate()
    {
        Scanner d=new Scanner(System.in);
        System.out.println("Enter date");
        date=d.nextInt();
    }
    public void setMonth()
    {
        Scanner m=new Scanner(System.in);
        System.out.println("Enter month");
        month=m.nextInt();
    }
    public void setYear()
    {
        Scanner y=new Scanner(System.in);
        System.out.println("Enter year");
        year=y.nextInt();
    }
    public int getDate()
    {
        return date;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
    public void displayDate()
    {
        System.out.println(date+"/"+month+"/"+year);
    }
}
