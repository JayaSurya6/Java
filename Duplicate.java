import java.util.*;
public class Duplicate
{
  public static void main(String args[])
  {
   int n,i;
  ArrayList<Integer> a=new ArrayList<>();
  Scanner b=new Scanner(System.in);
    for(i=0;i<5;)
    {
      System.out.println("Enter the number");
      n=b.nextInt();
      if(!(a.contains(n)))
      {
      a.add(n);
      i++;
      }
    }
    System.out.println("The elements are");
    for(i=0;i<5;i++)
    System.out.println(+a.get(i));
 }

  }
