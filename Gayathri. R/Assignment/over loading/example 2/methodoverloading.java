class methodoverloading
{
public void fridge()
{
System.out.println("old model fridge");
}
public void fridge(int warrenty,String doormodel)
{
System.out.println("this fridge model have warrenty of "+warrenty+" " +"years and door model of "+" "+doormodel);
}
public void fridge(String doormodel,int warrenty, String freezeroptions)
{
System.out.println("this fridge model have warrenty of "+warrenty+" " +"years and door model of "+" "+doormodel+" "+"Additional freezer options is "+" "+freezeroptions);
}

public static void main(String a[])
{
methodoverloading o=new methodoverloading();
o.fridge();
o.fridge(3,"double door");
o.fridge("double door",5,"double way freezer options");
}
}