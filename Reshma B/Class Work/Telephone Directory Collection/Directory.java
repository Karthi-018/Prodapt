package org.example.collections;

public class Directory{

    private int Pnum;
    private String Pname;

    public Directory(int Pnum, String Pname) {
        this.Pnum = Pnum;
        this.Pname=Pname;
    }

    public void setPnum(int Pnum)
    {
        this.Pnum=Pnum;
    }

    public int getPnum()
    {
        return Pnum;
    }

    public void setPname(String Pname)
    {
        this.Pname=Pname;
    }

    public String getPname()
    {
        return Pname;
    }

    public String toString()
    {
        return "Directory[Phone Number: " + Pnum + ", Name: " + Pname + "]";
    }
}
