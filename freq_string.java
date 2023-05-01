import java.util.Scanner;

public class freq_string
{
  public static void main(String[] args)
  {
    Scanner input=new Scanner(System.in);
	String str;
	char chr;
	str=input.nextLine();
    chr=input.next().charAt(0);
    int count=0;
    for (int i=0;i<str.length();i++)
	{
      if (str.charAt(i)==chr)
	  {
        count++;
      }
    }
    System.out.println(count);
  }
}
