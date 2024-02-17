package Encapsulation;

class login

{
	private String uname;
	private String pwd;

//Setter
	public void setUname(String uname) 
	{
		this.uname = uname;
	}

	public void setpwd(String pwd) 
	{
		this.pwd = pwd;
	}

	//Getter
          public String getuname()
	{
		
		String Reg_uname="kdk56@gmail.com";
		if(uname==Reg_uname)
		{
			return "valid Username";
		}
		else
		{
			return "In-valid Username";
		}
	}
		public String getpwd()
		{
			
			String Reg_pwd="958456899@$";
			if(pwd==Reg_pwd)
			{
				return "valid pasword";
			}
			else
			{
				return "In-valid Pasword";
			}
	}
}
             

               public class userLogin 
               {

	               public static void main(String[] args) 
	               {
 
	            	 login l2 = new login();
	            	 
	            	 l2.setUname("kdk56@gmail.com");
	            	 l2.setpwd("958456899@$");
	            	 
	            	 System.out.println(l2.getuname());
	            	 System.out.println(l2.getpwd());
	            
	                         
	               }

                       }
