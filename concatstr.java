//Write a program to concat two strings usig concat function, take string 1 and 2 from user.
import java.util.Scanner;
class concatstr
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(s1.concat(s2));
	}
}