interface A
{
	void m1();
	void m2();
}
interface B extends A
{
	void m3();
}
class interfacetest implements B
{
	public void m1()
	{
		System.out.println("Method 1");
	}
	public void m2()
	{
		System.out.println("Method 2");
	}
	public void m3()
	{
		System.out.println("Method 3");
	}