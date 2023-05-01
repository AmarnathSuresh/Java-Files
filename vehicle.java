//Create an interface vehicle with 3 methods: void GearChange(int x), void SpeedIncrease(int x), void Breaks(int x).
//Implement this interface vehicle in the class bicycle, bike and car.
//You can create your own data members and member functions for each class

import java.io.*;
interface vehicle
{
	void GearChange(int x);
	void SpeedIncrease(int y);
	void Breaks();
}
class bicycle implements vehicle
{
	int speed,gear;
	public void GearChange(int a)
	{
		gear=a;
	}
	public void SpeedIncrease(int a)
	{
		speed=speed+a;
	}
	public void Breaks(int a)
	{
		speed=speed-a;
	}
	void display()
	{
		System.out.println("Gear: "+gear+" Speed: "+speed");
}
class bike implements vehicle
{
	int speed,gear;
	public void GearChange(int b)
	{
		gear=b;
	}
	public void SpeedIncrease(int b)
	{
		speed=speed+b;
	}
	public void Breaks(int b)
	{
		speed=speed-b;
	}
	void display()
	{
		System.out.println("Gear: "+gear+" Speed: "+speed");
	}
}
class car implements vehicle
{
	int speed,gear;
	public void GearChange(int c)
	{
		gear=c;
	}
	public void SpeedIncrease(int c)
	{
		speed=speed+c;
	}
	public void Breaks(int c
	{
		speed=speed-c;
	}
	void display()
	{
		System.out.println("Gear: "+gear+" Speed: "+speed");
	}
	public static void main(String args[])
	{
		bicycle bic=new bicycle();
		
		System.out.println("Bicycle");
		bic.GearChange(4);
		bic.SpeedIncrease(30);
		bic.breaks(10);
		bic.display();
		
		bike bik=new bike();
		
		System.out.println("Bike");
		bic.GearChange(3);
		bic.SpeedIncrease(100);
		bic.breaks(30);
		bic.display();
		
		car=new car();
		System.out.println("Car");
		bic.GearChange(5);
		bic.SpeedIncrease(100);
		bic.breaks(20);
		bic.display();
	}
}