package inhrtnce;

class Av
{
	public Av()
	{
		
		System.out.println("A Class Constructore");
	}
	
	
}
class Bv extends Av
{
	public Bv()
	{
		//super();
		System.out.println("B Class Constructore");
	}
}
class Cv extends Bv
{
	public Cv()
	{
		super();
		//System.out.println("C Class Constructore");
	}
}

public class Userd {

	public static void main(String[] args)
	{
		Cv b1 = new Cv();
	}

}
