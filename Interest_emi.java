import java.util.Scanner;

public class Interest_emi
{
	public static void main (String[] args)
	{
	int a;
	Scanner input=new Scanner(System.in);
    a=input.nextInt();
	int b=a+((a*10)/100);
	double c=b/12.0;
	System.out.println(b);
	System.out.println(String.format("%.2f",c));
	}
}
