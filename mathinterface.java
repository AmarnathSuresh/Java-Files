//Write a program to create a interface Add_Sub with 2 member functions void add(double x,double y), void sub(double x,double y).
//Another interface Mul_Div with 2 member functions void multiply(double x,double y), void divide(double x,double y).
//Another interface Calculate extends Add_Sub, Mul_div printResult(double result) which is inheriting the interface Add_Sub and Mul_div.
//Create a class my_calculator which implements calculate interface and the main methd class MainInterface to print the results of addition, subtraction,
//multiplication and division. Don't create additional data members or member function in the class.

import java.io.*;
Interface Add_Sub
{
	void add(double x, double y)
	{
		System.out.println("Sum: "+x+y);
	}
	void sub(double x,double y)
	{
		System.out.println("Difference: "+x-y);
	}
}
Interface Mul_div
{
	void multiply(double a, double b)
	{
		System.out.println("Product: "+a*b);
	}
	void divide(double x,double y)
	{
		System.out.println("Division: "+a/b);
	}
}
Interface Calculate extends Add_Sub, Mul_div
{
	printResult(double result)
}
class my_calculator implements Calculate 
{
	public void add(double x, double y)
	{
		double res=x+y;
	}
	public void sub(double x,double y)
	{
		double res=x-y;
	}
	public void multiply(double x,double y)
	{
		double res=x*y;
	}
	public void divide(double x,double y)
	{
		double res=x/y;
	}
class mathinterface
{
	public static void main(String args[])
	{
		my_calculator c1= new my_calculator();
		
	}
}