class Bank_Login 
{
    void login(String username,String password)
    {
        System.out.println("Logged In sucessfully using USERNAME: "+username+" and PASSWORD: "+password);
    }
    void login(long phonenumber,int otp) 
    {
        System.out.println("Logged In sucessfully using PHONE NUMBER: "+phonenumber+" and OTP: "+otp);
    } 
    void login(String email,int otp) 
    {
        System.out.println("Logged In sucessfully using EMAIL-ID: "+email+" and OTP: "+otp);
    }
}
class Bank
{
	public static void main(String[] args) 
	{
		Bank_Login object=new Bank_Login(); 

                System.out.println("USING USERNAME AND PASSWORD");
                object.login("raghavi","gta24$"); 
                System.out.println("--------------------------------------------------");	
	        
                System.out.println("USING PHONE NUMBER AND OTP");
		object.login(890253544,567456);
                System.out.println("--------------------------------------------------");

                System.out.println("USING EMAIL-ID AND OTP");		
                object.login("ragz@yahoo.com",967456);
                System.out.println("--------------------------------------------------");
	}
}
