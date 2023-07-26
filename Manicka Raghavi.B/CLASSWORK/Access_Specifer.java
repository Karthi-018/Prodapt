package acess;

class Access_Specifer
{
    public String publicstr="public";
    private String privatestr="private";
    String defaultstr="default";
    protected String protectedstr="protected";
    
	public static void main(String[] args) 
	{
	    Access ob=new Access();
	    System.out.println(ob.publicstr);
	    System.out.println(ob.privatestr);
	    System.out.println(ob.defaultstr);
	    System.out.println(ob.protectedstr);
	}
}
