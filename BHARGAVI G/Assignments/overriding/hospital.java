class ward
{
public void admitpatient()
{
	System.out.println("Admitting a patient in hospital");
}
}
class ICUward extends ward
{
public void admitpatient()
{
	System.out.println("Admitting a patient in ICU");
}
}

class pediatricward extends ward
{
public void admitpatient()
{
	System.out.println("Admitting a child in pediatrician");


}
}
public class hospital
{
public static void main(String args[])
{
ward w=new ward();
w.admitpatient();
ICUward i=new ICUward();
i.admitpatient();
pediatricward p=new pediatricward();
p.admitpatient();
}
}
