class Box
{
	double width;
	double height;
	double depth;
	Box()
	{
		width=-1;
		height=-1;
		depth=-1;
	}
	Box(double a, double b, double c)
	{
		widht=a;
		height=b;
		depth=c;
	}
	Box(double x)
	{
		width=height=depth=x;
	}
	Box(Box ob)
	{
		width=ob.width;
		height=ob.height;
		depth=ob.depth;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class boxweight
{
	double weight;
	boxweight(double a, double b, double c, double d)
	{
		widht=a;
		height=b;
		depth=c;
		weight=d;
	}
}
class boxcolor
{
	string color;
	boxcolor(double a, double b, double c, string d)
	{
		width=a;
		height=b;
		depth=c;
		color=d;
	}
}
class boxshipment
{
	double loot;
	boxshipment(double a, double c, double d, double e)
	{
		width=a;
		height=b;
		depth=c;
		weight=d;
		loot=e;
	}
}
class volumeweightcolor
{
	public static void main(String args[])
	{
		Box obj1=new Box(3.5,7.5,2.2);
		System.out.println(obj1.volume());
		System .out.println();
		boxweight obj2=new boxweight(1.2,4.6,1.1,56.8);
		System.out.println("Volume: "+obj2.volume());
		System.out.println("Weight: "+obj2.weight());
		System .out.println();
		boxcolor obj3=new boxcolor(3.7,2.5,3.1,"Red");
		System.out.println("Volume: "+obj3.volume());
		System.out.println("Color: "+obj3.color());
		System .out.println();
		boxshipment obj4=new boxshipment(3.7,2.5,3.1,2.4,5.6);
		System.out.println("Weight: "+obj4.weight());
		System.out.println("Shipment: "+obj4.loot());
	}
}