class Student_details{
    private int sid;
    private String sname;
    private int smarks;

    public Student_details(int sid, String sname, int smarks) {
        this.sid = sid;
        this.sname = sname;
        this.smarks = smarks;
    }

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public int getSmarks() {
        return smarks;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSmarks(int smarks) {
        this.smarks = smarks;
    }
    @Override
    public String toString() {
        return "Student_details{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", smarks=" + smarks +
                '}';
    }
}