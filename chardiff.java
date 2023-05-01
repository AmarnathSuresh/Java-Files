//Write a program to print all the characters of the string in different line when string is given by the user
import java.util.Scanner;
class chardiff
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for (int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}
}