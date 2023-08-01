public class Student{
    private int sid;
    private String sName;
    private int sMark;

    public Student(int sid,String sName,int sMark) {
        this.sid = sid;
        this.sName = sName;
        this.sMark = sMark;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsMark() {
        return sMark;
    }

    public void setsMark(int sMark) {
        this.sMark = sMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sName='" + sName + '\'' +
                ", sMark=" + sMark +
                '}';
    }
}
