class Demo<T>
{
	T num;
	Demo(T x)
	{
		num=x;
	}
	T printValue()
	{
		return num;
	}
}
class GenericClassDemo
{
	public static void main(String[] args)
	{
	Demo<Integer>obj1=new Demo<Integer>(23);
	System.out.println(obj1.printValue());
	
	Demo<String>obj2=new Demo<String>("JAVA");
	System.out.println(obj2.printValue());
	}
}