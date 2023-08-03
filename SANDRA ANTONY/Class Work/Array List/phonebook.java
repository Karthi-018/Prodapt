package phone.org;

public class phonebook
{
    String phNo;
    String name;

    public phonebook(String name, String phNo)
    {
        this.phNo = phNo;
        this.name = name;
    }

    public String getPhNo() {
        return phNo;
    }

    public void setPhNo(String phNo)
    {
        this.phNo = phNo;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "phone.org.phonebook{" +
                "phNo='" + phNo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
