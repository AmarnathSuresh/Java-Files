import java.io.Scanner;
public class div
{
	public static void main(String[] args)
	{
        try
        {
			Scanner sc=new input(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a/b);
        }
		catch (ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
	}
}	