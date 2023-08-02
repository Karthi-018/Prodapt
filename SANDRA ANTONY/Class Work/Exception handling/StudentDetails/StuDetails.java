// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StuDetails
{
    int sId;
    String sName;
    int sMarks;
    public StuDetails(int sId,String sName,int sMarks)
    {
        this.sId=sId;
        this.sName=sName;
        this.sMarks=sMarks;

    }
    public void setId(int sId)
    {
        this.sId=sId;
    }
    public int getId()
    {
        return sId;
    }
    public void setName(String sName)
    {
        this.sName=sName;
    }
    public String getName()
    {
        return sName;
    }
    public void setMarks(int sMarks)
    {
        this.sMarks=sMarks;
    }
    public int getMarks()
    {
        return sMarks;
    }
    public String toString()
    {
        return sId+" "+sName+" "+sMarks;
    }
}