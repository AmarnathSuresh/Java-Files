import java.io.*;
class StringBuilderMain
{
	public static void main(String[] args)
	{
		StringBuilder s1=new StringBuilder("Hello");
		s1.append(" Java");
		System.out.println("Append function: "+s1);
		s1.insert(2, "ya");
		System.out.println("Insert function: "+s1);
		s1.replace(3,11, " brod");
		System.out.println("Replace function: "+s1);
		System.out.println("Capacity: "+s1.capacity());
		System.out.println("Length: "+s1.length());
	}
}