class StudentPojo extends Exception
{
private int Stu_id;
private int Stu_mark;
private String Stu_name;
StudentPojo(int searchid)
{
    System.out.println(searchid+"Searching student is not found");
}

StudentPojo(int id,int mark,String name)
{
Stu_id=id;
Stu_mark=mark;
Stu_name=name;
}

void setStu_id(int id)
{
Stu_id=id;
}
int getStu_id()
{
return Stu_id;
}
void setStu_mark(int mark)
{
Stu_mark=mark;
}
int getStu_mark()
{
return Stu_mark;
}
void setStu_name(String name)
{
Stu_name=name;
}
String getStu_name()
{
return Stu_name;
}
public String toString()
{
    return Stu_id+" "+Stu_name+" "+Stu_mark;
}
}