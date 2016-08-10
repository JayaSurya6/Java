import java.util.Scanner;
public class Sales
{
    public static void main(String args[])
    {
    int a[]=new int[20];
    int count[]=new int[9];
    int sale,i,c;
    System.out.println("Enter the no. of persons");
    Scanner b=new Scanner(System.in);
    c=b.nextInt();
    System.out.println("Enter the gross pays");
    for(i=0;i<c;i++)
    {
        a[i]=b.nextInt();
        a[i]=a[i]*9/100+200;
    }
    for(i=0;i<c;i++)
    {
        if(a[i]>=200&&a[i]<=299)
           count[0]++;
        else if(a[i]>=300&&a[i]<=399)
            count[1]++;
        else if(a[i]>=400&&a[i]<=499)
            count[2]++;
        else if(a[i]>=500&&a[i]<=599)
            count[3]++;
        else if(a[i]>=600&&a[i]<=699)
            count[4]++;
        else if(a[i]>=700&&a[i]<=799)
            count[5]++;
        else if(a[i]>800&&a[i]<=899)
            count[6]++;
        else if(a[i]>900&&a[i]<=999)
            count[7]++;
        else
            count[8]++;
    }
System.out.println("The ranges are");

     System.out.print("200-299  "+count[0]+"\n300-399  "+count[1]+"\n400-499  "+count[2]+"\n500-599  "+count[3]+"\n600-699  "+count[4]+"\n700-799  "+count[5]+"\n800-899  "+count[6]+"\n900-999  "+count[7]+"\nAbove 1000  "+count[8]);

}




}

