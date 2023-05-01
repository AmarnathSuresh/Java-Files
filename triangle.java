import java.io.Scanner;
public class triangle
{
	public static void main(String[] args)
	{
        try
        {
			Scanner sc=new input(System.in);
			int s1=sc.nextInt();
			int s2=sc.nextInt();
			int s3=sc.nextInt();
			System.out.println(s1+s2>s3);
        }
		catch (InvalidTriangleException e)
        {
            System.out.println("Invalid Triangle Exception");
        }
	}
}	