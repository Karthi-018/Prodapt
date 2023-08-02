public class Student {
    private int sid;
    private String sName;
    private int marks;

    Student(int sid, String sName, int marks)
    {
        this.sid=sid;
        this.sName=sName;
        this.marks=marks;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public int getSid() {
        return sid;
    }

    public String getsName() {
        return sName;
    }

    public int getMarks() {
        return marks;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", marks=" + marks +
                '}';
    }
}
