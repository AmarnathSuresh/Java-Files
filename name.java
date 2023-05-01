//Program to extract only last name from full name.
import java.util.Scanner;

class name
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter full name: ");
		String s=sc.nextLine();
		System.out.println(s.substring(9));
	}
}