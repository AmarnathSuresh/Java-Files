import java.util.Scanner;
public class Rows
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    sc.close();
    if (rows<=0)
    {
      System.out.println("Invalid Rows");
    }
    else
    {
      for (int i=1;i<=rows;i++)
      {
        for (int j=1;j<=rows-i+1;j++)
        {
          System.out.print(j+" ");
        }
        System.out.println();
      }
    }
  }
}
