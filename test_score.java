class calc
{
	int arr[]={23,43,37,56,19,7,62,79,85,91};
	int n=10;
	int count_a,count_b,count_c,count_d,count_e,count_f,count_g,count_h,count_i,count_j;
	void print()
	{
		for (int i=0;i<10;i++)
		{
			if (arr[i]>=0 && arr[i]<=10)
			{
				count_a++;
				System.out.println(count_a+"students scored between 0-10.");
			}
			if (arr[i]>=11 && arr[i]<=20)
			{
				count_b++;
				System.out.println(count_a+"students scored between 11-20.");
			}
			if (arr[i]>=21 && arr[i]<=30)
			{
				count_c++;
				System.out.println(count_a+"students scored between 21-30.");
			}
			if (arr[i]>=31 && arr[i]<=40)
			{
				count_d++;
				System.out.println(count_a+"students scored between 31-40.");
			}
			if (arr[i]>=41 && arr[i]<=50)
			{
				count_e++;
				System.out.println(count_a+"students scored between 41-50.");
			}
			if (arr[i]>=51 && arr[i]<=60)
			{
				count_f++;
				System.out.println(count_a+"students scored between 51-60.");
			}
			if (arr[i]>=61 && arr[i]<=70)
			{
				count_g++;
				System.out.println(count_a+"students scored between 61-70.");
			}
			if (arr[i]>=71 && arr[i]<=80)
			{
				count_h++;
				System.out.println(count_a+"students scored between 71-80.");
			}
			if (arr[i]>=81 && arr[i]<=90)
			{
				count_i++;
				System.out.println(count_a+"students scored between 81-90.");
			}
			if (arr[i]>=91 && arr[i]<=100)
			{
				count_j++;
				System.out.println(count_a+"students scored between 91-100.");
			}
		}
	}
}
class test_score
{
	public static void main(String[] args)
	{
		calc c[]=new calc[10];
		for (int i=0;i<10;i++)
		{
			c[i]=new calc();
		}
		for (int i=0;i<10;i++)
		{
			c[i].print();
		}
	}
}