package Abstract;


abstract class RBi
{
	abstract public void miNBal();
	abstract public void ROIt();
}
 abstract class SbI extends RBi
{

	 String a ="6%";
	 int i=4000;
	@Override
	public void miNBal() 
	{
		System.out.println("Minimum Balance is :"+ i);
		
	}

	@Override
	public void ROIt() 
	{
		System.out.println("Rate of Intrest is :"+ a);
		
	}
	
}

 class SBH  extends SbI
 {
	 String c="www.adhar.com";
	 
	 public void adhar()
	 {
		 System.out.println("Adhar Updation link is :"+ c);
	 }
 }
public class Cust2
{

	public static void main(String[] args) 
	{
	
		SBH h1 = new SBH();
		h1.adhar();
		h1.ROIt();
		h1.miNBal();

	}

}
