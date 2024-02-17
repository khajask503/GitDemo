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
		System.out.println("Arrange Marriage");

		System.out.println("Arrange Marriage");

		System.out.println("Arrange Marriage");

		
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
		System.out.println("Love Marriage");

		System.out.println("Love Marriage");

		System.out.println("Love Marriage");

		
	}

}
