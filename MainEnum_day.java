//create a enum day with the enumeration constants as days of week, create a class check with one constructor which will take object as an argument declare a data member d of type enum, function void print() which uses the switch case to print the day selected otherwise it will print "Not a day of the week". Create a main method class to take string input from the user as the day of the week pass this string as an argument to the constructor and call the print function to print the appropriate day entered by the user
import java.util.Scanner;
enum Day
{
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
}
class check
{
	Day d;
	check(Day ob)
	{
		d=ob;
	}
}
void print()
{
	switch(d)
	{
		case SUNDAY:
			System.out.println("SUNDAY is the 1st day of the week.");
			break;
		case MONDAY:
			System.out.println("MONDAY is the 2nd day of the week.");
			break;	
		case TUESDAY:
			System.out.println("TUESDAY is the 3rd day of the week.");
			break;
		case WEDNESDAY:
			System.out.println("WEDNESDAY is the 4th day of the week.");
			break;
		case THURSDAY:
			System.out.println("THURSDAY is the 5th day of the week.");
			break;
		case FRIDAY:
			System.out.println("FRIDAY is the 6th day of the week.");
			break;
		case SATURDAY:
			System.out.println("SATURDAY is the 7th day of the week.");
			break;
		default:
			System.out.println("Not a day of the week.");
			
}
class MainEnum_day
{
	public static void main(String[] args)
	{
		System.out.println("Enter a day of the week: ");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
	}
