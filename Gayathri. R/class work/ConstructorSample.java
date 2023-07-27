package constructor.defaultconstructor;
class constructorSample
{
 int eid;
String eName;
String dest;
long salary;

constructorSample()
{
eid=0;
eName=null;
dest=null;
salary=0;
}
void disEmpDet()
{
System.out.println("emp id:"+eid);
System.out.println("emp name:"+eName);
System.out.println("emp dest:"+dest);
System.out.println("emp salary:"+salary);
}
public static void main(String a[])
{
constructorSample e = new constructorSample();
e.eid=80376;
e.eName="Gayathri.R";
e.dest="Associate Software Engineer";
e.salary=12-000;
e.disEmpDet();
}
}