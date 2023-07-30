import java.util.Scanner;

public class Server {
    private int  eid;
    private Double esalary;


    public Server(int eid, String ename, double esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    private String ename;





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
    public Double getEsalary() {
        return esalary;
    }

    public void setEsalary(Double esalary) {
        this.esalary = esalary;
    }




}
