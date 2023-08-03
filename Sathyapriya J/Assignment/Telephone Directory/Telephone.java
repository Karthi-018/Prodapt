public class Telephone
{
    String name;
    String phn;

    Telephone(String name, String phn)
    {
        this.name =  name;
        this.phn = phn;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }
    public String toString()
    {
        return "Name : "+name+" Phone Number : "+phn;
    }



}


