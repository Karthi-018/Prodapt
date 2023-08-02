class Stu
{
    private int sid;
    private String sname;
    private int mark;

    Stu(int sid,String sname,int mark)
    {
        this.sid=sid;
        this.sname=sname;
        this.mark=mark;
    }

    int getsid()
    {
        return sid;
    }

    String getsname()
    {
        return sname;
    }

    int getmark()
    {
        return mark;
    }

    void setsid(int sid)
    {
        this.sid=sid;
    }

    void setname(String sname)
    {
        this.sname=sname;
    }

    void setmark(int mark)
    {
        this.mark=mark;
    }

    public String toString()
    {
        return sid +" "+ sname +" "+ mark;
    }
}