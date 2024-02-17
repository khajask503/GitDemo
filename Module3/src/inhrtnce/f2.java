package inhrtnce;

class doge
{
	public void eat()
	{
		System.out.println(" Dog Barks");
	}
}
class cate 
{
	public void eat()
	{
		System.out.println("All Aniamls eat");
	}
}
class Animals extends cat
{
	public void sold()
	{
		System.out.println("All Aniamls eat");
	}
}

public class f2 
{

	public static void main(String[] args)
	{
		Animals d = new Animals();
          d.Eat();
	}

}
