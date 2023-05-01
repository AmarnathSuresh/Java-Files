import java.io.*;
interface in1
{
	final int a=10;
	void display();
}
class MainInterface implements in1
{
	public void display()
	{
		System.out.println("Java");
	}
	public static void main(String args[])
	{
		MainInterface i1=new MainInterface();
		i1.display();
		System.out.println(a);
	}
}