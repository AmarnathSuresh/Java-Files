//switch condition
import java.util.Scanner;
class switch_condition
{
	public static void main(String[] args)
	{
		int num;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the value of num: ");
		num=in.nextInt();
		switch(num)
		{
			case 0:
			System.out.println("Number is 0.");
			break;
			case 1:
			System.out.println("Number is 1.");
			break;
			case 2:
			System.out.println("Number is 2.");
			break;
			default:
			System.out.println("Num does not match any case label.");
		}
	}
}