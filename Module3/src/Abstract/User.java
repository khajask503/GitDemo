package Abstract;



abstract class calculatore
{
	abstract public  void add(int i,int d);
}

class developer extends calculatore
{

	@Override
	public  void add(int i, int d) 
	{
		System.out.println(i+d);
	}
	
}

public class User 
{

	public static void main(String[] args)
	{
		developer d1 = new developer();
		d1.add(250, 432);

	}

}
