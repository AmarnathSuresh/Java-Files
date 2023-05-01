import java.util.Scanner;

class employee
{
	int id;
	char rank;
	void get_data(int a, char b)
	{
		id=a;
		rank=b;
	}
	void print()
	{
		System.out.println("Employee ID is: "+id);
		System.out.println("Rank is: "+rank);
	}
}
public class Employeeid_rank
{
	public static void main(String [] args)
	{
		employee e[]=new employee[5];
		for (int i=0;i<5;i++)
		{
			e[i]=new employee();
		}
		for (int i=0;i<5;i++)
		{
			e[i].get_data(1,'A');
		}
		for (int i=0;i<5;i++)
		{
			e[i].print();
		}
	}
}