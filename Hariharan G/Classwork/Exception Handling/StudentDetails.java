import java.util.*;
class StudentDetails
{
private int stuId;
private String stuName;
private long marks;
StudentDetails()
{}
StudentDetails(int id,String name,long marks)
{
this.stuId=id;
this.stuName=name;
this.marks=marks;
}


public void setId(int id)
{
this.stuId=id;
}
public int getId()
{
return stuId;
}

public void setName(String name)
{
this.stuName=name;
}
public String getName()
{
return stuName;
}

public void setMarks(long marks)
{
this.marks=marks;
}
public long getMarks()
{
return marks;
}

public String toString()
{
return stuId+" "+stuName+" "+marks; 
} 

}