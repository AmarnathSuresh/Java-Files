import java.util.Scanner;
class comm
{
	int sale;
	void get_data(x)
	{
		x=sale;
	}
	void print()
	{
		if (x<1000)
		System.out.println("No commission");
		if (x>1000 && x<5000)
		System.out.println((x*10)/100);
		if (x>5000)
		System.out.println(2000+(x*8)/100);
	}
}
class comm_ret
{
	comm.get_data(2000);
	comm.print();
}