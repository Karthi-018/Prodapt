package Collections;

public class TelePhneDirecClass {
    long phn_no;
    String name;

    public long getPhn_no() {
        return phn_no;
    }

    public TelePhneDirecClass( String name,long phn_no) {
        this.phn_no = phn_no;
        this.name = name;
    }

    public void setPhn_no(long phn_no) {
        this.phn_no = phn_no;
    }

    @Override
    public String toString() {
        return "Detail [" +
                "phn_no : " + phn_no +
                " name :" + name + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
