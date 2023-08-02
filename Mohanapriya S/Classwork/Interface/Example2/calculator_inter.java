interface calculator
{
default void add(int n1,int n2)
{
System.out.println("The Sum is "+(n1+n2));
mul(n1,n2);
div(n1,n2);
}
default void sub(int n1,int n2)
{
System.out.println("The Difference is "+(n1-n2));
mul(n1,n2);
div(n1,n2);
}
static void mul(int n1,int n2) 
//version not available for private default
{
System.out.println("The product is "+(n1*n2));
}
static void div(int n1,int n2)
{
System.out.println("The quo is "+(n1/n2));
}
}

