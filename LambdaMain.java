import java.io.*;
interface MyNumber
{
	double getValue();
}
interface NumericTest
{
	boolean test(int n);
}
interface NegativityTest
{
	boolean test(int n);
}
class LambdaMain
{
	public static void main(String[] args)
	{
		MyNumber num;
		num=()->123.45;
		System.out.println("A fixed value: "+num.getValue());
		num=()->Math.random()*100;
		System.out.println("A random value: "+num.getValue());
		
		System.out.println();
		
		NumericTest isEven;
		isEven=(n)->(n%2)==0;
		if(isEven.test(9))
		{
			System.out.println("The given value is even.");
		}
		else
		{
			System.out.println("The given value is odd.");
		}
		
		System.out.println();
		
		NegativityTest isNegative;
		isNegative=(n)->n<0;
		if (isNegative.test(-3))
		{
			System.out.println("The given value is negative.");
		}
		else
		{
			System.out.println("The given value is positive.");
		}
	}
}