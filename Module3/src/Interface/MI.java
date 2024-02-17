package Interface;


interface A
{
	public void p1();
}
interface B
{
	public void p2();
}

class c implements A,B
{

	@Override
	public void p2() 
	{
		
		System.out.println("The M1 Method");
	}

	@Override
	public void p1()
	{
		System.out.println("The M2 Method");
	}
	
}
public class MI
{

	public static void main(String[] args)
	{
		c lt = new c();
		lt.p1();
		lt.p2();

	}

}
