package inhrtnce;


class Animal
{
	public void Eat()
	{
		System.out.println("All Animals EaT");
	}
}
class dog extends Animal
{
	public void bark()
	{
		System.out.println("All Dog Barks");
	}
}
class cat extends Animal
{
	public void meow()
	{
		System.out.println("All Cats Meow");
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
	}
}

public class Forest 
{

	public static void main(String[] args) 
	{
		dog d1 = new dog();
		d1.bark();
		d1.Eat();
		
		cat c1 = new cat();
		c1.meow();
		c1.Eat();
	}

}
