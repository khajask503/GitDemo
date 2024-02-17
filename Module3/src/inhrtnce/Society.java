package inhrtnce;
class parents
{
	public void marriage()
	{
		System.out.println("Arrange Marriage");
	}
}
class son extends parents
{
	public void marriage()
	{
		System.out.println("Love Marriage");
	}
	public void friends()
	{
		marriage();
	super.marriage();
	}
}
public class Society
{

	public static void main(String[] args) 
	{
		son c1 = new son();
        c1.friends();
	}

}
