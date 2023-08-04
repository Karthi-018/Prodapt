public class pojoDemo {
    private int eid;
    private String ename;
    private long esalary;

    public pojoDemo(int eid, String ename, long esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public long getEsalary() {
        return esalary;
    }

    public void setEsalary(long esalary) {
        this.esalary = esalary;
    }
}
