//Program to extract only amount from currency
import java.util.Scanner;

class currency
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter amount with currency: ");
		String s=sc.nextLine();
		System.out.println(s.substring(1));
	}
}