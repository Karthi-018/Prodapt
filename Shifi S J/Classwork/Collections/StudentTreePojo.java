public class StudentTreePojo {

    private int sid;
    private String sname;
    private int marks;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(int sid, String sname, int marks) {
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", marks=" + marks +
                '}';
    }
}
