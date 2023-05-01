import java.util.Scanner;
public class pos_num
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the values of x, y: ");
		x=input.nextInt();
		y=input.nextInt();
		if (x>0 && y>0)
		{
			System.out.println(x+"-"+y);
		}
		else
		{
			System.out.println("Invalid Input");
		}
	}
}