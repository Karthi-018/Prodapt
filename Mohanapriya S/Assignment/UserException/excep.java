class excep
{
private int eid;
private String ename;
private int emarks;

excep(int id,String name,int marks)
{
    eid=id;
    ename=name;
    emarks=marks;
}

public void seteid(int id)
{
eid=id;
}
public int geteid()
{
return eid;
}

public void setename(String name)
{
ename=name;
}
public String getename()
{
return ename;
}

public void setemarks(int marks)
{
emarks=marks;
}
public int getemarks()
{
return emarks;
}

public String toString()
{
return eid +ename +emarks;
}
}