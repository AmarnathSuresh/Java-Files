class Shape
{
    double d1, d2;
    Shape(double d1, double d2)
	{
        this.d1=d1;
        this.d2=d2;
    }
    double area()
	{
        return 0;
    }
}
class Rectangle extends Shape
{
    Rectangle(double d1, double d2)
	{
        super(d1, d2);
    }
    double area()
	{
        return d1*d2;
    }
}

class Triangle extends Shape
{
    Triangle(double d1, double d2)
	{
        super(d1, d2);
    }

    double area()
	{
        return 0.5*d1*d2;
    }
}

public class ShapeMain
{
    public static void main(String[] args)
	{
        Rectangle rec=new Rectangle(5.0, 10.0);
        Triangle tri=new Triangle(8.0, 6.0);
        System.out.println("Area of rectangle: "+rec.area());
        System.out.println("Area of triangle: "+tri.area());
    }
}
