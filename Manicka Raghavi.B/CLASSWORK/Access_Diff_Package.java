package anotheraccess;
class Access_Diff_Package 
{
    public static void main(String[] args) 
	{
	    Access ob=new Access();
	    System.out.println(ob.publicstr);
	    System.out.println(ob.privatestr);
	    System.out.println(ob.defaultstr);
	    System.out.println(ob.protectedstr);
	}
}