import java.util.Scanner;
class condition
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		x=in.nextInt();
		y=in.nextInt();
		if (x>y)
		{
			System.out.println(x+" is larger.");
		}
		else if (x==y)
		{
			System.out.println("Both are equal.");
		}
		else
		{
			System.out.println(y+" is larger.");
		}
		System.out.println("Outside condition, program ends");
	}
}