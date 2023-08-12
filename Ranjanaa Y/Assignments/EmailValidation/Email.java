import java.util.*;
import java.util.regex.*; 
public class Email
{
	static boolean flag = false;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email id to validate: ");
		String email = sc.next();
		valEmail(email);
		if(flag == true)
		{
			System.out.println(email+" is valid ");
		}
		else
		{
			System.out.println(email+" is invalid");
		}
	}
	public static boolean valEmail(String s)
	{
	    String exp = "[a-z][a-zA-Z0-9._]+[@][a-z]+[.][a-z]{2,6}";
	    Pattern p = Pattern.compile(exp);
	    Matcher matcher = p.matcher(s);
		flag = matcher.matches();
		return flag;
	}
	
}
