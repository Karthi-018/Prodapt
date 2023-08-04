public class Direc {
    private String Name;
    private long PhNo;

    public Direc(String name, long phNo) {
        Name = name;
        PhNo = phNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getPhNo() {
        return PhNo;
    }

    public void setPhNo(long phNo) {
        PhNo = phNo;
    }

    @Override
    public String toString() {
        return "Direc{" +
                "Name='" + Name + '\'' +
                ", PhNo=" + PhNo +
                '}';
    }
}
