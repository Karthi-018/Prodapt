package telephonedirectory;

public class TelephoneDirectory {
    private String name;
    private long phNumber;

    TelephoneDirectory(String name,long phNumber)
    {
        this.name=name;
        this.phNumber= phNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhNumber() {
        return phNumber;
    }

    public void setPhNumber(long phNumber) {
        this.phNumber = phNumber;
    }

    @Override
    public String toString() {
        return "TelephoneDirectory{" +
                "name='" + name + '\'' +
                ", phNumber=" + phNumber +
                '}';
    }
}
