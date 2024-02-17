package inhrtnce;

class A 
{
	public A()
	{
		System.out.println("A Class Constructore");
	}
}
class B extends A
{
	public B()
	{
		
		super();
		System.out.println("B Class Constructore");
	}
}
public class User 
{

	public static void main(String[] args) 
	{
	B b1 = new B();

	}

}
