public class StudentDetails{
    int sid;
    String sname;
    int marks;

    public StudentDetails(int sid, String sname, int marks) {
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
    }

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

    @Override
    public String toString() {
        return "StudentDetails{" +
                "StudentId : " + sid +
                " StudentName : " + sname + 
                " StudentMarks : " + marks +
                "}";
    }


    }
