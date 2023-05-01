import java.util.Scanner;

public class prime_or_not
{
  public static void main(String[] args)
  {
    int n;
	Scanner input=new Scanner(System.in);
	n=input.nextInt();
    if (n<=1)
	{
      System.out.println("Not Prime Number");
    }
    int count=0;
    int i=1;
    while (i<=n/2)
	{
      if (n%i==0)
	  {
        count++;
      }
      i++;
    }
    if (count>1)
	{
      System.out.println("Not Prime Number");
    }
	else
	{
      System.out.println("Prime Number");
    }
  }
}
