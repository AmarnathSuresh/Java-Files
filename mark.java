import java.util.Scanner;

public class mark
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int numOfSubjects=sc.nextInt();

    if (numOfSubjects<=0)
    {
      System.out.println("Invalid");
    } 
    else
    {
      int totalMarks=0;
      for (int i=1;i<=numOfSubjects;i++)
      {
        int marks = sc.nextInt();
        totalMarks+=marks;
      }
      System.out.println(totalMarks);
    }
  }
}