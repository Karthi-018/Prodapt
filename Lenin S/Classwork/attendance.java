class attendancereg
{
void markattend()
{
		System.out.println("Mass-Bunk");
}
void markattend(String...s)
{
		System.out.println(s.length+" "+"student present");
for(String name:s)
{
	        System.out.println(name);
}
}

public static void main(String a[])
{
	     attendancereg obj=new attendancereg();

	     obj.markattend();

	     obj.markattend("lenin","john","Phil");
}
}
