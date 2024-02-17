package Interface;


interface   Atm
{
	public void deposit();
	public void withDrwal();
	public void  MiniStmnt();
}
abstract class icic implements Atm
{

	@Override
	public void deposit() 
	{
		 System.out.println("User can deposit Upto 30K per day");
		
	}

	@Override
	public void withDrwal() 
	{
		System.out.println("Withdrawl limit is 65k per day");
		
	}
}
	class icic2 extends  icic
	{
	@Override
	public void MiniStmnt() 
	{
		
		System.out.println("Last transaction is 5k at evng of 5th june");
	}
	
          }



public class cussty
{

	public static void main(String[] args) 
	{
		icic2 i2 = new icic2();
		i2.deposit();
		i2.MiniStmnt();
		i2.withDrwal();
	}
}
